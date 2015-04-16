package no.sismo.oter.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.cxf.binding.soap.interceptor.SoapHeaderInterceptor;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.Conduit;
import org.apache.cxf.ws.addressing.EndpointReferenceType;





public class BasicAuthInterceptor extends
        SoapHeaderInterceptor {
    private Properties prop;
    @Override
    public void handleMessage(Message message) throws Fault {

        this.prop = new Properties();
        InputStream input = null;

        try {

            //input = new FileInputStream("config.properties");
            //input = this.getClass().getResourceAsStream("config.properties");
            URL url = ClassLoader.getSystemResource("config.properties");
            prop.load(url.openStream());

            // load a properties file
            //prop.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        final String username = prop.getProperty("username");
        final String password = prop.getProperty("password");
        /*
        AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);


        // If the policy is not set, the user did not specify credentials.
        // 401 is sent to the client to indicate that authentication is required.
        if (policy == null) {
            sendErrorResponse(message, HttpURLConnection.HTTP_UNAUTHORIZED);
            return;
        }

        String username = policy.getUserName();
        String password = policy.getPassword();
        */



        // CHECK USERNAME AND PASSWORD
        if (!checkLogin(username,password)) {
            System.out.println("handleMessage: Invalid username or password for user: " + username);
            sendErrorResponse(message, HttpURLConnection.HTTP_FORBIDDEN);
        }
    }

    private boolean checkLogin(String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }

    private void sendErrorResponse(Message message, int responseCode) {
        Message outMessage = getOutMessage(message);
        outMessage.put(Message.RESPONSE_CODE, responseCode);

        // Set the response headers
        @SuppressWarnings("unchecked")
        Map<String, List<String>> responseHeaders =  (Map<String, List<String>>)    message.get(Message.PROTOCOL_HEADERS);

        if (responseHeaders != null) {
            responseHeaders.put("WWW-Authenticate", Arrays.asList(new String[] { "Basic realm=realm" }));
            responseHeaders.put("Content-Length", Arrays.asList(new String[] { "0" }));
        }
        message.getInterceptorChain().abort();
        try {
            getConduit(message).prepare(outMessage);
            close(outMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Message getOutMessage(Message inMessage) {
        Exchange exchange = inMessage.getExchange();
        Message outMessage = exchange.getOutMessage();
        if (outMessage == null) {
            Endpoint endpoint = exchange.get(Endpoint.class);
            outMessage = endpoint.getBinding().createMessage();
            exchange.setOutMessage(outMessage);
        }
        outMessage.putAll(inMessage);
        return outMessage;
    }

    private Conduit getConduit(Message inMessage) throws IOException {
        Exchange exchange = inMessage.getExchange();
        EndpointReferenceType target = exchange.get(EndpointReferenceType.class);
        Conduit conduit = exchange.getDestination().getBackChannel(inMessage, null, target);
        exchange.setConduit(conduit);
        return conduit;
    }

    private void close(Message outMessage) throws IOException {
        OutputStream os = outMessage.getContent(OutputStream.class);
        os.flush();
        os.close();
    }

}
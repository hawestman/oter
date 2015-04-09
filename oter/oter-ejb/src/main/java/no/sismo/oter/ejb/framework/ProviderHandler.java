package no.sismo.oter.ejb.framework;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;


import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.options.addpluginsfrom.OptionReportAfter;
import net.xeoh.plugins.base.options.getplugin.OptionCapabilities;

import no.sismo.oter.ejb.dao.ResponseDataDAO;
import no.sismo.oter.ejb.model.StorageHandler;

import no.sismo.oter.utility.ProviderPlugin;
import no.sismo.oter.utility.RequestParameterDAO;

/**
 * Created by hwestman on 17.02.2015.
 */
public class ProviderHandler {

    private PluginManager pm;


    /**
     * Creates a providerhandler where it first up classloads a provider from a given directory
     * @param provider
     */
    public ProviderHandler(String provider){

        pm = PluginManagerFactory.createPluginManager();
        pm.addPluginsFrom(new File("providerPlugins/").toURI(), new OptionReportAfter());
            //pm.addPluginsFrom(new URI("classpath://no.sismo.oter.ejb.providers.impl."+provider));

    }

    /**
     * Handles a request to a registered provider
     * @param requestParameter
     * @return
     */
    public ResponseDataDAO handleRequest(RequestParameterDAO requestParameter){

    	ResponseDataDAO responseData= new ResponseDataDAO(requestParameter);
        ProviderPlugin plugin = pm.getPlugin(ProviderPlugin.class,new OptionCapabilities("provider:"+requestParameter.getProvider()));
        HashMap<String,String> numberIdListData;
        boolean useDBInstead = false;
        StorageHandler storageHandler = new StorageHandler();

        if(plugin != null){
            try{

                plugin.setRequestParameter(requestParameter);
                Thread t = new Thread(plugin);
                t.start();
                t.join(10000);
                if(plugin.isFinished()){
                    numberIdListData = plugin.getResult();
                    responseData.setDataByNumberId(numberIdListData);
                    storageHandler.insertDataFromProvider(responseData);
                    System.out.println("webservice completed, fresh results should be delivered");
                }else{
                    throw new Exception("Webservice not completed, go for backup");
                }


            }catch (Exception e){
                System.out.println("Messages should come here");
                System.out.println(e.getMessage());
                //Couldnt perform webservicecall or couldnt insert data
                //TODO Figue out
                e.printStackTrace();
                useDBInstead = true;
            }
        }else{
            System.out.println("using database cause no plugins");
            useDBInstead = true;
            //No such plugin exists, should we just check db or is it fatal?
            //TODO Figue out
        }

        if(useDBInstead){
            numberIdListData = storageHandler.getDataFromProviderStorage(requestParameter);
            responseData.setDataByNumberId(numberIdListData);
        }

        return responseData;
    }
}

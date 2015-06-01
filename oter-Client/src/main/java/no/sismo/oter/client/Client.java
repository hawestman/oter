package no.sismo.oter.client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.WebServiceRef;

import no.sismo.oter.ejb.webservice.Exception_Exception;
import no.sismo.oter.ejb.webservice.ProviderDataService;
import no.sismo.oter.ejb.webservice.ProviderDataServiceImplService;
import no.sismo.oter.ejb.webservice.ResponseDataDAO;

public class Client {

	@WebServiceRef(wsdlLocation = "http://localhost:8080/oter-ejb-0.0.1-SNAPSHOT/ProviderDataService?wsdl")
	private static ProviderDataServiceImplService providerDataServic;
	private static ProviderDataService providerDataServicePort;

	public static void main(String[] args) {

		long timepassed = 0;

		List<String> numberIdList = new ArrayList<String>();

		numberIdList.add("28017025378");
		numberIdList.add("28045937323");

		no.sismo.oter.client.RequestParameterDAO requestParameter = new no.sismo.oter.client.RequestParameterDAO();

		requestParameter.setProvider("Kartverket");
		requestParameter.setService("hentEiendom");
		requestParameter.setConsumer("Sivert");
		requestParameter.setNumberIdList(numberIdList);

		timepassed = System.currentTimeMillis();

		providerDataServic = new ProviderDataServiceImplService();

		providerDataServicePort = providerDataServic
				.getProviderDataServicePort();

		ResponseDataDAO responceDataDAOService = new ResponseDataDAO();
		try {

			responceDataDAOService = providerDataServicePort
					.getProviderDataById(requestParameter.getProvider(),
							requestParameter.getService(),
							requestParameter.getConsumer(),
							requestParameter.getNumberIdList(), true);


			System.out.println("providerDataServic: "
					+ (System.currentTimeMillis() - timepassed));

		} catch (Exception_Exception e) {

			e.printStackTrace();
		}
		
		for (int i = 0; i < responceDataDAOService.getDataByNumberId().getEntry()
				.size(); i++) {

			System.out.println(responceDataDAOService.getDataByNumberId()
							.getEntry().get(i).getValue());

		}

	}

//	private static String formatXML(ResponseDataDAO responceDataDAO) {
//
//		String xml = "";
//
//		for (int i = 0; i < responceDataDAO.getDataByNumberId().getEntry()
//				.size(); i++) {
//
//			xml = xml
//					+ removeXMLDeclaration(responceDataDAO.getDataByNumberId()
//							.getEntry().get(i).getValue());
//
//		}
//
//		xml = "<personMedEiendomList>" + xml + "</personMedEiendomList>";
//
//		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
//				+ xml;
//	}
//
//	private static String removeXMLDeclaration(String xmlString) {
//		if (xmlString != null && xmlString.startsWith("<?xml")) {
//			int firstElement = xmlString.indexOf("<", 1);
//			return xmlString.substring(firstElement);
//		} else {
//			return xmlString;
//		}
//	}

}

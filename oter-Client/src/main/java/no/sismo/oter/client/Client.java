package no.sismo.oter.client;

import java.util.ArrayList;
import java.util.HashMap;
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
		
		resourceHandler rh = new resourceHandler();
		
		numberIdList = rh.getIdentsFromFile("NEW_SIVERT_UT_identer_1.csv.149");

		//numberIdList.add("28017025378");
		//numberIdList.add("28045937323");
		/*numberIdList.add("812598082");
		numberIdList.add("886793332");
		numberIdList.add("887903522");
		numberIdList.add("911573032");
		numberIdList.add("911656760");
		numberIdList.add("912372855");
		numberIdList.add("912375730");
		numberIdList.add("912546411");
		numberIdList.add("912900185");
		numberIdList.add("913286960");
		numberIdList.add("913287479");
		numberIdList.add("913484894");
		numberIdList.add("913486900");
		numberIdList.add("914006201");
		numberIdList.add("914803802");
		numberIdList.add("926701584");
		numberIdList.add("940308895");
		numberIdList.add("943049467");
		numberIdList.add("943250073");
		numberIdList.add("944775692");
		numberIdList.add("947251392");
		numberIdList.add("948327872");
		numberIdList.add("959646821");
		numberIdList.add("962035574");
		numberIdList.add("962077536");
		numberIdList.add("963746016");
		numberIdList.add("964137773");
		numberIdList.add("969132699");
		numberIdList.add("971590696");
		*/
		
		//27mai
		//numberIdList.add("26086932880");
		//numberIdList.add("895451932");
		
		//6.jan
		//numberIdList.add("829846462");

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
							requestParameter.getNumberIdList(), false);


			System.out.println("providerDataServic: "
					+ (System.currentTimeMillis() - timepassed));

		} catch (Exception_Exception e) {

			e.printStackTrace();
		}
		//HashMap<String,String> dataByNumberId = responceDataDAOService.getDataByNumberId();
		
		for (int i = 0; i < responceDataDAOService.getDataByNumberId().getEntry().size(); i++) {

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

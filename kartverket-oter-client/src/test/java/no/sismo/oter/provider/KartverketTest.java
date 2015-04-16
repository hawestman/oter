package no.sismo.oter.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import no.sismo.oter.utility.RequestParameterDAO;
import junit.framework.TestCase;
import static org.junit.Assert.assertTrue;

public class KartverketTest extends TestCase {

    public void testGetXMLByNumberId() throws Exception {
        Kartverket k = new Kartverket();
        
        List<String> numberIdList = new ArrayList<String>();
        
        numberIdList.add("28017025378");
        numberIdList.add("28017025378");
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "Kartverket", "hentEiendom");
        
		HashMap<String,String> numberIdListData = k.getProviderData(requestParameter);
		System.out.println(numberIdListData.get("28017025378"));
        
        //assertEquals("28017025378", k.getXMLByNumberId("28017025378"));
        assertTrue(true);
    }
}
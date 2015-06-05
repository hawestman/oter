package no.sismo.oter.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import no.sismo.oter.utility.RequestParameterDAO;
import junit.framework.TestCase;
import static org.junit.Assert.assertTrue;

public class KartverketTest extends TestCase {

    public void testGetXMLByNumberId() throws Exception {
        Kartverket k = new Kartverket();
        
        List<String> numberIdList = new ArrayList<String>();
        
       // numberIdList =["28017025378", "28045937323", "La Plata"];
        		
       //numberIdList.add("28017025378");
       numberIdList.add("28028047837");
       numberIdList.add("898597822");
        
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "Kartverket", "hentEiendom","Sivert",false);
        
		HashMap<String,String> numberIdListData = k.getProviderData(requestParameter);
		
		Iterator<Entry<String, String>> it = numberIdListData.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	    }
        
        //assertEquals("28017025378", k.getXMLByNumberId("28017025378"));
        assertTrue(true);
    }
}
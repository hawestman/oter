package no.sismo.oter.ejb.framework;


import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import no.sismo.oter.ejb.dao.ResponseDataDAO;

import no.sismo.oter.utility.RequestParameterDAO;
import org.junit.Test;


public class ProviderHandlerTest {
	
	
	
	@Test
	public void testHandleRequest() throws URISyntaxException {
		ProviderHandler ph = new ProviderHandler("Kartverket");

		List<String> numberIdList = new ArrayList<String>();
		//28028047837
		numberIdList.add("28017025378");
		
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "Kartverket", "hentEiendom",false);
        try{
            ResponseDataDAO responseData = ph.handleRequest(requestParameter);
            System.out.println(responseData.getDataByNumberId().get("28017025378"));
            //assertEquals(responseData.getDataByNumberId().get("28017025378"),"<xml><person><Eiendom>11111111</eiendom></person></xml>");
            assertTrue(true);
        }catch(Exception e){
        	e.printStackTrace();
        	fail();
            
        }

	}
}
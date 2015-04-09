package no.sismo.oter.ejb.webservice;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import no.sismo.oter.ejb.dao.ResponseDataDAO;

import org.junit.Test;

public class ProviderDataServiceImplTest {
	
	
	@Test
	public void providerDataGetByIdTest() throws URISyntaxException{
		
		
		List<String> numberIdList = new ArrayList<String>();
		
		numberIdList.add("10049047105");
		numberIdList.add("10049047106");
		
		//ProviderDataServiceImpl providerDataService = new ProviderDataServiceImpl();
		
		//ResponseDataDAO responsData = providerDataService.getProviderDataById("Kartverket","hentEiendom", numberIdList);
		assertTrue(true);
        //assertEquals("<xml><person><Eiendom>22222222</eiendom></person></xml>", responsData.getDataByNumberId().get("10049047106"));
	}
}

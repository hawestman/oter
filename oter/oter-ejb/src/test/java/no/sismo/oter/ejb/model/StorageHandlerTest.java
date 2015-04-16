package no.sismo.oter.ejb.model;

import static org.junit.Assert.*;

import no.sismo.oter.ejb.dao.ResponseDataDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import no.sismo.oter.utility.RequestParameterDAO;
import org.junit.Test;

public class StorageHandlerTest {
	
	
	@Test
	public void testInsertDataFromProvider() {
		StorageHandler sh = new StorageHandler();
		
		HashMap<String, String> hm =new HashMap<String,String>();
		
		hm.put("10049047105", "<xml><person><Eiendom>11111111</eiendom></person></xml>");
		hm.put("10049047106", "<xml><person><Eiendom>22222222</eiendom></person></xml>");
		hm.put("10049047107", "<xml><person><Eiendom>33333333</eiendom></person></xml>");
		
		List<String> numberIdList = new ArrayList<String>();
		
		numberIdList.add("10049047105");
		numberIdList.add("10049047106");
		numberIdList.add("10049047107");
		
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "kartverket", "hentEiendom",false);
		ResponseDataDAO responseData = new ResponseDataDAO(requestParameter);
		responseData.setDataByNumberId(hm);
		
		Boolean result = sh.insertDataFromProvider(responseData); 
		sh.closeConnection();
		
		assertTrue(result);
	}

	@Test
	public void testGetDataFromProvider() {
		
		this.testInsertDataFromProvider();
		
		StorageHandler sh = new StorageHandler();
		
		List<String> numberIdList = new ArrayList<String>();
		
		numberIdList.add("10049047105");
		numberIdList.add("10049047106");
		numberIdList.add("10049047107");
		
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "kartverket", "hentEiendom",false);
		HashMap<String,String> hm = sh.getDataFromProviderStorage(requestParameter);
		sh.closeConnection();
		
		assertEquals("<xml><person><Eiendom>11111111</eiendom></person></xml>",hm.get("10049047105"));
	}
	@Test
	public void testNumberIDNotFound() {
StorageHandler sh = new StorageHandler();
		
		this.testInsertDataFromProvider();

		List<String> numberIdList = new ArrayList<String>();
		
		numberIdList.add("00000000000");//should not exist
		numberIdList.add("10049047107");//Should exist
		
		RequestParameterDAO requestParameter = new RequestParameterDAO(numberIdList, "kartverket", "hentEiendom",false);
		HashMap<String,String> hm = sh.getDataFromProviderStorage(requestParameter);
		sh.closeConnection();
		assertEquals("<xml><person><Eiendom>33333333</eiendom></person></xml>",hm.get("10049047107"));
		
	}
	

}
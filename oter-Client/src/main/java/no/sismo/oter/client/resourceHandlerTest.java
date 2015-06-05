package no.sismo.oter.client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class resourceHandlerTest {

	@Test
	public void test() {

		resourceHandler rh = new resourceHandler();
		List<String> numberIdList = rh.getIdentsFromFile("NEW_SIVERT_UT_identer_1.csv.149");
		
		System.out.println(numberIdList.size());
		
		if(numberIdList.size() <= 0){
			fail();
		}
		
		
	}

}

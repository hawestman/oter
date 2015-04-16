package no.sismo.oter.ejb.model;

import java.util.HashMap;
import java.util.Map;

import no.sismo.oter.ejb.dao.ResponseDataDAO;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import no.sismo.oter.utility.RequestParameterDAO;

public class StorageHandler {
	
	Cluster cluster;
	Session session;
	
	public StorageHandler() {
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("oter");
	}
	public boolean insertDataFromProvider(ResponseDataDAO responseData){
		
		boolean ret = true;
		
		for(Map.Entry<String, String> entry : responseData.getDataByNumberId().entrySet()){
			
			
			PreparedStatement statement = session.prepare("INSERT INTO oter.service (numberId,provider,service,data,created,lastChanged) VALUES (?,?,?,?,dateof(now()),dateof(now()))");
			BoundStatement boundStatement = statement.bind(entry.getKey(),responseData.getRequestParameter().getProvider(),responseData.getRequestParameter().getService(),entry.getValue());
			ResultSet result = session.execute(boundStatement);
			
			
			if(!result.isFullyFetched()){
				ret = false;
			}
		}
	
		return ret;
	}
	public HashMap<String,String> getDataFromProviderStorage(RequestParameterDAO requestParameter){
		

		HashMap<String,String> hm = new HashMap<String,String>();
		ResultSet results;
		for(String numberId : requestParameter.getNumberIdList()){
			results = session.execute("SELECT numberId,data FROM oter.service WHERE numberId ='"+numberId+"' AND provider='"+requestParameter.getProvider()+"' AND service ='"+requestParameter.getService()+"'");
			Row r = results.one();
			if(r!=null){
				hm.put(r.getString("numberId"),r.getString("data"));
			}
			
		}

		
		return hm;
	}
	public void closeConnection(){
		cluster.close();
	}
	
		
}

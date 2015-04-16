/**
 * Author: HAW
 */

package no.sismo.oter.ejb.dao;

import no.sismo.oter.utility.RequestParameterDAO;

import java.util.HashMap;
import java.util.Map;


public class ResponseDataDAO {
	
	private RequestParameterDAO requestParameter;
	private HashMap<String,String> dataByNumberId;
	
	
	public ResponseDataDAO(RequestParameterDAO requestParameter) {
		super();
		this.requestParameter = requestParameter;
	}

	public RequestParameterDAO getRequestParameter() {
		return requestParameter;
	}
	public void setRequestParameter(RequestParameterDAO requestParameter) {
		this.requestParameter = requestParameter;
	}
	public HashMap<String, String> getDataByNumberId() {
		return dataByNumberId;
	}
	public void setDataByNumberId(HashMap<String, String> dataByNumberId) {
		this.dataByNumberId = dataByNumberId;
	}

}

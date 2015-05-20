package no.sismo.oter.ejb.webservice;

import java.util.HashMap;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import no.sismo.oter.ejb.dao.ResponseDataDAO;

@Remote
@WebService
@SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT)
public interface ProviderDataService{
	@WebMethod
	public ResponseDataDAO getProviderDataById(
			@WebParam(name="provider")String provider,
			@WebParam(name="service")String service,
			@WebParam(name="numberId")List<String> numberIdList,
			@WebParam(name="useLocalData")Boolean useLocalData) throws Exception;
}

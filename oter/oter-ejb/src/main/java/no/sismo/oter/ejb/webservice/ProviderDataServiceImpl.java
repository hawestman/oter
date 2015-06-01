package no.sismo.oter.ejb.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

import no.sismo.oter.ejb.dao.ResponseDataDAO;
import no.sismo.oter.ejb.framework.ProviderHandler;
import no.sismo.oter.utility.RequestParameterDAO;

/**
 * Session Bean implementation class ProsjektxBean
 */
@WebService(endpointInterface = "no.sismo.oter.ejb.webservice.ProviderDataService", name = "ProviderDataService")
@Stateless
public class ProviderDataServiceImpl implements ProviderDataService {
	/**
	 * Default constructor.
	 */
	public ProviderDataServiceImpl() {

	}

	/**
	 * The webservice interface, where it all begins
	 * 
	 * @param provider
	 * @param service
	 * @param consumer
	 * @param numberIdList
	 * @return
	 */
	@Override
	public ResponseDataDAO getProviderDataById(
			@WebParam(name = "provider") String provider,
			@WebParam(name = "service") String service,
			@WebParam(name = "consumer") String consumer,
			@WebParam(name = "numberId") List<String> numberIdList,
			@WebParam(name = "useLocalData") Boolean useLocalData) {

		ProviderHandler ph;
		long timepassed = 0;
		timepassed = System.currentTimeMillis();

		RequestParameterDAO requestParameter = new RequestParameterDAO(
				numberIdList, provider, service, consumer, useLocalData);
		ph = new ProviderHandler(provider);

		ResponseDataDAO rdd = ph.handleRequest(requestParameter);
		System.out.println("webservice responding after : "
				+ (System.currentTimeMillis() - timepassed) + " ms");

		return rdd;
	}

}

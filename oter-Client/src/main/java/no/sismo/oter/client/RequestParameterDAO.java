package no.sismo.oter.client;

import java.util.List;

public class RequestParameterDAO {

	private List<String> numberIdList;
	private String provider;
	private String service;
	private String consumer;
	private Boolean useLocalData;
	

	public List<String> getNumberIdList() {
		return numberIdList;
	}

	public void setNumberIdList(List<String> numberIdList) {
		this.numberIdList = numberIdList;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Boolean getUseLocalData() {
		return this.useLocalData;
	}

}

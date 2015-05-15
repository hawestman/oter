package no.sismo.oter.client;

import java.util.List;

public class RequestParameterDAO {

	private List<String> numberIdList;
	private String provider;
	private String service;
	private Boolean useLocalData;
	private String dataConsumer;

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

	public String getDataConsumer() {
		return dataConsumer;
	}

	public void setDataConsumer(String dataConsumer) {
		this.dataConsumer = dataConsumer;
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

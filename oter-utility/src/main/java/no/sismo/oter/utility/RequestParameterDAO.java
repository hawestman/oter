package no.sismo.oter.utility;


import java.util.List;

public class RequestParameterDAO {

    private List<String> numberIdList;
    private String provider;
    private String service;


    public RequestParameterDAO(List<String> numberIdList, String provider, String service) {
        super();
        this.numberIdList = numberIdList;
        this.provider = provider;
        this.service = service;
    }


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
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }



}

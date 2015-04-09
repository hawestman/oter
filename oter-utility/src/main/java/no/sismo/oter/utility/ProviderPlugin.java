package no.sismo.oter.utility;


import java.util.HashMap;

import net.xeoh.plugins.base.Plugin;
import no.sismo.oter.utility.RequestParameterDAO;

public interface ProviderPlugin extends Plugin, Runnable{
    public HashMap<String, String> getResult();
    public boolean isFinished();
    public void setRequestParameter(RequestParameterDAO requestParameter);
}
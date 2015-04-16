package no.sismo.oter.utility;


import java.util.HashMap;

import net.xeoh.plugins.base.Plugin;
import no.sismo.oter.utility.RequestParameterDAO;

public interface ProviderPlugin extends Plugin{
	
	
	public HashMap<String, String> getProviderData(RequestParameterDAO requestParameter);
	
}
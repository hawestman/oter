package no.sismo.oter.ejb.framework;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;


import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.options.addpluginsfrom.OptionReportAfter;
import net.xeoh.plugins.base.options.getplugin.OptionCapabilities;

import no.sismo.oter.ejb.dao.ResponseDataDAO;
import no.sismo.oter.ejb.model.StorageHandler;

import no.sismo.oter.utility.ProviderPlugin;
import no.sismo.oter.utility.RequestParameterDAO;

/**
 * Created by hwestman on 17.02.2015.
 */
public class ProviderHandler {

    private PluginManager pm;


    /**
     * Creates a providerhandler where it first up classloads a provider from a given directory
     * @param provider
     */
    public ProviderHandler(String provider){

        pm = PluginManagerFactory.createPluginManager();
        
            //pm.addPluginsFrom(new URI("classpath://no.sismo.oter.ejb.providers.impl."+provider));

    }

    /**
     * Handles a request to a registered provider
     * @param requestParameter
     * @return
     */
    public ResponseDataDAO handleRequest(RequestParameterDAO requestParameter){

    	ResponseDataDAO responseData= new ResponseDataDAO(requestParameter);
    	HashMap<String,String> numberIdListData;
        boolean useDBInstead = requestParameter.getUseLocalData();
        StorageHandler storageHandler = new StorageHandler();
    	
    	if(!useDBInstead){
    		pm.addPluginsFrom(new File("providerPlugins/").toURI(), new OptionReportAfter());
    		ProviderPlugin plugin = pm.getPlugin(ProviderPlugin.class,new OptionCapabilities("provider:"+requestParameter.getProvider()));
	        if(plugin != null){
	        	
	        	try{
	            	
	        		numberIdListData = plugin.getProviderData(requestParameter);
	                responseData.setDataByNumberId(numberIdListData);
	                storageHandler.insertDataFromProvider(responseData);
	                System.out.println("webservice completed, fresh results should be delivered");
	                
	            }catch (Exception e){
	                System.out.println("Messages should come here");
	                System.out.println(e.getMessage());
	                //Couldnt perform webservicecall or couldnt insert data
	                //TODO Figue out
	                e.printStackTrace();
	                
	                useDBInstead = true;
	            }
	        }else{
	        	
        		System.out.println("using database because we couldnt get plugin");
	            
	            useDBInstead = true;
	            //No such plugin exists, should we just check db or is it fatal?
	            //TODO Figue out
	        }
    	}

        if(useDBInstead){
            numberIdListData = storageHandler.getDataFromProviderStorage(requestParameter);
            responseData.setDataByNumberId(numberIdListData);
        }

        return responseData;
    }
}

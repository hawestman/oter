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
    	//Creating the pluginmanager in order to aquire plugins later
        pm = PluginManagerFactory.createPluginManager();
        
            //pm.addPluginsFrom(new URI("classpath://no.sismo.oter.ejb.providers.impl."+provider));

    }

    /**
     * Handles a request to a registered provider
     * @param requestParameter
     * @return
     */
    public ResponseDataDAO handleRequest(RequestParameterDAO requestParameter){
    	
    	HashMap<String,String> numberIdListData;
    	ResponseDataDAO responseData= new ResponseDataDAO(requestParameter);
    	StorageHandler storageHandler = new StorageHandler();
    	boolean useDBInstead = requestParameter.getUseLocalData();
        
    	
    	if(!useDBInstead){
    		/*
    		 * Adding plugins in order to get data from provider
    		 */
    		pm.addPluginsFrom(new File("providerPlugins/").toURI(), new OptionReportAfter());
    		ProviderPlugin plugin = pm.getPlugin(ProviderPlugin.class,new OptionCapabilities("provider:"+requestParameter.getProvider()));
    		
	        if(plugin != null){
	        	
	        	/**
	        	 * Attempting to get data from provider, fallback is to get data from database
	        	 */
	        	try{
	        		//Getting data
	        		numberIdListData = plugin.getProviderData(requestParameter);
	                //Setting responseobject
	        		responseData.setDataByNumberId(numberIdListData);
	                //Caching the data to database
	        		storageHandler.insertDataFromProvider(responseData);
	        		
	        		//TODO: Make this a log-line
	                System.out.println("webservice completed, fresh results should be delivered");
	                
	            }catch (Exception e){
	                //TODO: Replace with log-line
	                System.out.println(e.getMessage());
	                e.printStackTrace();
	                useDBInstead = true;
	            }
	        }else{
	        	//TODO:Replace with log-line
        		System.out.println("using database because we couldnt get plugin");
	            
	            useDBInstead = true;
	        }
    	}

        if(useDBInstead){
        	//Getting data from database
            numberIdListData = storageHandler.getDataFromProviderStorage(requestParameter);
            //Setting responsedata
            responseData.setDataByNumberId(numberIdListData);
        }

        return responseData;
    }
}

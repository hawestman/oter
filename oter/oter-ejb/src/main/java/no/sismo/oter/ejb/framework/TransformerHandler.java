package no.sismo.oter.ejb.framework;


import java.io.File;
import java.util.HashMap;
import java.util.Properties;

import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.options.addpluginsfrom.OptionReportAfter;
import net.xeoh.plugins.base.options.getplugin.OptionCapabilities;
import no.sismo.oter.utility.TransformerPlugin;
import no.sismo.oter.utility.config.PropertiesFile;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class TransformerHandler {

	private PluginManager pm;
	
	private Properties prop;
	private PropertiesFile propertiesFile;
	
//	private static final Logger logger = LogManager
//			.getLogger(TransformerHandler.class.getName());

	/**
	 * Creates a transformerhandler where it first up classloads a transformer
	 * from a given directory
	 * 
	 * @param transformer
	 */
	public TransformerHandler(String transformer) {

//		logger.info("TransformerHandler() {} ");

		// Creating the pluginmanager in order to aquire plugins later
		pm = PluginManagerFactory.createPluginManager();

	}

	/**
	 * Handles a request to a registered transformer
	 * 
	 * @param dataConsumer
	 *            , responceData
	 * @return transformedData
	 */
	public HashMap<String, String> transformData(String dataConsumer,
			HashMap<String, String> responceData) {
		
		this.prop = new Properties();

		propertiesFile = new PropertiesFile();

		propertiesFile.loadProperties(TransformerHandler.class.getClassLoader()
				.getResourceAsStream("config.oter-ejb.properties"), prop);

		// logger.info("transformData() {} ", requestParameter.getService());

//		HashMap<String, String> transformedData = new HashMap<String, String>();
		
		HashMap<String, String> transformedData = null;
		
		/*
		 * Adding plugins in order to transform data from transformer
		 */

		File f = new File(prop.getProperty("TransformerPluginsLocation"));
		
		System.out.println("f.toURI(): " + f.toURI());

		pm.addPluginsFrom(f.toURI(), new OptionReportAfter());

		TransformerPlugin plugin = pm.getPlugin(TransformerPlugin.class,
				new OptionCapabilities("transformer:" + dataConsumer));

		if (plugin != null) {

			/**
			 * Attempting to transform data
			 */
			try {

				transformedData = plugin.transformData(responceData);

				// TODO: Make this a log-line
				System.out.println("transformation completed");

			} catch (Exception e) {
				// TODO: Replace with log-line
				System.out.println(e.getMessage());
				e.printStackTrace();

			}
		} else {
			// TODO:Replace with log-line
			System.out.println("no transformation plugin found");
			
			transformedData = responceData;

		}

		return transformedData;
	}
}

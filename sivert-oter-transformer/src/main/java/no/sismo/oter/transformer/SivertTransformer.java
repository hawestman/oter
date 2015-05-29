package no.sismo.oter.transformer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.sf.json.JSONException;
import net.xeoh.plugins.base.annotations.Capabilities;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import no.sismo.oter.utility.TransformerPlugin;
import no.sismo.oter.utility.config.PropertiesFile;

import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;
import org.json.XML;

@PluginImplementation
public class SivertTransformer implements TransformerPlugin {

	private Properties prop;
	private PropertiesFile propertiesFile;
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;

	@Capabilities
	public String[] capabilities() {
		return new String[] { "transformer:SIVERT" };
	}

	public SivertTransformer() {

		this.prop = new Properties();

		propertiesFile = new PropertiesFile();

		propertiesFile.loadProperties(SivertTransformer.class.getClassLoader()
				.getResourceAsStream("config-trans.properties"), prop);

	}

	public HashMap<String, String> transformData(
			HashMap<String, String> responceData) {

		String format = "";

		HashMap<String, String> transformedData = null;

		format = prop.getProperty("format");

		if (StringUtils.equalsIgnoreCase("JSON", format)) {
			transformedData = convertXMLMapToJsonMap(responceData);
		}

		else if (StringUtils.equalsIgnoreCase("XML", format)) {
			transformedData = responceData;
		}

		else {
			transformedData = responceData;
		}

		// else {
		// transformedData = format
		// + " format is not soppurted, XML and JSON are valid formats";
		// }

		return transformedData;

	}

	public HashMap<String, String> convertXMLMapToJsonMap(
			HashMap<String, String> XMLMap) {

		HashMap<String, String> jsonPrettyMap = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : XMLMap.entrySet()) {

			jsonPrettyMap.put(entry.getKey(),
					convertXMLToJson(entry.getValue()));

		}

		return jsonPrettyMap;

	}

	private String convertXMLToJson(String formatedXML) {

		String jsonPrettyString = null;

		if (StringUtils.isNotEmpty(formatedXML)) {

			try {

				JSONObject xmlJSONObj = XML.toJSONObject(formatedXML);

				jsonPrettyString = xmlJSONObj
						.toString(PRETTY_PRINT_INDENT_FACTOR);

			} catch (JSONException je) {

				System.out.println(je.toString());

			}

		}

		return jsonPrettyString;

	}

}

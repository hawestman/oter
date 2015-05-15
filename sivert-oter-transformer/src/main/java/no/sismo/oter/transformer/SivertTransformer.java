package no.sismo.oter.transformer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.sf.json.JSONException;
import net.xeoh.plugins.base.annotations.Capabilities;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import no.sismo.oter.utility.TransformerPlugin;

import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;
import org.json.XML;

@PluginImplementation
public class SivertTransformer implements TransformerPlugin {

	private Properties prop;
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;

	@Capabilities
	public String[] capabilities() {
		return new String[] { "transformer:Sivert" };
	}

	public SivertTransformer() {

		loadProperties();

	}

	public String transformData(String responceData) {

		String format = "";

		String transformedData = null;

		format = prop.getProperty("format");

		if (StringUtils.equalsIgnoreCase("JSON", format)) {
			transformedData = convertXMLToJson(responceData);
		}

		else if (StringUtils.equalsIgnoreCase("XML", format)) {
			transformedData = responceData;
		} else {
			transformedData = format
					+ " format is not soppurted, XML and JSON are valid formats";
		}
		return transformedData;

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

	private void loadProperties() {

		this.prop = new Properties();
		InputStream input = null;
		try {

			prop.load(SivertTransformer.class.getClassLoader()
					.getResourceAsStream("config.properties"));

		} catch (Exception ex) {
			System.out.println("Exception while loading properties");
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

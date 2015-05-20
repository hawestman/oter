package no.sismo.oter.utility.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public void loadProperties(InputStream inStream, Properties prop) {

		InputStream input = null;
		try {

			prop.load(inStream);

		} catch (Exception ex) {
			System.out.println("Exception when loading properties");
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

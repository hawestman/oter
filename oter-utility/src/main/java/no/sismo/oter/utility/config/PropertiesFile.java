package no.sismo.oter.utility.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public void loadProperties(InputStream inStream, Properties prop) {
		InputStream inStream1=null;
		try {

			prop.load(inStream);

		} catch (Exception ex) {
			System.out.println("Exception while loading properties");
			ex.printStackTrace();
		} finally {
			if (inStream1 != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

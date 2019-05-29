package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropFile {
	
	public String forDrivers(String searchFor) {
		Properties prop=new Properties();
			try {
			InputStream input=new FileInputStream("src/test/resources/propertiesfiles/driverLocation.properties");
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(searchFor);
	}

}

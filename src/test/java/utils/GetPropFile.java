package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropFile {
	
	public String log4JConfigFile(String searchFor) {
		Properties prop=new Properties();
			try {
			InputStream input=new FileInputStream("src/test/resources/configfiles/Log4j.properties");
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(searchFor);
	}

}

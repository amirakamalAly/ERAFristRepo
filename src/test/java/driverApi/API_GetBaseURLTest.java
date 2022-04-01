package driverApi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.ERA.base.Base;

public class API_GetBaseURLTest extends Base {

	public String GetBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String URLL = prop.getProperty("PathURL");
		return URLL;
	}
	
	public String GetrdriverBaseUrl() throws IOException {

		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String driverBaseURL = prop.getProperty("driverBaseURL");
		return driverBaseURL;
	}

}
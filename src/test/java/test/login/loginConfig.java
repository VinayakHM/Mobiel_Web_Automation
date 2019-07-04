package test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.WebApp.Automation.globals.Base;

public class loginConfig extends Base{

	static Properties loginP;
	String prop = "/home/vinayak/workspace/WebApplication/File/login.properties";

	public void openUrl() throws IOException {
		File f = new File(prop);
		loginP = new Properties();
		FileInputStream input = new FileInputStream(prop);
		loginP.load(input);
		
		driverInstance(loginP.getProperty("browser"));
		Url(loginP.getProperty("Url"));
	}
}

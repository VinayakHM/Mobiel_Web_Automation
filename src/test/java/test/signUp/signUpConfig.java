package test.signUp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.WebApp.Automation.globals.Base;

public class signUpConfig extends Base {

	static Properties signUpProp;
	String prop = "/home/vinayak/workspace/WebApplication/File/signup.properties";

	public void openUrl() throws IOException {
		File f = new File(prop);
		FileInputStream input = new FileInputStream(f);
		signUpProp = new Properties();
		signUpProp.load(input);

		driverInstance(signUpProp.getProperty("browser"));
		Url(signUpProp.getProperty("Url"));
	}
}

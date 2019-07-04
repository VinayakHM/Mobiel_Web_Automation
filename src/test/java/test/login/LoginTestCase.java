package test.login;

import java.io.IOException;
import com.WebApp.Automation.Pages.login;

public class LoginTestCase extends loginConfig{
	
	public void validLogin() throws IOException{
		openUrl();
		login l = new login();
		l.navigateToLoginPopup();
		l.enterEmail(loginP.getProperty("Email"));
		l.clickLogin();
		close();
	}
	
	public void invalidLogin() throws IOException{
		openUrl();
		login l = new login();
		l.navigateToLoginPopup();
		l.enterEmail(loginP.getProperty("invalidEmail"));
		l.clickLogin();
		close();
	}
	public static void main(String[] args) throws IOException{
		LoginTestCase test1 = new LoginTestCase();
		test1.validLogin();
		test1.invalidLogin();
	}

}

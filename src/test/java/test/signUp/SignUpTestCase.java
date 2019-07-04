package test.signUp;

import java.io.IOException;

import com.WebApp.Automation.Pages.signUp;

public class SignUpTestCase extends signUpConfig {

	public void SignUpToApp() throws IOException {
		openUrl();
		signUp sign = new signUp();
		sign.navigateToSignUpPopup();
		sign.enterFirstName(signUpProp.getProperty("firstName"));
		sign.enterLastName(signUpProp.getProperty("lastName"));
		sign.enterEmail(signUpProp.getProperty("Email"));
		sign.enterPassword(signUpProp.getProperty("Password"));
		close();
	}

	public static void main(String[] args) throws IOException {
		SignUpTestCase sig = new SignUpTestCase();
		sig.SignUpToApp();
	}

}

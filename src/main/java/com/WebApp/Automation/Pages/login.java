package com.WebApp.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebApp.Automation.globals.Page;

public class login extends Page {

	@FindBy(xpath = "//*[@id='headerControllerId']/div[3]/header/div/div/div/div/ul/li[3]/ul/li[2]/a[3]")
	private WebElement navigateToLogin;

	@FindBy(xpath = "//*[@id='otpEmail']")
	private WebElement enterEmail;

	@FindBy(xpath = "//*[@id='login']/login/div/form/div[2]/button")
	private WebElement loginOtpButton;

	@FindBy(xpath = "//*[@id='login']/login/div/form/div[1]/div/div")
	private WebElement emailNotFound;

	public login() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToLoginPopup() {
		navigateToLogin.click();
	}

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);

	}

	public void clickLogin() {
		loginOtpButton.click();
	}

	public void emailNotFound() {
		String emailNot = emailNotFound.getAttribute("innerHTML");
		System.out.println("email not found message is " + emailNot);
	}
}

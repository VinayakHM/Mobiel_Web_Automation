package com.WebApp.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebApp.Automation.globals.Page;

public class signUp extends Page {

	@FindBy(xpath = "//*[@id='headerControllerId']/div[3]/header/div/div/div/div/ul/li[3]/ul/li[2]/a[4]")
	private WebElement navigateToSignUp;

	@FindBy(xpath = "//*[@id='fname']")
	private WebElement firstName;

	@FindBy(xpath = "//*[@id='lname']")
	private WebElement lastName;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='pwd']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='signup']/div/signup/div/form/button")
	private WebElement signupButton;

	public signUp() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToSignUpPopup() {
		navigateToSignUp.click();
	}

	public signUp enterFirstName(String fName) {
		firstName.sendKeys(fName);
		return this;
	}

	public signUp enterLastName(String lName) {
		lastName.sendKeys(lName);
		return this;
	}

	public signUp enterEmail(String mail) {
		email.sendKeys(mail);
		return this;
	}

	public signUp enterPassword(String pass) {
		password.sendKeys(pass);
		return this;
	}

	public void clickOnSignUpButton() {
		signupButton.click();
	}
}

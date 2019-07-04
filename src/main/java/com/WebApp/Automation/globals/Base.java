package com.WebApp.Automation.globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

	public WebDriver driverInstance(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/vinayak/workspace/WebApplication/drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty(("user.dir") + ""));
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public void Url(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	public void close(){
		driver.quit();
	}
}

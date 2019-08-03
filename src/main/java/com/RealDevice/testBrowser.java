package com.RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testBrowser extends realDeviceBrowser {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("vinayakhk9@gmail.com");
		driver.findElement(By.xpath("//*[@id='m_login_password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='u_0_5']")).click();
	}

}

/*
 * MobileBrowser Inspecting Elements steps: step1: Allow USB Debugging on
 * Device. step2: Open Chrome: More Tools. step3:Remote Device. step4:Enter the
 * URL, chrome browser control mobile browser by opening URL. click on Open
 * Browser Mobile View will be opening.
 * 
 * 
 * If the Web Application is Web Responsive means objects are same for mobile and Web Application.
 * Facebook is not Web Responsive because URL is change for Mobile and Browser.
 */

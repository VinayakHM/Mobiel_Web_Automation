package com.RealDevice;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testScrollBrowser extends realDeviceBrowserBase {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.get("https://cricbuzz.com/");
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,480)", "");
		Assert.assertTrue(
				driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
	}

}

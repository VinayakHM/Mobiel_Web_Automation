package com.RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testBrowser1 extends realDeviceBrowser {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cricbuzz.com/");
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		System.out.println(driver.getCurrentUrl());
	}

}

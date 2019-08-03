package com.RealDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestrealDev extends realDeviceBase{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities("Android");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}

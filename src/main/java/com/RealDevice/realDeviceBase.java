package com.RealDevice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class realDeviceBase {
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

		File f = new File("apk_files");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		
		if(device.equals("Android")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}else if(device.equals("Emulator")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");

		}
		
/*		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
*/		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}
}

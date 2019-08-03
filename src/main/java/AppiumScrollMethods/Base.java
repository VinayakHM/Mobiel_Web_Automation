package AppiumScrollMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
		
		String APP_PACKAGE = "appPackage";
		String APP_ACTIVITY = "appActivity";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability(APP_PACKAGE, "com.android.vending");
		cap.setCapability(APP_ACTIVITY, "com.android.vending.AssetBrowserActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}
}

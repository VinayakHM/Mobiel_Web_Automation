package mobile.Native;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomator extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
/*		driver.findElementByAndroidUIAutomator("attribute(\"value\")");
 * 
 * if their are double quote inside the double quote just put it in backslash
*/	
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
/*		driver.findElementByAndroidUIAutomator("new UiSelector().property(value)");
 * this is the syntax to perform any action on elements 'enabled,click, focus
*/		
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(false)").getSize());
	}

}

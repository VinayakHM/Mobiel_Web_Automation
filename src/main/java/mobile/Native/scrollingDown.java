package mobile.Native;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDown extends Base{

	public static void main(String[] args) throws MalformedURLException {
		//ToDo Auto generated Method Stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Appium doesn't have any direct method for Scroll
		
		//new UiScrollable(new UiSelector()).scrollIntoView(text(/"/"))
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
	}

}

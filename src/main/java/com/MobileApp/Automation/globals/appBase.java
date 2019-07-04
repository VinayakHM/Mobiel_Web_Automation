package com.MobileApp.Automation.globals;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class appBase {

	AndroidDriver driver;

	public void findElementByScroll(AndroidElement element) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(element);");
	}

	public void swipeActionWithSD(AndroidElement source, AndroidElement destination) {
		TouchAction touch = new TouchAction(driver);
		touch.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
/*		touch.longPress(element(source)).moveTo(element(destination)).perform().release();
*/		
	}

}

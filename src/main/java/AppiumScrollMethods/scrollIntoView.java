package AppiumScrollMethods;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollIntoView extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();

		AndroidElement element = driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"\")).scrollIntoView(\"new UiSelector.text(\"\")\")");
	}

}

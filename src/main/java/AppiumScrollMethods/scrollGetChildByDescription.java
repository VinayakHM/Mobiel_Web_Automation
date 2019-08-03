package AppiumScrollMethods;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollGetChildByDescription extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();

		AndroidElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/viewpager\")).getChildByDescription("
						+ "new UiSelector().className(\"android.widget.TextView\"), \"Communication\")"));

		// Perform the action on the element
		element.click();
	}
}
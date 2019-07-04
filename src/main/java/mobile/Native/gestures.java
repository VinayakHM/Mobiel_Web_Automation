package mobile.Native;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		/*
		 * Tap When you create object of the Touch Action, It have the driver
		 * control and All capabilities are assigned to 't' object
		 */
		AndroidElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(expandList))).perform();

		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

		AndroidElement peopleN = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(peopleN)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println("Sample Menu isDisplayed : "+driver.findElementById("android:id/title").isDisplayed());
	}

}

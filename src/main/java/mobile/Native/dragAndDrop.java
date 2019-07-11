package mobile.Native;

import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

		TouchAction t = new TouchAction(driver);

		AndroidElement source = driver.findElementByXPath("//android.view.View[@index='1']");
		AndroidElement destin = driver.findElementByXPath("//android.view.View[@index='2']");

		// longPress(source)//moveto(Destination)//release
		t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destin)).release().perform();
		// below syntax can be used if you dont need any action after long press
		// if you want waitAction or some action after long press you can follow
		// above condition
		// t.longPress(element(source)).moveTo(element(destin)).release().perform();
	}

}

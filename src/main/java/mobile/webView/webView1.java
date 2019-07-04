package mobile.webView;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class webView1 extends webViewAndNative {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Vinayak");
		driver.findElement(By.xpath("//*[@text='Male']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		AndroidElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));

		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(checkBox))).perform();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

		Set<String> contexts = driver.getContextHandles();

		for (String contextNames : contexts) {
			System.out.println(contextNames);
		}

		driver.context("WEBVIEW_com.androidsample.generalstore");

		driver.findElement(By.name("q")).sendKeys("Google");
	}

}

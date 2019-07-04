package UIOperatonExm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopup {

	public WebDriver driver;
	
	public void openUrl() {
		String Url = "http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(Url);
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		
		Alert A = driver.switchTo().alert();
		String alertTitle = A.getText();
		System.out.println("Title of the Alert is : "+alertTitle);
		A.dismiss();
/*		A.accept();
*/
	}

	public static void main(String[] args) {
		AlertAndPopup AP = new AlertAndPopup();
		AP.openUrl();
		
	}

}

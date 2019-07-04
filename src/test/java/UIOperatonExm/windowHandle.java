package UIOperatonExm;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
	
	public static void main(String[] args) {
		WebDriver driver;
		String Url = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(Url);
		
		String mainWindow = driver.getWindowHandle();
		
		WebElement  youtubeLink = driver.findElement(By.xpath("//*[@id='social_block']/ul/li[3]/a"));
		youtubeLink.click();
		
		Set<String> windowsID = driver.getWindowHandles();
				
		for(String newWindows : windowsID){
			if(!mainWindow.equalsIgnoreCase(newWindows))
				driver.switchTo().window(newWindows);
		}		
		driver.close();
		driver.switchTo().window(mainWindow);
		WebElement categoryLink = driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/h4"));
		
		categoryLink.click();
	}

}

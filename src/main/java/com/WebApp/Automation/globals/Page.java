package com.WebApp.Automation.globals;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page extends Base{

	public static WebDriverWait wait;
	
	protected boolean isElementPresent(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
		return true;
	}
	
	public void mouseOver(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void scrollElement(WebElement element){
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}

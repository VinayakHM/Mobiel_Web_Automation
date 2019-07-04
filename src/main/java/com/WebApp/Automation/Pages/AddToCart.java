package com.WebApp.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebApp.Automation.globals.Base;
import com.WebApp.Automation.globals.Page;

public class AddToCart extends Page{
	
	@FindBy(xpath="")
	private WebElement AddButton;
	
	@FindBy(xpath="//*[@id='navbar-main']/div/bigbasket-cart-template/div/div[2]/a")
	private WebElement Basket;
	
	@FindBy(xpath="//*[@id='navbar-main']/div/bigbasket-cart-template/div/div[2]/ul/li[2]/div[2]/div[2]/button")
	private WebElement navigateToCheckOut;
	
	public AddToCart(){
		PageFactory.initElements(driver, this);
	}
	
	public void addProduct(){
		scrollElement(AddButton);
		AddButton.click();
	}
	public void movetoBasket(){
		mouseOver(Basket);
	}
	public void checkOutNavigation(){
		navigateToCheckOut.click();
	}
	
	public static void main(String[] args){
		Base b = new Base();
		b.driverInstance("chrome");
		b.Url("https://www.bigbasket.com/");
		AddToCart cart = new AddToCart();
		cart.addProduct();
		cart.movetoBasket();
		cart.checkOutNavigation();
	}
}

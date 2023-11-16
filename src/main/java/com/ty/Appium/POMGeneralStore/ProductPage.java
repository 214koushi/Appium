package com.ty.Appium.POMGeneralStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage {

	
	@FindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
	private WebElement back;
	
	@FindBy(id="com.androidsample.generalstore:id/toolbar_title")
	private WebElement title;
	
	@FindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement CartSymbol;
	
	@FindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
	private WebElement  addToCart;
	
	AndroidDriver driver;
	public ProductPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getBack() {
		return back;
	}
	public void setBack(WebElement back) {
		this.back = back;
	}
	public WebElement getTitle() {
		return title;
	}
	public void setTitle(WebElement title) {
		this.title = title;
	}
	public WebElement getCartSymbol() {
		return CartSymbol;
	}
	public void setCartSymbol(WebElement cartSymbol) {
		CartSymbol = cartSymbol;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}
	public AndroidDriver getDriver() {
		return driver;
	}
	public void setDriver(AndroidDriver driver) {
		this.driver = driver;
	}
	
	
	public void addToCart() {
		addToCart.click();
	}
	public void checkProductsInCart() {
		CartSymbol.click();
	}
	
}


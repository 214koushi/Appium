package com.ty.Appium.POMGeneralStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {

	@FindBy(className="android.widget.CheckBox")
	private WebElement checkbox;
	
	@FindBy(id="com.androidsample.generalstore:id/btnProceed")
	private WebElement purchase;
	
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}

	public WebElement getPurchase() {
		return purchase;
	}

	public void setPurchase(WebElement purchase) {
		this.purchase = purchase;
	}

	public AndroidDriver getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver driver) {
		this.driver = driver;
	}

	AndroidDriver driver;
	
	public CartPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}

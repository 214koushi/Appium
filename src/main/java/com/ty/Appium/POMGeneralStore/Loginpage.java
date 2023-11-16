package com.ty.Appium.POMGeneralStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Gestureutility;
import io.appium.java_client.android.AndroidDriver;

public class Loginpage {

	AndroidDriver driver;
	//declaration
	@FindBy(id="android:id/text1")
	private WebElement dropdown;
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement name;
	
	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleRadio;
	
	@FindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleRadio;
	
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopbtn;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public void setDriver(AndroidDriver driver) {
		this.driver = driver;
	}

	public WebElement getDropdown() {
		return dropdown;
	}
	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}
    public WebElement getMaleRadio() {
		return maleRadio;
	}
	public void setMaleRadio(WebElement maleRadio) {
		this.maleRadio = maleRadio;
	}
	public WebElement getFemaleRadio() {
		return femaleRadio;
	}
	public void setFemaleRadio(WebElement femaleRadio) {
		this.femaleRadio = femaleRadio;
	}
	public WebElement getShopbtn() {
		return shopbtn;
	}
	public void setShopbtn(WebElement shopbtn) {
		this.shopbtn = shopbtn;
	}

	// intialization
	public Loginpage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public  void login(String Name,String Value) {
		Gestureutility gutil=new Gestureutility(driver);
		dropdown.click();
		gutil.scroll(Value);
		name.sendKeys(Name);
		maleRadio.click();
		shopbtn.click();
	}
	
}

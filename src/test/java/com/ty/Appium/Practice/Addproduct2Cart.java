package com.ty.Appium.Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Addproduct2Cart  extends BaseClass{

	@Test
	public void AddtoCart() throws Throwable {
	    lp.login("abc", "India");
		pp.addToCart();
		pp.checkProductsInCart();
		String name = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']")).getText();
		String name1 ="Air Jordan 4 Retro";
		Assert.assertEquals(name, name1);
	
	}
}

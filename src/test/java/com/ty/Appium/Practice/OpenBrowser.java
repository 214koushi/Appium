package com.ty.Appium.Practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenBrowser {

	@
	Test
	public void openBrowser() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		ds.setCapability("appPackage", "com.androidsample.generalstore");
		ds.setCapability("appActivity", ".SplashActivity");
		ds.setCapability("unlockType", "pattern");
		ds.setCapability("unlockKey", "865473219");
		
		URL u= new URL("http://localhost:4723");
		AndroidDriver driver=new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("gcs");
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
        
        Set<String> contexts = driver.getContextHandles();
        for(String ct: contexts) {
        	
        	System.out.println(ct);
       
        }
        
        driver.context("WEBVIEW_com.androidsample.generalstore");
        
       driver.findElement(By.id("XSqSsc")).sendKeys("d boss ");
       List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(text(),'d boss')]"));
       
       for(WebElement ele : autosug) {
    	   
    	if(ele.getText().contains(" cast name")) {
    		
    		ele.click();
    	}
    	// File scr = driver.getScreenshotAs(OutputType.FILE);
    	// FileUtils.copyFile(scr, new File("./screenshot/dboss.png"));
    	
       }
       
	}
}

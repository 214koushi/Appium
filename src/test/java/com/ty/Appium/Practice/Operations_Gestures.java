package com.ty.Appium.Practice;

import static org.testng.Assert.assertEquals;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Operations_Gestures {

	
	@Test
	public void longpress() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", ".ApiDemos");
		
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "duration",3000
			));
		
	}
	@Test
	public void singleclick() throws Throwable {
		// single click  operatiion
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", ".ApiDemos");
		
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element1=driver.findElement(AppiumBy.accessibilityId("OS"));
		// Immutable Map is a interface which accepts multiple key value pair
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element1).getId(),
			    "duration",3000
				));
	}
	
	
	@Test
	public void dragandDrop() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", ".ApiDemos");
		
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement element = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", 688,
			    "endY", 1060
			));
		String expected="Dropped!";
		String actual = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dropped!']")).getText();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void Zoomin_Zoomout() throws Throwable {
		
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		
		ds.setCapability("appPackage", "‪com.davemorrissey.labs.subscaleview.sample");
		ds.setCapability("appActivity", ".MainActivity");
		ds.setCapability("noReset", true);
		URL u=new URL("http://localhost:4723"); 
		AndroidDriver driver=new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		WebElement image = driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		// Java
	((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) image).getId(),		    "percent", 0.75		));
		
	}
	
	
	
	@Test
	public void swipeLeft2Right() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", ".ApiDemos");
		ds.setCapability("unlockType", "pattern");
		ds.setCapability("unlockKey", "865473219");
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement element = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[2]"));
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
			    "left", 900, "top", 380, "width", 250, "height", 380,
			    "direction", "left",
			    "percent", 0.75
			));
	}
	
	@Test
	public void scrolling() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		ds.setCapability("appPackage", "io.appium.android.apis");
		ds.setCapability("appActivity", ".ApiDemos");
		ds.setCapability("unlockType", "pattern");
		ds.setCapability("unlockKey", "865473219");
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"))"));
		ScreenOrientation s = driver.getOrientation();
		driver.rotate(s.LANDSCAPE);
		
		
	}
	
}

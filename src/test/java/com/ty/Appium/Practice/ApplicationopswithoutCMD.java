 package com.ty.Appium.Practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ApplicationopswithoutCMD {

	@Test
	public void withoutCMD() throws MalformedURLException {
		File f=new File("C:\\Users\\Koushik MN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService server=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4723).withTimeout(Duration.ofSeconds(500)).build();
		server.start();
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
		
		
		ds.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	ds.setCapability("appActivity", ".Calculator");
		
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver= new AndroidDriver(u, ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("1")).click();
		driver.findElement(AppiumBy.accessibilityId("Plus")).click();
		driver.findElement(AppiumBy.accessibilityId("2")).click();
		driver.findElement(AppiumBy.accessibilityId("Equal")).click();
		
	}
}

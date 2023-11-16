package com.ty.Appium.Practice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ActionXamdY {

	@Test
	public void performingActionUsingXandYaxis() throws MalformedURLException {
		File f=new File("C:\\\\Users\\\\Koushik MN\\\\AppData\\\\Roaming\\\\npm\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js");
		 AppiumDriverLocalService app = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(30)).build();
		 app.start();
		 
		 DesiredCapabilities ds=new DesiredCapabilities();
		 ds.setCapability("deviceName", "Galaxy A52s 5G");
		 ds.setCapability("platformName", "Android");
		 ds.setCapability("automationName", "UiAutomator");
		 ds.setCapability("Udid", "RZCR806MB8W");
		 ds.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			ds.setCapability("appActivity", ".Calculator");
		 ds.setCapability("noReset", true);
		 
		 URL u=new URL("https://localhost:4723");
		 AndroidDriver driver=new AndroidDriver(u,ds);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 ((JavascriptExecutor)driver).executeScript("mobile : clickGesture", ImmutableMap.of("x",200,"y",300));
		 }
}

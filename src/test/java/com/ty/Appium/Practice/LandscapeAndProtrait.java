package com.ty.Appium.Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LandscapeAndProtrait {

	@Test
	public void landscape() throws Throwable {
	DesiredCapabilities ds=new DesiredCapabilities();
	ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
	ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
	
	ds.setCapability("appPackage", "com.ril.ajio");
	ds.setCapability("appActivity", "com.ril.ajio.launch.activity.SplashScreenActivity");
	ds.setCapability("unlockType", "pattern");
	ds.setCapability("unlockKey", "865473219");
	URL u=new URL("http://localhost:4723");
	AndroidDriver driver= new AndroidDriver(u,ds);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	ScreenOrientation land = driver.getOrientation();
	driver.rotate(land.LANDSCAPE);
	
	}
}

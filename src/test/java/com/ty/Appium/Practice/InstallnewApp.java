package com.ty.Appium.Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallnewApp {

	
	@Test
	public void install() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
	    ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	    ds.setCapability(MobileCapabilityType.UDID, "RZCR806MB8W");
	    
	    
	    ds.setCapability(MobileCapabilityType.APP, "‪C:\\Users\\Koushik MN\\Desktop\\General-Store.apk");
	    
	    URL u=new URL("http://localhost:4723");
	    AndroidDriver driver =new AndroidDriver(u,ds);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	    
	}
}

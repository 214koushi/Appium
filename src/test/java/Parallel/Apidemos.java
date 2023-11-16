package Parallel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Apidemos {

	@Test
	public void apiDemos() throws Throwable {
		File f=new File("C:\\Users\\Koushik MN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService server=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4724).withTimeout(Duration.ofSeconds(500)).build();
		server.start();
	DesiredCapabilities ds=new DesiredCapabilities();
	ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A23 5G");
	ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	ds.setCapability(MobileCapabilityType.UDID, "RZCW60CR8VE");
	
	
	ds.setCapability("appPackage", "io.appium.android.apis");
	ds.setCapability("appActivity", ".ApiDemos");
	
	URL u=new URL("http://localhost:4724");
	AndroidDriver driver= new AndroidDriver(u,ds);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(AppiumBy.accessibilityId("Views")).click();
}}
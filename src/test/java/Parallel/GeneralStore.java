package Parallel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class GeneralStore {

	@Test
	public void General() throws MalformedURLException {
		File f=new File("C:\\Users\\Koushik MN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService server=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4723).withTimeout(Duration.ofSeconds(500)).build();
		server.start();
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A52s 5G");
		ds.setCapability(MobileCapabilityType.UDID,"RZCR806MB8W");
		ds.setCapability("appPackage", "com.androidsample.generalstore");
		ds.setCapability("appActivity", ".SplashActivity");
		ds.setCapability("unlockType", "pattern");
		ds.setCapability("unlockKey", "865473219");
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver=new AndroidDriver(u,ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
	}
}

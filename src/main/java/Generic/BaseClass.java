package Generic;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ty.Appium.POMGeneralStore.CartPage;
import com.ty.Appium.POMGeneralStore.Loginpage;
import com.ty.Appium.POMGeneralStore.ProductPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AppiumDriverLocalService server;
	public AndroidDriver driver;
	public Gestureutility gutil;
	public CartPage cp;
	public ProductPage pp;
	public AndroidDriver sdriver;
	public Loginpage lp; 
	
	@BeforeSuite
	public void startserver() {
		File f=new File("C:\\Users\\Koushik MN\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 server=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4723).withTimeout(Duration.ofSeconds(500)).build();
		server.start();
	}

	@AfterSuite
	public void closeserver() {
		
		server.stop();;
	}
	@BeforeMethod
public void open() throws Throwable {
		
		Fileutilitty f=new Fileutilitty();
		String PN = f.getDatafromPropertyfile("PLATFORM_NAME");
		String DN = f.getDatafromPropertyfile("DEVICE_NAME");
		String AN = f.getDatafromPropertyfile("AUTOMATION_NAME");
		String Udid = f.getDatafromPropertyfile("UDID");
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME, PN);
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, DN);
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, AN);
		ds.setCapability(MobileCapabilityType.UDID, Udid);
		
		
		ds.setCapability("appPackage", "‪com.androidsample.generalstore");
		ds.setCapability("appActivity", ".SplashActivity");
		ds.setCapability("noReset", true);
		ds.setCapability("unlockType", "pattern");
		ds.setCapability("unlockKey", "865473219");
		URL u=new URL("http://localhost:4723"); 
	    driver=new AndroidDriver(u,ds);
	   gutil= new Gestureutility(driver);
	      lp=new Loginpage(driver);
	      pp=new ProductPage(driver);
	      cp=new CartPage(driver);
	      sdriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
public void close() {
		driver.quit();
	}
}

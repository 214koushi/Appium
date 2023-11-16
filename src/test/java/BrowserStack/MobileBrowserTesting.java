package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserTesting {

	public static final String username="koushikmn_Ztm1Pz";
	public static final String accesKey="FJXr8qqhCKLua6GyusJw";
	public static final String url=" https://"+username+":"+accesKey+"@hub-cloud.browserstack.com/wd/hub ";
	@Test
	public void mobilebrowserTesting() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		ds.setCapability(MobileCapabilityType.BROWSER_NAME,MobileBrowserType.CHROME);
		ds.setCapability("build", "1.1.4");
		ds.setCapability("name", "Mobile_Browser_Testing_Stack");
		
		WebDriver driver =new RemoteWebDriver(new URL(url),ds);
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		
	}
}

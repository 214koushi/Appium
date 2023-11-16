
package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileAppTesting {

	public static final String username="koushikmn_Ztm1Pz";
	public static final String accesKey="FJXr8qqhCKLua6GyusJw";
	public static final String url=" https://"+username+":"+accesKey+"@hub-cloud.browserstack.com/wd/hub ";
	
	@Test
	public void apptesting() throws Throwable {
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 5");
		ds.setCapability("os_version", "11.0");
		ds.setCapability("Project", "API_Demo_Testing");
		ds.setCapability("build", "API_Demo_1.1.3");
		ds.setCapability("name", "API_Demo_Testing");
		ds.setCapability("app", "bs://bb911813e750c44c93e69fa7964c74a96bdbee64");
		
		AndroidDriver driver =new AndroidDriver(new URL(url),ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.quit();
	}
}

package BrowserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebBrowserTesting {

	public static final String username="koushikmn_Ztm1Pz";
	public static final String accesKey="FJXr8qqhCKLua6GyusJw";
	public static final String url=" https://"+username+":"+accesKey+"@hub-cloud.browserstack.com/wd/hub ";
	
	@Test
	public void BrowserTesting() throws Throwable {
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability("os", "Windows");
		ds.setCapability("os_version", "11");
		ds.setCapability("browser", "chrome");
		ds.setCapability("browser_version", "114");
		ds.setCapability("name", "Selenium_Browser_BrowserStack");
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL(url),ds);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}
}

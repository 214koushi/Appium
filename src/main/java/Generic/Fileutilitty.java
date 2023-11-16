package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileutilitty {

	public String getDatafromPropertyfile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Koushik MN\\eclipse-workspace\\com.ty.Appium\\src\\test\\resources\\Appium1.properties");
		Properties p=new Properties();
		p.load(fis);
		p.getProperty(key);
		return key;
	}
}

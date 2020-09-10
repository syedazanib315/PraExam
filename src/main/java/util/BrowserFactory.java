package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

static WebDriver driver;

	public static WebDriver init() {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://techfios.com/test/101/");
		//driver.navigate().back();
		
		return driver;
		
	}
	
	//public static void tearDown() {
	//	driver.close();
	//	driver.quit();
	//}

}

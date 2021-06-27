package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import okio.Timeout;

public class BasePojo {
	static WebDriver driver;
	
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		return driver;	
	}
	
	public static  WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
	driver=new FirefoxDriver();
		
	return driver;
		
	}
	
	
	
	

}

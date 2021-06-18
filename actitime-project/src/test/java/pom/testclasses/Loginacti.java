package pom.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.classes.Login;

public class Loginacti {

	private Login loginactitime;
	private WebDriver driver;
	@Test
	public void test()
	
	{
		
	  	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("http://localhost/login.do");
	    //  driver.get("http://demosite.center/wordpress/wp-login.php");

	    loginactitime=new Login(driver);	
		loginactitime.enterusername();
		loginactitime.enterpassword();
		loginactitime.clicklogin();
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
//		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
//		
//		loginactitime.clicklogin();
//		
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
	
	}
	
	
	
	
	
	
	
}

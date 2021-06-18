package pom.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.classes.Homepage;
import com.pom.classes.Login;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Login loginactitime=new Login(driver);	
		loginactitime.enterusername();
		loginactitime.enterpassword();
		loginactitime.clicklogin();
		
		Homepage homepage=new Homepage(driver);
		homepage.clickuser();
		homepage.clickreport();
		homepage.clicktask();
		
		homepage.clicklogout();
		
	
		
	}

}

package pom.testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.classes.Homepage;

public class Testclass {
	private WebDriver driver;
	private Homepage homepage;
	WebElement user;
	WebElement pass2;
	WebElement out;
 
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	      driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		System.out.println("before class =launch / get url");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
//	    loginactitime=new Login(driver);	
//		loginactitime.enterusername();
//		loginactitime.enterpassword();
//		loginactitime.clicklogin();
//		
		
		
		System.out.println("before method= login");
	}
	
	@Test(dataProvider="driveTest")
	public  void test1(String use,String pass) throws Exception
	
	{
		
		Thread.sleep(5000);
//		homepage=new Homepage(driver);
//		homepage.clickuser();
//		 homepage.takes();
//		String url=driver.getCurrentUrl();

 user=	driver.findElement(By.xpath("//input[@name='username']"));
 pass2=	driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		user.sendKeys(use);
		pass2.sendKeys(pass);
		out=driver.findElement(By.xpath("//a[@id='loginButton']"));
		out.click();
		
		
		
		
//        if(url.equals("http://localhost/administration/userlist.do"))
//        {
//            
//        	
//        	System.out.println("test pass   pri=0");
//        }
//        else
//        {
//        	System.out.println("test fail");
//        }
//		System.out.println("test1 class=  user");
		
	     }
	
	
	@DataProvider(name="driveTest")
	public Object[][] getData()
	{
		
		Object[][] data= {{"admin","manager"},{"admin1","manager1"}};
return data;
		
	}
	
	
	
	@Test
	public void test2()
	{
		System.out.println("test2 class=Tasks");
		
		homepage.clicktask();
		
		String url=driver.getCurrentUrl();
        if(url.equals("http://localhost/tasks/otasklist.do"))
        {
        	System.out.println("test pass");
        }
        else
        {
        	System.out.println("test fail");
        }
		System.out.println("test1 class=  user  pri=2");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method=  logout");
		
		homepage.clicklogout();

	}
	

	@AfterClass
	public void afterclass()
	{
		System.out.println("after class= browser close");
		
		driver.close();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

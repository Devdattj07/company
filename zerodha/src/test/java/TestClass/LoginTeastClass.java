package TestClass;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.pom.testclass.Login;
import com.pom.testclass.SearchStock;

import utilities.Utility;

public class LoginTeastClass extends BasePojo  {
 
	 Login loginpage;
	Actions a;
	WebElement pinn;
	WebElement logno;
	WebElement logout;
	int TestID;
	static SearchStock searchin;
	  WebElement stockb;
	  Actions aa;
	WebDriver driver;
	
	
	
	
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	
	{
		System.out.println("before test");
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = openChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("4https://kite.zerodha.kcom/");
		
		
	}

	@BeforeClass
	public void logintest() throws InterruptedException
	{  
		loginpage=new Login(driver);
		loginpage.enteruserid();
		loginpage.enterpassword();
		loginpage.clicklogin();
		Thread.sleep(3000);
		loginpage.entermpin();
		loginpage.clickconti();
		Thread.sleep(2000);
		Thread.sleep(4000);
	}
	  
	@BeforeMethod
	public void neforemethod() throws InterruptedException
	{
		
	}
	
	@Test
	public void testsearch() throws InterruptedException
	{
		loginpage.clicklog();
	    loginpage.Clickonlogout();
		Thread.sleep(2000);
	System.out.println("xyz");
		
	}

	@AfterMethod
	public void aftermethod(ITestResult result) throws InterruptedException, IOException
	{ 
	if(ITestResult.FAILURE==result.getStatus())
	{
	
		Utility.takesScreenshot(driver, TestID);
	}
////		 loginpage.clicklog();
////	     loginpage.Clickonlogout();
////		Thread.sleep(2000);
////		driver.close();
//    	
//		System.out.println("Log out");
//		
	}
	
	
	
	
	
	
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
		System.out.println("afterclass");
	//	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@BeforeTest
//	@Parameters("browser")
//	public void launchBrowser(String browser)
//	
//	{
//		System.out.println("before test");
//		if(browser.equalsIgnoreCase("Chrome"))
//		{
//			driver = openChromeBrowser();
//		}
//		else if(browser.equalsIgnoreCase("Firefox"))
//		{
//			driver = openFirefoxBrowser();
//		}
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	}
//	
//	
//	
//	
//	@BeforeClass
//	public void logintest() throws InterruptedException
//	{  
//		driver.navigate().to("https://kite.zerodha.com/");
//		
//		// String url= driver.getCurrentUrl();
//        //System.out.println(url);
////		loginpage=new Login(driver);
////		loginpage.enteruserid();
////		loginpage.enterpassword();
////		loginpage.clicklogin();
////		Thread.sleep(3000);
////		loginpage.entermpin();
////		loginpage.clickconti();
//////		String expected ="https://kite.zerodha.com/dashboard";
////		String actualurl="https://kite.zerodha.com/dashboard";
////		
////       AssertJUnit.assertEquals(expected, actualurl);
////        
////         SoftAssert soft=new SoftAssert();6
////         soft.assertEquals(expected, actualurl);
//
//  //  driver.getCurrentUrl();
//       
//	}
//	  
//	@BeforeMethod
//	public void neforemethod() throws InterruptedException
//	{
//		
//		loginpage=new Login(driver);
//		loginpage.enteruserid();
//		loginpage.enterpassword();
//		loginpage.clicklogin();
//		Thread.sleep(3000);
//		loginpage.entermpin();
//		loginpage.clickconti();
//		Thread.sleep(2000);
//		Thread.sleep(4000);
//	}
//	
//	
//	
//	
//	
//	@Test(priority=1)
//	public void testsearch()
//	{
//       
//	
////		searchin =new SearchStock(driver);
////		searchin.serchstockk();
////	
////	    stockb=driver.findElement(By.xpath("//*[@class='search-result-item selected isadded']"));
////	    
////		aa=new Actions(driver);
////		aa.moveToElement(stockb).perform();
////		
////		searchin.stockbuy();
////		
//		
//	}
//
//	@AfterMethod
//	public void aftermethod() throws InterruptedException
//	{ 
////		loginpage.clicklog();
////	     loginpage.Clickonlogout();
////		
//
//		Thread.sleep(2000);
//		System.out.println("Log out");
//		
//	}
//	
//	@AfterClass
//	public void afterclass()
//	{
//		System.out.println("afterclass");
//	//	driver.close();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	

}

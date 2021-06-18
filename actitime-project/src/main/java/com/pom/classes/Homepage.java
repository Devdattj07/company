package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
//	
//	File source;
//	 File dest;
//	 String time;
//	 
	@FindBy (xpath="//div[text()='Tasks']")
	private WebElement task;
	
	
	@FindBy (xpath="//div[text()='Reports']")
     private WebElement report;
	
	@FindBy (xpath="//div[text()='Users']")
	private WebElement user;
	
	@FindBy (xpath="//a[@class='logout']")
	private WebElement logout;
	

	
	
//////////////////////////////////////////////	
	public Homepage (WebDriver driver)
	{
	//	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//////////////////////////////////////////
	
	public void clicktask()
	{
		task.click();
	}
	
	
	public void clickreport()
	{
		report.click();
	}
	
	public void clickuser()
	{
		user.click();
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	
//	public void takes() throws Exception
//	
//	
//	{
//		
//        time=new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());
//		
//		source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//	     dest= new File("E:\\deva1"+time+".jpeg");
//	    
//	    FileHandler.copy(source, dest);
//	}
//	
	
	
	
	
}

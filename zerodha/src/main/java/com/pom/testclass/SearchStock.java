package com.pom.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchStock {
	
	
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement searchstoch;
	
	@FindBy (xpath="(//*[@type='button'])[1]")
	private WebElement buy;
	
	
	/////////////////////////////////////////////////////////////
	
	public SearchStock (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	////////////////////////////////////////////////////////////
	
	
	public void serchstockk()
	{
		searchstoch.sendKeys("jswsteel");
	}
	
	public void stockbuy()
	{
		buy.click();
	}
	
	
	
	
	

}

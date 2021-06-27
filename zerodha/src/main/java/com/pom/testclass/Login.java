package com.pom.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy (xpath="//input[@type='text']")
	public WebElement userid;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy (xpath="//*[@type='submit']")
	public WebElement login;
	
	@FindBy (xpath="//input[@id='pin']")
	public WebElement mpin;
	
	@FindBy (xpath="//*[@type='submit']")
	public WebElement conti;

	@FindBy (xpath="//*[text()='SR9817']")
	public WebElement logout;

   @FindBy (xpath="//*[@target='_self']")
	public WebElement logoutok;
   
	///////////////////////////////////////////////////////
	public Login(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
	}
	////////////////////////////////////////////////////////
	public void enteruserid()
	{
		userid.sendKeys("SR9817");
	}
	public void enterpassword()
	{
		password.sendKeys("Suman@123");
	}
	
	public void clicklogin()
	{
		login.click();
	}	
	public void entermpin()
	{
		mpin.sendKeys("145560");
	}
	public void clickconti()
	{
		conti.click();
	}
	
	public void clicklog()
	{
		logout.click();
	}
	
	public void Clickonlogout()
	{
		logoutok.click();
	}
	
	
}

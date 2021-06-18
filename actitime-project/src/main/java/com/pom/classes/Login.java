package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername()
	{
		username.sendKeys("admin");
	}
	
	public void enterpassword()
	{
		password.sendKeys("manager");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

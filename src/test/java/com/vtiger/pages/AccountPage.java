package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class AccountPage extends HeaderPage 
{
	
	public AccountPage(WebDriver driver, ExtentTest logger)
	{
		super(driver, logger);
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//input[@name='accountname']")
	WebElement accName;
	
	@FindBy(name="button")
	WebElement save;
	
	
	
	public void setAccountname(String value)
	{
		cm.EnterValue(accName, value, "textbox Account Name");
	} 
	public void clickSave()
	{
		cm.ClickElement(save, "Save button on accounts page");
	} 
	
	
	public void createAccount_MandFields(String accname)
	{
		setAccountname(accname);
		
		clickSave();
	}

	
	
	

}

package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class LeadPage extends HeaderPage
{
	
	public LeadPage(WebDriver driver, ExtentTest logger)
	{
		super(driver, logger);
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	
	@FindBy(name="button")
	WebElement save;
	
	
	
	public void setLname(String value)
	{
		cm.EnterValue(lname, value, "textbox lastname");
	} 
	public void setCompany(String value)
	{
		cm.EnterValue(company, value, "textbox company");
	} 
	public void clickSave()
	{
		cm.ClickElement(save, "Save button");
	} 
	
	public void createLeadwithMandatoryFields(String lname,String comp)
	{
		setLname(lname);
		setCompany(comp);
		clickSave();
	}

	
}

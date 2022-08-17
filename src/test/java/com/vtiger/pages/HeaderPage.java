package com.vtiger.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;



public class HeaderPage {
	private WebDriver driver;
	public CommonMethods cm;
	public ExtentTest logger;
	
	
	public HeaderPage(WebDriver driver, ExtentTest logger)
	{
		this.driver=driver;
		this.logger=logger;
		
		PageFactory.initElements(driver, this);
		
		cm=new CommonMethods(logger);
	}
	
	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	@FindBy(linkText="New Lead")
	WebElement lnknewLead;
	
	@FindBy(linkText="Leads")
	WebElement lnkLeads;
	
	@FindBy(linkText="New Account")
	WebElement lnk_NewAccount;

	
	public void click_NewLead()
	{
		cm.ClickElement(lnknewLead, "New Lead");
	}
	public void click_Leads()
	{
		cm.ClickElement(lnkLeads, "Leads");
	}
	public void clickNewAccount()
    {
    	cm.ClickElement(lnk_NewAccount, "Link New Account");
    }
	
	public void click_logout()
	{
		cm.ClickElement(lnkLogout, "Link Logout");
	}
}

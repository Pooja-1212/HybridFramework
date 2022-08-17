package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.CommonMethods;

public class Login {
	private WebDriver driver;
	public CommonMethods cm;
	public ExtentTest logger;
	
	
	public Login(WebDriver driver, ExtentTest logger)
	{
		this.driver=driver;
		this.logger=logger;
		
		PageFactory.initElements(driver, this);
		
		cm=new CommonMethods(logger);
	}

	/*By userid= By.name("user_name");
	By pwd=By.name("user_password");
	By login=By.name("Login");
	By logo=By.xpath("//img[@src='include/images/vtiger-crm.gif']");*/
	
	@FindBy(name="user_name")
	WebElement userid;
	
	@FindBy(name="user_password")
	WebElement pwd;
	
	@FindBy(name="Login")
	WebElement login;
	
	@FindBy(xpath="//img[@src='include/images/vtiger-crm.gif']")
	WebElement logo;
	
	@FindBy(xpath="//*[contains(text(),'You must specify a valid username and password.')]")
	WebElement errormsg;
	
	

	public void login(String userval, String pwdval)
	{
		//verifyLogo();
		setUserid(userval);
		setPassword(pwdval);
		clickLogin();
		
	}

	public void setUserid(String value)
	{
		cm.EnterValue(userid, value, "User Name:");
	}
	public void setPassword(String value)
	{
		cm.EnterValue(pwd, value, "Password");
	} 
	public void clickLogin()
	{
		
		cm.ClickElement(login, "Login");
	}
	public boolean verifyLogo()
	{
		
		return cm.CheckDisplay(logo, "Image");
	}
	public boolean verifyErrorMsg()
	{
		
		return cm.CheckDisplay(errormsg, "Error message");
	}

}

package com.vtiger.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.pages.Login;

public class CommonMethods  {
	
	public ExtentTest logger;
	
	public CommonMethods(ExtentTest logger)
	{
		this.logger=logger;
	}
	
	public void EnterValue(WebElement elm, String val, String elmName)
	{
		try
		{
			elm.clear();
			elm.sendKeys(val);
			logger.pass(val+" has been added successfully in field "+elmName);
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fail(val+" is not entered in field "+elmName + " due to error" + e.getMessage());
		}
	}
	
	public void ClickElement(WebElement elm, String elmName)
	{
		try
		{
			elm.click();
			logger.pass(elmName + " has been clicked successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fail(elmName + " is not clicked" +" due to error" + e.getMessage());
		}
	}
	
	public boolean CheckDisplay(WebElement elm, String elmName)
	{
		boolean op= false;
		try
		{
			op= elm.isDisplayed();
			logger.pass(elmName + " has been displayed");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.pass(elmName + " not displayed " +" due to error" + e.getMessage());
			//return false;
		}
		return op;
	}
	
	public void SelectValue(WebElement elm, String val, String elmName)
	{
		try
		{
			Select s=new Select(elm);
			s.selectByVisibleText(val);
			elm.sendKeys(val);
			logger.pass(val+" has been selected from drop down "+elmName);
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fail(val+" is not selected "+elmName + " due to error" + e.getMessage());
		}
	}

	/*public String getscreenshot()
	{
		DateFormat dt=new SimpleDateFormat("yyyyMMddhhmmss");
		Date d=new Date();
		String str=dt.format(d);
		TakeScreenshot tk=
		
		
	}*/
}

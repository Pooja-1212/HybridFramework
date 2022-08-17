package com.vtiger.tests;






import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.Login;


public class LoginTest extends BaseTest{
	
	
	
	@Test
	public void verify_login_with_invalid_credentials_TC01()
	{
		String tcname="verify_login_with_invalid_credentials_TC01";
		logger=extent.createTest(tcname);
		Login lp=new Login(driver, logger);
		lp.verifyLogo();
		lp.login(alldata.get(tcname).get("Userid"), alldata.get(tcname).get("password"));
		lp.verifyErrorMsg();
	
		extent.flush(); // Save reprot	
	}
	
	@Test
	public void verify_login_with_valid_credentials_TC02()
	{
		String tcname="verify_login_with_valid_credentials_TC02";
		
		logger=extent.createTest(tcname);
		Login lp=new Login(driver, logger);
		
		lp.login(alldata.get(tcname).get("Userid"), alldata.get(tcname).get("password"));
		HomePage hp=new HomePage(driver, logger);
		hp.click_logout();
		extent.flush(); // Save reprot
			
	}
	
	


}

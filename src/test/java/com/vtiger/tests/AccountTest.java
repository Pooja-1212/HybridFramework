package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.AccountPage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.Login;

public class AccountTest extends BaseTest
{

	@Test

	public void verify_accountcreation_with_mandatory_fields_TC04()
	{
		String TCname="verify_accountcreation_with_mandatory_fields_TC04";
		logger = extent.createTest(TCname);		
		Login lp = new Login(driver,logger);				
		lp.login(alldata.get(TCname).get("Userid"), alldata.get(TCname).get("password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.click_NewLead();
		ldp.createLeadwithMandatoryFields(alldata.get(TCname).get("lname"), alldata.get(TCname).get("company"));
		ldp.clickNewAccount();
		AccountPage ac = new AccountPage(driver,logger);
		ac.createAccount_MandFields(alldata.get(TCname).get("AccountName"));
		ac.click_logout();
		extent.flush();
	};
}


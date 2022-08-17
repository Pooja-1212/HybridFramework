package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.Login;

public class LeadTest extends BaseTest
{
	@Test
	public void verify_leadcreation_with_mandatory_fields_TC03()
	{
		String TCname="verify_leadcreation_with_mandatory_fields_TC03";
		logger = extent.createTest(TCname);		
		Login lp = new Login(driver,logger);				
		lp.login(alldata.get(TCname).get("Userid"), alldata.get(TCname).get("password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.click_NewLead();
		ldp.createLeadwithMandatoryFields(alldata.get(TCname).get("lname"), alldata.get(TCname).get("company"));
		ldp.click_logout();
		extent.flush();
	}

	
	
}

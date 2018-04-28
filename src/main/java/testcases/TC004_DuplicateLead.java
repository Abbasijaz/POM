package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void dataset()
	{
		testCaseName="TC004_DuplicateLead";
		testDescription="Duplicate the Leads";
		testNodes="Leads";
		category="Smoke";
		authors="abbas";
		browserName="chrome";
		dataSheetName="TC006_DuplicateLEad";
	}
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd,String Email,String LeadName) throws InterruptedException
	{
		new LoginPage()
	.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMainFindLeads()
		.clickemailTab()
		.typeemail(Email)
		.clickFindLeadButton()
		.getLeadName(LeadName)
		.clickFirstdata()
		.clickDuplicatebtn()
		.clickCreateLeadBtn()
		.verifyDuplicateLead(LeadName);
		
		
		
				
	}

}

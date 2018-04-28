package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{
	@BeforeTest
	public void dataset()
	{
		testCaseName="TC003_MergeLead";
		testDescription="Merging the Leads";
		testNodes="Leads";
		category="Smoke";
		authors="abbas";
		browserName="chrome";
		dataSheetName="TC005_EditLead";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String leadID,String data) throws InterruptedException
	{
		new LoginPage()
	.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMainFindLeads()
		.typeLeadID(leadID)
		.clickFindLeadButton()
		.clickFirstdata()
		.clickEditbtn()
		.typeCmpnyName(data)
		.clickUpdate()
		.clickMainFindLeads()
		.typeLeadID(leadID)
		.clickFindLeadButton()
		.verifycmpnyName(data);
		
				
	}

}

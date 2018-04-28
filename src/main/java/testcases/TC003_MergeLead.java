package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_MergeLead extends ProjectMethods{
	@BeforeTest
	public void dataset()
	{
		testCaseName="TC003_MergeLead";
		testDescription="Merging the Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Viji";
		browserName="chrome";
		dataSheetName="TC004_MergeLead";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String fleadName,String lLeadName) throws InterruptedException
	{
		new LoginPage()
	.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickfromLeadIcon()
		.typeLeadID(fleadName)
		.clickFindLeadButton()
		.clickFirstrecord()
		.clickToLeadIcon()
		.typeLeadID(lLeadName)
		.clickFindLeadButton()
		.clickFirstrecord()
		.clickMerge()
		.clickMainFindLeads()
		.typeLeadID(fleadName)
		.clickFindLeadButton()
		.clickFirstrecord();
				
	}

}

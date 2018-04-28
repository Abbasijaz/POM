package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void dataset()
	{
		testCaseName="TC001_CreateLead";
		testDescription="Creating a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Viji";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cName,String fName,String lName)
	{
		new LoginPage()
	.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typecompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickcreateLeadBtn()
		.verifyleadName(fName);
		
				
	}

}

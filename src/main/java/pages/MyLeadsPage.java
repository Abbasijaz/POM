package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickcreatelead;
	
	public CreateLeadPage clickCreateLead()
	{
		click(clickcreatelead);
		
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement clickMergeLeadbtn;
	
	
	public MergeLeadsPage clickMergeLead()
	{
		click(clickMergeLeadbtn);
		
		return new MergeLeadsPage();
	}
		
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement FindLeads;
	
	
	public FindLeadsPage clickFindLeads()
	{
		click(FindLeads);
		
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement mFindLeads;
	
	
	public MainFindLeadsPage clickMainFindLeads()
	{
		click(mFindLeads);
		
		return new MainFindLeadsPage();
	}
	

}

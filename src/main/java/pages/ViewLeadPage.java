package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyLeadName;

	public void verifyleadName(String data)
	{
		verifyExactText(verifyLeadName, data);

	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editbtn;

	public EditPage clickEditbtn()
	{
		click(editbtn);
		return new EditPage();

	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicatebtn;

	public DuplicateLeadPage clickDuplicatebtn()
	{
		click(duplicatebtn);
		return new DuplicateLeadPage();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement deletebtn;

	public MainFindLeadsPage clickDeletebtn()
	{
		click(deletebtn);
		return new MainFindLeadsPage();

	}
	
	
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_lastName_sp']")
	private WebElement lastName;

	public void verifyDuplicateLead(String data)
	{
		verifyExactText(lastName, data);

	}
	






}

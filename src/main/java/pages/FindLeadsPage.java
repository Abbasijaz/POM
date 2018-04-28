package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement leadId;
	
	public FindLeadsPage typeLeadID(String leadID)
	{
		type(leadId,leadID);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeadbtn;
	
	public FindLeadsPage clickFindLeadButton()
	{
	try {
		
			click(findLeadbtn);
			Thread.sleep(2000);
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='linktext']")
	private WebElement findID;
	public MergeLeadsPage clickFirstrecord()
	{
		click(findID);
	switchToWindow(0);
		return new MergeLeadsPage();
		
	}
}

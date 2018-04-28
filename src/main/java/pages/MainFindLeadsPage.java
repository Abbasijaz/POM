package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MainFindLeadsPage extends ProjectMethods {

	public MainFindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement leadId;
	
	public MainFindLeadsPage typeLeadID(String leadID)
	{
		type(leadId,leadID);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement findLeadbtn;
	
	public MainFindLeadsPage clickFindLeadButton()
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
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement verifyText;
	public MainFindLeadsPage clickFirstrecord()
	{
		String expectedText="No records to display";
		verifyExactText(verifyText, expectedText);
		return this;
		
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])")
	private WebElement verify;
	public MainFindLeadsPage verifycmpnyName(String expectedText)
	{
		
		verifyExactText(verify, expectedText);
		return this;
		
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement firstrec;
	public ViewLeadPage clickFirstdata() throws InterruptedException
	{
		Thread.sleep(2000);
		click(firstrec);
	
		return new ViewLeadPage();
		
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[1]")
	private WebElement getLeadText;
		
	public MainFindLeadsPage getLeadName(String LeadName) throws InterruptedException 
	{
		Thread.sleep(2000);
		 LeadName = getText(getLeadText);
		return this;
		
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-lastName'])[1]")
	private WebElement clicklastName;	
	public ViewLeadPage clickLastName() throws InterruptedException
	{
		
		
		click(clicklastName);
		
		return new ViewLeadPage();
		
		
	}
	
	//span[text()='Email']
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement clickEmail;
	public MainFindLeadsPage clickemailTab() 
	{
		
		click(clickEmail);
		return this;
		
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement typeEmail;
	public MainFindLeadsPage typeemail(String Email) throws InterruptedException 
	{
		
		type(typeEmail,Email);
		Thread.sleep(2000);
		return this;
	
		
	}
	
	
	
}

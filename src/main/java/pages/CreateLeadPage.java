package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement cmpnyName;
	
	public CreateLeadPage typecompanyName(String data)
	{
		type(cmpnyName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement fName;
	
	public CreateLeadPage typeFirstName(String data)
	{
		type(fName,data);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lName;
	
	public CreateLeadPage typeLastName(String data)
	{
		type(lName,data);
		return this;
		
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement clickCreateLeadbtn;
	
	public ViewLeadPage clickcreateLeadBtn()
	{
		click(clickCreateLeadbtn);
		return new ViewLeadPage();
	}
	
	
	
	
	
	

}

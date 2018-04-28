package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditPage extends ProjectMethods{

	public EditPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement cmpnyName;

	public EditPage typeCmpnyName(String data) throws InterruptedException
	{
		
		type(cmpnyName,data);
		return this;
		

	}
	
	 
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement update;

	public MyLeadsPage clickUpdate()
	{
		click(update);
		return new MyLeadsPage();
		

	}
	







}

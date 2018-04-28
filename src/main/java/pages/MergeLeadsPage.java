package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {

	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup'][1]")
	private WebElement Fromleadicon;
	
	public FindLeadsPage clickfromLeadIcon()
	{
		
		click(Fromleadicon);
		
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement Toleadicon;
	
	public FindLeadsPage clickToLeadIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		click(Toleadicon);
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement clickMergerbtn;
	
	public MyLeadsPage  clickMerge()
	{
		click(clickMergerbtn);
		acceptAlert();
		return new MyLeadsPage();
	}
	
	
	
}

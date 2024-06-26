package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAccount {
public WebDriver ldriver; //Created the object of webdriver as public
	
	//Created the Constructor
	public AddNewAccount (WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);

}
	//Here found the bellow webelement by using @findBy anotation
	@FindBy(xpath = "//input[@name=\"uid\"]")
	WebElement userid;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//a[normalize-space()='New Account']")
	WebElement clickonnewaccount;
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement entercustomerid;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	WebElement clickaccounttype;
	
	@FindBy(xpath = "//option[@value='Savings']")
	WebElement selectaccounttype;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	WebElement enterinitialdest;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement clicksubmt;
	

	
		

		//Whichever the action we have performed for above webelement which will identify below.
		public void ClickOnNewAccount ()
		{
			
			clickonnewaccount.click();	
	}
		
		public void EnterCustID (String custname)
		{ 
			
			entercustomerid.sendKeys(custname);	
		}
		
		public void clickOnAccountType() {
			clickaccounttype.click();
	}
	
	public void SelectAccountType() {
		selectaccounttype.click();
}
	public void EnterInitialDeposite(String hdfh)
	{ 
		
		enterinitialdest.sendKeys(hdfh);	
	}
	
	public void Submitbtn() {
		clicksubmt.click();
}
}




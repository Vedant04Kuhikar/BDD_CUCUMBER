package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
public WebDriver ldriver; //Created the object of webdriver as public
	
	//Created the Constructor
	public AddNewCustomerPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);                                     

}
	//Here found the bellow webelement by using @findBy anotation
	@FindBy(xpath = "//input[@name=\"uid\"]")
	WebElement userid;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password; 
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	WebElement clicknewcostomer;
	
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement entercustname;
	
	@FindBy (xpath ="//input[@value='m']")
	WebElement selectgender;
	
	@FindBy (xpath ="//input[@id='dob']")
	WebElement enterDOB;
	
	@FindBy (xpath ="//textarea[@name='addr']")
	WebElement enteradd;
	
	@FindBy (xpath ="//input[@name='city']")
	WebElement entercity;
	
	@FindBy (xpath ="//input[@name='state']")
	WebElement enterstate;
	
	@FindBy (xpath ="//input[@name='pinno']")
	WebElement enterpin;
	
	@FindBy (xpath ="//input[@name='telephoneno']")
	WebElement entermobileno;
	
	@FindBy (xpath ="//input[@name='emailid']")
	WebElement enteremail;
	
	@FindBy (xpath ="//input[@name='password']")
	WebElement enterpass;
	
	@FindBy (xpath ="//input[@type='submit']")
	WebElement submit;
	
	//Whichever the action we have performe for above webelement which will identify below.
	public void ClickOnNewCust ()
	{
		
		clicknewcostomer.click();	
}
	
	public void EnterCustName (String custname)
	{ 
		
		entercustname.sendKeys(custname);	
	}
	
	public void clickOnSelectGender() {
		selectgender.click();
}
	public void EnterDob (String dob)
	{ 
		
		enterDOB.sendKeys(dob);	
}
	public void EnterAddress (String add)
	{ 
		
		enteradd.sendKeys(add);	
	}
	
	public void EnterCity (String cty)
	{ 
		
		entercity.sendKeys(cty);	
	}
	
	public void EnterState (String sta)
	{ 
		
		enterstate.sendKeys(sta);	
	}
	
	public void EnterPin (String pn)
	{ 
		enterpin.sendKeys(pn);		
}
	
	public void EnterMobile (String mob)
	{ 
		
		entermobileno.sendKeys(mob);
	}
	
	public void EnterEmail (String vgmalicom)
	{ 
		
		enteremail.sendKeys(vgmalicom);
}
	
	public void EnterPassword (String psw)
	{ 
		
		enterpass.sendKeys(psw);
}
	
	public void clickOnSubmit() {
		submit.click();
}
}



  



	
	 

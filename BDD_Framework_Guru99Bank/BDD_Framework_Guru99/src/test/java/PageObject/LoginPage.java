package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.StepDef;

public class LoginPage {
	
	public WebDriver ldriver; //Created the object of webdriver as public
	
	//Created the Constructor
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);

}
	//Here found the bellow webelement by using @findBy anotation
	@FindBy(xpath = "//input[@name=\"uid\"]")
	WebElement userid;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy (xpath ="//input[@name='btnLogin']")
	WebElement login;
	
	@FindBy (xpath ="//a[normalize-space()='Log out']")
	WebElement logout;
	
	//Whichever the action we have performe for above webelement which will identify below.
	public void Enteruserid (String useridd)
	{
		userid.clear();
		userid.sendKeys(useridd);	
}
	
	public void EnterPassword (String pass)
	{ 
		password.clear();
		password.sendKeys(pass);	
	}
	
	public void ClickOnLoginButton ()
	{
		login.click();	
	}
	
	public void ClickOnLogOutButton ()
	{
		logout.click();
}
}





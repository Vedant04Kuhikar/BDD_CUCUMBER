package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewAccount;
import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	public LoginPage lp;
	public AddNewCustomerPage AddnCustPg;
	public AddNewAccount AddAcnt;
	@Given("User Lounch Chrome Browser")
	public void user_lounch_chrome_browser() {
		System.setProperty("webdriver.Chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");;
	    driver =new ChromeDriver();
		lp= new LoginPage (driver);
		AddnCustPg = new AddNewCustomerPage (driver);
		AddAcnt = new AddNewAccount (driver);
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);   
	}

	@And("User Enteruserid as {string} and EnterPassword as {string}")
	public void user_enteruserid_as_and_enter_password_as(String userid, String password) {
	   lp.Enteruserid(userid);
	   lp.EnterPassword(password);
	}
 
	@And("Click On Login")
	public void click_on_login() {
		lp.ClickOnLoginButton();   
	}

	@Then("User should be logged In")
	public void user_should_be_logged_in() {
	}

	@When("User Click On LogOut Link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.ClickOnLogOutButton();
		Thread.sleep(3000);
	}
	
	@Then("User should be logged Out")
	public void user_should_be_logged_out() {
	   
	}

	@And("Close browser")
	public void close_browser() {
	    
	}
	

////////////////////////////Add New Customer//////////////////////////////////////////////

@When("User Click On New Customer Menu")
public void user_click_on_new_customer_menu() {
	AddnCustPg.ClickOnNewCust();	   
}

@Then("User can view Add New Customer page")
public void user_can_view_add_new_customer_page() {   
}

@When("User Fill the customer information")
public void user_fill_the_customer_information() {
	AddnCustPg.EnterCustName("Ghss");
	AddnCustPg.clickOnSelectGender();
	AddnCustPg.EnterDob("02/01/1980");
	AddnCustPg.EnterAddress("hyt Nagar");
	AddnCustPg.EnterCity("Nagpur");
	AddnCustPg.EnterState("Maharashtra");
	AddnCustPg.EnterPin("892455");
	AddnCustPg.EnterMobile("8886661113");
	AddnCustPg.EnterEmail("Ghss@gmail.com");
	AddnCustPg.EnterPassword("Ghss@984");
}

@And("Click on submit button")
public void click_on_submit_button() {
	AddnCustPg.clickOnSubmit();  
}

@Then("Customer Registered Successfully")
public void customer_registered_successfully() {
    
}
///////////////////////////////New Account/////////////////////////////////////////////////////////

@When("User Click On New Account Menu")
public void user_click_on_new_account_menu() {
	AddAcnt.ClickOnNewAccount();
}

@Then("User can view Add New Account page")
public void user_can_view_add_new_account_page() {
   
}

@When("User Fill the add new account information")
public void user_fill_the_add_new_account_information() {
	AddAcnt.EnterCustID("38170");
	AddAcnt.clickOnAccountType();
	AddAcnt.SelectAccountType();
	AddAcnt.EnterInitialDeposite("3000");
	AddAcnt.Submitbtn();
}

@Then("Account Generated Successfully")
public void account_generated_successfully() {
}
}




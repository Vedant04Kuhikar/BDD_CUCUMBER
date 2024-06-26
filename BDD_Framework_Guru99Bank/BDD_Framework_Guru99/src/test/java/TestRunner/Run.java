package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/AddNewCustomer.feature",
        glue="StepDefinition",
        dryRun =false,   //dryRun function will check then mapping of stepdefinition to compare Feature file
        monochrome =true, //monochrome function will be use for if dryRun and monochrome is both are true then which output we will get that will be show in readable format
        plugin = {"pretty","html:target/cucumber-report/report1.html"}
        //plugin = {"pretty","junit:target/cucumber-report/report_xml.xml"}
		//plugin = {"pretty","json:target/cucumber-report/report_json.json"}
		//plugin = {"pretty","html:target/cucumber-report/report1.html","junit:target/cucumber-report/report_xml.xml","json:target/cucumber-report/report_json.json"}
        )
    

public class Run {
	/*This class will be empty*/
	
}
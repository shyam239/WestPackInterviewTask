package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber/cucumber.json",
		"html:target/CucumberHTML/"},
		features = {"src/test/resources/Fetures/"},
		glue = {"classpath:cucumber.stepdefinitions"},
		tags = {"@KiwiSaverCalc"},
		monochrome = true,
		dryRun = false	
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}			
	
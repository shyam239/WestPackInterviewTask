package cucumber.stepdefinitions;

import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.*;
import utils.*;

public class KiwiSaverCalcSteps {
	
	WebDriver driver=null;
	
	Jutils jUtils=new Jutils();	
	LoggerUtil logger=new LoggerUtil();
	String scenarioName;
	
	/**
	 * Open a chrome driver before all the test
	 * @param scenario 
	 */
	@Before
	public void testSetup(Scenario scenario) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		scenarioName=scenario.getName();
	}
	

	/**
	 * Quits the driver after all the test 
	 */
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			jUtils.takeScreenShot(driver, "FailedScenario/"+scenario.getName());
		}
		driver.quit();
	}
	
	@Given("^I am in the Westpac New Zealand Limitied banking website$")
	public void i_am_in_the_Westpac_New_Zealand_Limitied_banking_website() throws Throwable {	
		MainPage mainPage=new MainPage(driver);
		mainPage.navigateToWestpacMainPage();
		Assert.assertEquals(true, mainPage.checkUrlIsEqualToMainPage("https://www.westpac.co.nz/"));
	}

	@When("^Navigated to KiwiSaver Retirment Calculator page$")
	public void navigated_to_KiwiSaver_Retirment_Calculator_page() throws Throwable {
		BankingProduct bankProd=new BankingProduct(driver);
		PersonalBankingHeader perBankingHeader=new PersonalBankingHeader(driver);
		KiwiSaverPage kiwiSaverPage=new KiwiSaverPage(driver);
		KiwiSaverRetirmentCalcPage kiwiSavRetiCalPage=new KiwiSaverRetirmentCalcPage(driver);
		bankProd.clickGivenHeader("Personal");
		Assert.assertEquals(true, bankProd.checkSlectedHeaderIs("Personal")); // to double check the Personal banking is selected
		perBankingHeader.moveMouseTo("KiwiSaver");
		perBankingHeader.clickKiwiSaverCalc();
		kiwiSaverPage.checkUrlIsEqualToKiwiSaverPage("https://www.westpac.co.nz/kiwisaver/calculators/");
		kiwiSaverPage.clickBtnClickHereToGetStarted();
		kiwiSavRetiCalPage.checkUrlIsEqualToKiwiSaverPage("https://www.westpac.co.nz/kiwisaver/calculators/kiwisaver-calculator/");
	}

	/**
	 * @param table
	 * 
	 * The data which has given by tester in feature fill will be taken as data table and utilized as input to the
	 * test. softly.assertThat is a soft assertion used here not to fail the test in case of any one of the assertion 
	 * goes fail and continue the test till the end of all the assertion but will return all the errors if exists 
	 * once executed softly.assertAll	   
	 */
	@Then("^Vlaidate the <helpIds> present with information icon$")
	public void vlaidate_the_fileds_present_with_information_icon(DataTable table) throws Throwable {
		KiwiSaverRetirmentCalcPage kiwiSavRetiCalPage=new KiwiSaverRetirmentCalcPage(driver);
		Assert.assertEquals(true, kiwiSavRetiCalPage.jsTitel("KiwiSaver Retirement Calculator - Westpac NZ"));
		List<List<String>> data = table.raw();
		kiwiSavRetiCalPage.enterCalcInput(data);
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(1).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(2).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(3).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(4).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(5).get(1))).isTrue();
		kiwiSavRetiCalPage.clickViewFindMyRate();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(6).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(8).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(9).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(11).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(12).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(13).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(14).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(15).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(16).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(17).get(1))).isTrue();
		softly.assertThat(kiwiSavRetiCalPage.chkBtnInfoIsDisplayedFor(data.get(18).get(1))).isTrue();
		softly.assertAll();
		kiwiSavRetiCalPage.switchToDefaultContent();
	}
	
	@Then("^Vlaidate the <helpIds> displays the expected help text$")
	public void vlaidate_the_helpIds_displays_the_expected_help_text(DataTable table) throws Throwable {
		KiwiSaverRetirmentCalcPage kiwiSavRetiCalPage=new KiwiSaverRetirmentCalcPage(driver);
		Assert.assertEquals(true, kiwiSavRetiCalPage.jsTitel("KiwiSaver Retirement Calculator - Westpac NZ"));
		List<List<String>> data = table.raw();
		kiwiSavRetiCalPage.switchToCalcIframe();
		kiwiSavRetiCalPage.clickGivenInfoButton(data.get(1).get(1));
		Assert.assertEquals(true, kiwiSavRetiCalPage.validateVisibleHlpIsEqlToExpHlp(data.get(1).get(2)));
	}
	
	@Then("^Enter <inputValues> to KiwiSaverRetirmentCalc$")
	public void enter_inputValues_to_KiwiSaverRetirmentCalc(DataTable table) throws Throwable {
		KiwiSaverRetirmentCalcPage kiwiSavRetiCalPage=new KiwiSaverRetirmentCalcPage(driver);
		Assert.assertEquals(true, kiwiSavRetiCalPage.jsTitel("KiwiSaver Retirement Calculator - Westpac NZ"));
		List<List<String>> data = table.raw();
		kiwiSavRetiCalPage.enterCalcInput(data);
		jUtils.takeScreenShot(driver, "InputDetailsOf_"+scenarioName);
	}
	
	@Then("^Check the projected balance is displayed$")
	public void check_the_projected_balance_is_displayed() throws Throwable {
		KiwiSaverRetirmentCalcPage kiwiSavRetiCalPage=new KiwiSaverRetirmentCalcPage(driver);
		Assert.assertTrue("Expected some value in Estimated amount but no value has populated", kiwiSavRetiCalPage.getEstimatedAmt().length()!=0);
	}

}

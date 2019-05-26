package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KiwiSaverPage extends MainPage{

	public KiwiSaverPage(WebDriver driver) {
		super(driver);
	}
	
	/* WebElements Of KiwiSaver Page*/
	
	/* Buttons */
	
	@FindBy(css="a[class='btn'][href='/kiwisaver/calculators/kiwisaver-calculator/']")
	private WebElement btnClickHereToGetStarted;
	
	@FindBy(css="div[help-id='CurrentAge'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpCurrentAge;
	
	@FindBy(css="div[help-id='EmploymentStatus'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpEmpStatus;
	
	@FindBy(css="div[help-id='PIRRate'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpPirRate;
	
	@FindBy(css="div[help-id='FindMyPIRRateQ1'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnhHlpFindMyPirRate;
	
	@FindBy(css="div[help-id='KiwiSaverBalance'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnKiwiSaverBal;
	
	@FindBy(css="div[help-id='VoluntaryContributions'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpVolContri;
	
	@FindBy(css="div[help-id='RiskProfile'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpRiskProfile;
	
	@FindBy(css="div[help-id='SavingsGoal'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnHlpSavingGoal;
	
	/* Actions or Functions of KiwiSaverPage*/
	
	public void clickBtnClickHereToGetStarted() {
		driverWaitFor(10).until(ExpectedConditions.elementToBeClickable(btnClickHereToGetStarted));
		btnClickHereToGetStarted.click();
	}
	
	public boolean checkUrlIsEqualToKiwiSaverPage(String kiwiSaverPageUrl) {
		return driver.getCurrentUrl().contains(kiwiSaverPageUrl);
	}

	
}

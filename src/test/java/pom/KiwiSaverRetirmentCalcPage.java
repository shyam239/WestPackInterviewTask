package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.JavaScripts;
import utils.Jutils;

public class KiwiSaverRetirmentCalcPage extends MainPage{

	public KiwiSaverRetirmentCalcPage(WebDriver driver) {
		super(driver);
	}
	
	JavaScripts jsUtils=new JavaScripts();
	Jutils jUtils=new Jutils();
	
	/* Elements of KiwiSaverRetirmentCalc Page*/
	
	/* Element*/
	
	@FindBy(css="a[ng-click='ctrl.toggleFindMyRate()']")
	private WebElement viewFindMyRate;
	
	@FindBy(css="div[class='field-message message-info ng-binding'][ng-show='helpService.visible(field.helpId)'][ng-bind-html='helpService.helpText(field.helpId)']")
	private WebElement visibleHelp;

	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] span[class='ng-scope']")
	private WebElement selectedEmpStatus;
	
	@FindBy(css="div[ng-model='ctrl.data.PIRTaxableIncome'] [ng-bind-html='selectedContent']")
	private WebElement selectedAnualIncome;
	
	@FindBy(css="div[ng-model='ctrl.data.PIRRate'] [ng-bind-html='selectedContent']")
	private WebElement selectedPriRate;
	
	@FindBy(css="div[ng-show='ctrl.view.resultsPanelRevealed'] span[class='result-value result-currency ng-binding']")
	private WebElement estimatedAmt;
	
	@FindBy(css="div[ng-if='hasPeriod'] span[class='ng-binding ng-scope']")
	private WebElement volContriFreq;
	
	/* dropdown list*/
	
	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] li[value='employed']")
	private WebElement employed;
	
	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] li[value='self-employed']")
	private WebElement slfEmployed;
	
	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] li[value='not-employed']")
	private WebElement notEmployed;
	
	/* textbox*/
	
	@FindBy(css="div[help-id='CurrentAge'] input[type='text']")
	private WebElement txtCurrentAge;
	
	@FindBy(css="div[help-id='AnnualIncome'] input[type='text']")
	private WebElement txtAnnualIncome;
	
	@FindBy(css="div[help-id='KiwiSaverBalance'] input[type='text']")
	private WebElement txtCurKiwSavBal;
	
	@FindBy(css="div[help-id='VoluntaryContributions'] input[type='text']")
	private WebElement txtVolunContri;
	
	@FindBy(css="div[help-id='SavingsGoal'] input[type='text']")
	private WebElement txtSavingGoal;
	
	/* Button*/
	
	@FindBy(css="div[help-id='CurrentAge'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']")
	private WebElement btnInfoCurrentAge;
	
	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] div[ng-click='toggle()']")
	private WebElement arrowEmpDropDown;
	
	@FindBy(css="button[ng-click='ctrl.toggleFindMyRate(ctrl.data.foundPIRRate)']")
	private WebElement btnSelectTaxableIncome;
	
	@FindBy(css="input[value='low']")
	private WebElement btnRiskProfLow;
	
	@FindBy(css="input[value='medium']")
	private WebElement btnRiskProfMedium;
	
	@FindBy(css="input[value='high']")
	private WebElement btnRiskProfHigh;
	
	@FindBy(css="button[ng-click='ctrl.showResultsPanel()']")
	private WebElement btnShowResultPanel;

	
	/* List*/
	
	@FindBy(tagName="iframe")
	private List<WebElement> lstIframe;
	
	@FindBy(css="div[ng-model='ctrl.data.EmploymentStatus'] div[class='control select-control  no-selection'] div[class='label'] span[class='ng-scope']")
	private List<WebElement> lstEmpStatus;
	
	@FindBy(css="div[ng-model='ctrl.data.PIRTaxableIncome'] li[ng-click='select()'] span[class='ng-scope']")
	private List<WebElement> lstTaxableIncome;
	
	@FindBy(css="div[ng-model='ctrl.data.PIRRate'] li[ng-click='select()'] span[class='ng-binding ng-scope']")
	private List<WebElement> lstPriRate;
	
	@FindBy(css="div[ng-if='hasPeriod'] li[ng-click='select()']")
	private List<WebElement> lstSelVolContriFrequ;
	
	
	/* Actions or functions of KiwiSaverRetirmentCalc Page*/
	
	public String getEstimatedAmt() {
		jsUtils.moveToElement(estimatedAmt,driver);
		return estimatedAmt.getText().replaceAll("\\s+","");
	}
	
	/**
	 * Checks the show view your kiwisaver retirment projection button displayed and clicks
	 */
	public void clickBtnShowResultPanel() {
		driverWaitFor(10).until(ExpectedConditions.visibilityOf(btnShowResultPanel));
		btnShowResultPanel.click();
	}
	
	/**
	 * @param frequency
	 * select given voluntary contribution frequency
	 * valid values are One-off/Weekly/Fortnightly/Monthly/Annually 
	 */
	public void selectVolContriFrequ(String frequency) {
		WebElement ele=null;
		volContriFreq.click();
		for (int i=0;i<lstSelVolContriFrequ.size();i++) {
			ele=(WebElement) lstSelVolContriFrequ.get(i);
			if (ele.getText().equals(frequency)) {
				ele.click();
			break;
			}
		}
		
	}
	
	/**
	 * click low risk profile
	 */
	public void clickBtnRiskProfLow() {
		btnRiskProfLow.click();
	}
	
	/**
	 * click high risk profile
	 */
	public void clickBtnRiskProfMedium() {
		btnRiskProfMedium.click();
	}
	
	/**
	 * click high risk profile
	 */
	public void clickBthRiskProfHigh() {
		btnRiskProfHigh.click();
	}
	
	/**
	 * @param savGoal
	 * enter saving goal
	 */
	public void enterSavGoal(String savGoal) {
		txtSavingGoal.sendKeys(savGoal);
	}
	
	/**
	 * @param empStatus
	 * to click valid Employment status (Employed/Self-employed/Not employed) 
	 * 
	 */
	public void selectEmpStat(String empStatus) {
		if(empStatus.equals("Employed")) {
			arrowEmpDropDown.click();
			employed.click();
		}else if (empStatus.equals("Self-employed")) {
			arrowEmpDropDown.click();
			slfEmployed.click();
		}else if (empStatus.equals("Not employed")) {
			arrowEmpDropDown.click();
			notEmployed.click();
		}
	}
	
	/**
	 * @param txableIncome
	 * Enter the taxable income
	 */
	public void selectTaxableIncome(String txableIncome) {
		WebElement ele=null;
		try {
			selectedAnualIncome.click();
		} catch (Exception e) {
			clickViewFindMyRate();
			selectedAnualIncome.click();
		}
		for (int i=0;i<lstTaxableIncome.size();i++) {
			ele=(WebElement) lstTaxableIncome.get(i);
			if (ele.getText().equals(txableIncome)) {
				ele.click();
			break;
			}
		}
	}
	
	
	/**
	 * @param pRIRate
	 * 
	 * Selects given PRI Rate from rates, valid values are
	 * 10.5%/17.5%/28%
	 */
	public void selectPRIRate(String pRIRate) {
		WebElement ele=null;
		try {
			selectedPriRate.click();
		} catch (Exception e) {
			clickViewFindMyRate();
			selectedPriRate.click();
		}
		for (int i=0;i<lstPriRate.size();i++) {
			ele=(WebElement) lstPriRate.get(i);
			if (ele.getText().equals(pRIRate)) {
				ele.click();
			break;
			}
		}
	}
	
	/**
	 * Click select button of my taxable income
	 */
	public void clickBtnSelectTaxableIncome() {
		btnSelectTaxableIncome.click();
	}
	
	/**
	 * @param curKiwiSavBal
	 * Enter current kiwi saver balance
	 */
	public void enterCurrentKiwiSavBal(String curKiwiSavBal) {
		txtCurKiwSavBal.sendKeys(curKiwiSavBal);
	}
	
	public void enterVoluContribution(String volContri) {
		txtVolunContri.sendKeys(volContri);
	}
	
	/**
	 * @param currentAge
	 * enters given age into the CurrentAge field
	 */
	public void enterCurrentAge(String currentAge) {
		driverWaitFor(10).until(ExpectedConditions.visibilityOf(txtCurrentAge));
		txtCurrentAge.sendKeys(currentAge);
	}
	
	/**
	 * @param anualIncome
	 * enters given value into the Salary or wages per year (before tax) field
	 */
	public void enterAnnualIncome(String anualIncome) {
		driverWaitFor(10).until(ExpectedConditions.visibilityOf(txtAnnualIncome));
		jUtils.sleepFor(30);
		txtAnnualIncome.clear();
		txtAnnualIncome.sendKeys(anualIncome);
	}
	
	/**
	 * clicks Find My Rate link
	 */
	public void clickViewFindMyRate() {
		driverWaitFor(10).until(ExpectedConditions.elementToBeClickable(viewFindMyRate));
		viewFindMyRate.click();
	}
	
	/**
	 * @param ksMemContri
	 * Clicks kiwisaver mem contribution based on the given value, wrong entered value will be captured in logger
	 */
	public void clickKiwiSavMemContibution(String ksMemContri) {
		WebElement ele=driver.findElement(By.cssSelector("div[help-id='KiwiSaverMemberContribution']  input[value='"+ksMemContri+"']"));
		try {
			ele.click();
		} catch (Exception e) {
			//Write to logger
		}
	}
	
	/**
	 * @param infoBtnName
	 * clicks the given information button/icon which provides information about the field.
	 * highlighting and takes screenshot of what it is going to click
	 */
	public void clickGivenInfoButton(String infoBtnName) {
		WebElement btnInfo=driver.findElement(By.cssSelector("div[help-id='"+infoBtnName+"'][class='ng-isolate-scope']>"
				+ "button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']"));
		try {
			driverWaitFor(10).until(ExpectedConditions.elementToBeClickable(btnInfo));
			btnInfo.click();
			jsUtils.highLightElement(btnInfo,driver);
			jUtils.takeScreenShot(driver, infoBtnName);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	/**
	 * @param infoBtnName
	 * @return
	 * Checks the presents of given information button/icon which provides information about the field. 
	 * highlighting and takes screenshot of what the method has checked and returns true if element is present,
	 * if element is not present then returns false
	 */
	public boolean chkBtnInfoIsDisplayedFor(String infoBtnName) {
		WebElement btnInfo = null;
		boolean rslt = false;
		try {
			btnInfo = driver.findElement(By.cssSelector("div[help-id='"+infoBtnName+"']>"
					+ "button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']"));
			jsUtils.moveToElement(btnInfo,driver);
			jsUtils.highLightElement(btnInfo,driver);
			jUtils.takeScreenShot(driver, infoBtnName);
			rslt=btnInfo.isDisplayed();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return rslt;
	}
	
	/**
	 * @param infoBtnName
	 * @return
	 * returns true if info button or icon element is present, if element is not present then returns false
	 */
	public boolean btnInfoIsDisplayedFor(String infoBtnName) {
		WebElement btnInfo=driver.findElement(By.cssSelector("div[help-id='"+infoBtnName+"'][class='ng-isolate-scope']>button[class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']"));
		return btnInfo.isDisplayed();
	}
	
	/**
	 * @param kiwiSavRetCalPageUrl
	 * @return
	 * Checks if the given url is equal to current page url and returns boolean
	 */
	public boolean checkUrlIsEqualToKiwiSaverPage(String kiwiSavRetCalPageUrl){
		return driver.getCurrentUrl().contains(kiwiSavRetCalPageUrl);
	}
	
	/**
	 * @return
	 * returns number of iframe in the page
	 */
	public int getNumberOfIframeInKiwiSaverCalcPage() {
		return lstIframe.size();
	}
	
	/**
	 * @return
	 * switchs the driver control to the iframe if which contains current age info button and 
	 * returns the iframe as WebElement
	 */
	public WebElement switchToCalcIframe() {
		WebElement ele=null;
		for(int i=0;i<=lstIframe.size()-1;i++) {
			ele=lstIframe.get(i);
			driver.switchTo().frame(ele);
			if(btnInfoIsDisplayedFor("CurrentAge")) {
				break;
			}
		}
		return ele;
	}
	
	/**
	 * Switch back to default page
	 */
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * @return
	 * Checks any help text is displayed and returns boolean value
	 */
	public boolean visibleHelpIsDisplayed() {
		return visibleHelp.isDisplayed();
	}
	
	/**
	 * @param expHelp
	 * @return
	 * validates the visible help text is equal to expeced help text and 
	 * returns the boolean value
	 */
	public boolean validateVisibleHlpIsEqlToExpHlp(String expHelp) {
		boolean rslt=false;
		if(visibleHelpIsDisplayed()) {
			rslt=expHelp.equals(visibleHelp.getText());
			jsUtils.highLightElement(visibleHelp,driver);
			jUtils.takeScreenShot(driver, expHelp);
			}
		return rslt;
	}
	
	/**
	 * @param data
	 * 
	 * List<List<String>> data contains the input data from feature file and enters the input if the relevant data is not "NA"
	 * Switch the driver control from normal to iframe, enters the input and switch back the control from iframe to normal
	 * 
	 */
	public void enterCalcInput(List<List<String>> data) {
		switchToCalcIframe();
		
		if(!data.get(1).get(2).equals("NA")) {
			enterCurrentAge(data.get(1).get(2));
		}
		if(!data.get(2).get(2).equals("NA")) {
			selectEmpStat(data.get(2).get(2));
		}
		if(!data.get(3).get(2).equals("NA")) {
			enterAnnualIncome(data.get(3).get(2));
		}
		if(!data.get(4).get(2).equals("NA")) {
			clickKiwiSavMemContibution(data.get(4).get(2));
		}
		if(!data.get(5).get(2).equals("NA")) {
			selectPRIRate(data.get(5).get(2));
		}
		if(!data.get(7).get(2).equals("NA")) {
			clickViewFindMyRate();
			selectTaxableIncome(data.get(7).get(2));
		}
		if(!data.get(8).get(2).equals("NA")) {
			enterCurrentKiwiSavBal(data.get(8).get(2));
		}
		if(!data.get(9).get(2).equals("NA")) {
			enterVoluContribution(data.get(9).get(2));
		}
		if(!data.get(10).get(2).equals("NA")) {
		selectVolContriFrequ(data.get(10).get(2));
		}
		
		if(data.get(11).get(2).equals("Low")) {
			clickBtnRiskProfLow();
		}else if(data.get(11).get(2).equals("Medium")) {
			clickBtnRiskProfMedium();
		}else if(data.get(11).get(2).equals("High")){
			clickBthRiskProfHigh();
		}
		
		if(!data.get(12).get(2).equals("NA")) {
			enterSavGoal(data.get(12).get(2));
		}
		
		if(!data.get(6).get(2).equals("NA")) {
			clickViewFindMyRate();
		}

		clickBtnShowResultPanel();
		
	}
	
	/* Javascript Executer*/
	
	public void clickCurrentAgeButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"div[help-id='CurrentAge'] button[type='button']\".click");
	}
	
	public boolean jsTitel(String kiwiSaverRetCalcTitle) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		String docTitle=js.executeScript("return document.title;").toString();
		return docTitle.equals(kiwiSaverRetCalcTitle);
	}
	
	

}

package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Shyam Periyasamy
 * 
 * This class contains the common objects of all the personal banking sw-ubermenu-selection-link 
 * like Everyday money, Home loans, Credit cards, Personal loan, Insurance, 
 * KiwiSaver, Investments, FX,travel & migrant, Managing your money.
 * 
 * the sw-ubermenu-selection-link mentioned in the e.g will never change even if we navigate to one of 
 * the ubermenu-item-link of the these sw-ubermenu-selection-link 
 * 
 * e.g if we click 'interest rates' under Everyday Money we will be navigate to 
 * interest rates page but still we will be able to see all these sw-ubermenu-selection-link in that 
 * page also.
 *
 */
public class PersonalBankingHeader extends MainPage {

	public PersonalBankingHeader(WebDriver driver) {
		super(driver);
	}
	
	/* Common WebElements of personal banking */
	
	/*WebElements*/
	
	@FindBy(css="a[id='logo'][class='sw-header-logo']")
	private WebElement imgLogo;
	
	@FindBy(css="a[class='sw-ubermenu-section-link '][id='ubermenu-section-link-managing-your-money-ps']")
	private WebElement lnkManageYourMoney;
	
	@FindBy(css="a[class='sw-ubermenu-section-link '][id='ubermenu-section-link-kiwisaver-ps']")
	private WebElement lnkKiwiSaver;
	
	/* Buttons */
	
	@FindBy(css="a[class='btn btn-primary btn-block btn-lg'][id='ubermenu-item-cta-kiwisaver-calculators-ps']")
	private WebElement btnKiwiSaverCalc;
	
	/* List */
	
	@FindBy(css="a[class='sw-ubermenu-section-link '][id^='ubermenu-section-link-']")
	private List<WebElement> lstPersonalHeader;

	/* Actions or functions of personal banking header */
	
	/**
	 * Identifying ubermenu based on get-text attribute and moving mouse towards the identified web element
	 * And vaild ubermenu's are Everyday money, Home loans, Credit cards, Personal loan, Insurance, 
	 * KiwiSaver, Investments, FX,travel & migrant, Managing your money
	 */
	public void moveMouseTo(String uberMenu) {
		WebElement ele=null;

		int headingLinkCommon=lstPersonalHeader.size();
		
		for (int i=0;i<headingLinkCommon;i++) {
			ele=lstPersonalHeader.get(i);
			if (ele.getText().equals(uberMenu)) {
			Actions act=new Actions(driver);
			act.moveToElement(ele).perform();
			break;
			}
		}
	}
	
	/**
	 * To click KiwiSaver calculator button
	 */
	public void clickKiwiSaverCalc() {
		driverWaitFor(10).until(ExpectedConditions.elementToBeClickable(btnKiwiSaverCalc));
		btnKiwiSaverCalc.click();
	}
	

}

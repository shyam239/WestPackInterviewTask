package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Shyam Periyasamy
 * This class contains the common objects of all the Banking sw-header-menu-link 
 * like Personal, Business, Agribusiness, Institutional, Who We Are, Growing NZ.
 */
public class BankingProduct extends MainPage {

	public BankingProduct(WebDriver driver) {
		super(driver);
	}
	
	/* WebElements of sw-header-menu-link*/
	
	/* WebElement*/
	
	@FindBy(css="a[class='sw-header-menu-link selected']")
	private WebElement selectedWebElement;
	
	/* List*/
	
	@FindBy(css="a[class='sw-header-menu-link ']")
	private List<WebElement> lstHeaders;
	
	/* Actions or Functions of sw-header-menu-link*/
	
	/**
	 * @param header
	 * @return
	 * This method will check the selected header is equal to given header and return true
	 * only the given header is equal to selected header
	 */	
	public boolean checkSlectedHeaderIs(String header) {
		driverWaitFor(10).until(ExpectedConditions.elementToBeClickable(selectedWebElement));
		return selectedWebElement.getText().equals(header);
	}
	
	/**
	 * @param header
	 * This method will click the given header, valid headers are 
	 * Personal, Business, Agribusiness, Institutional, Who We Are, Growing NZ
	 */	
	public void clickGivenHeader(String header) {
			WebElement ele=null;
			int headingLinkCommon=lstHeaders.size();		
			for (int i=0;i<headingLinkCommon;i++) {
				ele=(WebElement) lstHeaders.get(i);
				if (ele.getText().equals(header)) {
					ele.click();
				break;
				}
			}
		}
	
}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Shyam Periyasamy
 * This class contains main page elements and related actions or funtions, methods names are self explanatory if not comment has been added
 */
public class MainPage {

	protected WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Actions of MainPage*/
	
	public void navigateToWestpacMainPage(){
		driver.navigate().to("https://www.westpac.co.nz/");
	}
	
	public boolean checkUrlIsEqualToMainPage(String westpacMainPageUrl) {
		return driver.getCurrentUrl().contains(westpacMainPageUrl);
	}
	
	/*Timer*/
	
	public WebDriverWait driverWaitFor(int sec) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
		return wait;
	}
	
	
	
	
}

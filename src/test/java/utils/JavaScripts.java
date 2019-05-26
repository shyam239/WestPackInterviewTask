package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripts{

	Jutils jutils=new Jutils();
	
	/**
	 * @param colour
	 * @param element
	 * @param driver
	 * 
	 * To change the background color of the given element
	 * 
	 */
	public void changeColour(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background = '"+ color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param num
	 * @param element
	 * @param driver
	 * 
	 * Flashing the background color for given number of times 
	 * 
	 */
	public void flashBackGroundOfElement(int num, WebElement element, WebDriver driver) {
		String bgColor=element.getCssValue("background-color");

		for(int i=0;i<=num;i++) {
			changeColour(bgColor,element,driver);
		}
	}
	
	public void highLightElement(WebElement ele, WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='4px dotted blue'", ele);
	}
	
	public void moveToElement(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		jutils.sleepFor(50);
	}
}

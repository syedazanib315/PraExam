package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class MonthsDropDownPage extends BasePage {
	
	WebDriver driver;
	
	public MonthsDropDownPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/select[3]"))
	WebElement MONTHS_DROPDOWN_FIELD_LOCATOR;
	

	
	// Methods to interact with the elements
	public void checkMonthNameDropDown() {
		  BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/select[3]"));
		  BasePage.dropDownMonths(MONTHS_DROPDOWN_FIELD_LOCATOR); 
		  MONTHS_DROPDOWN_FIELD_LOCATOR.click();
		  
		  }
	
	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(200,1000)");
		//js.executeScript("arguments[0].scrollIntoView();",MONTHS_DROPDOWN_FIELD_LOCATOR);	
	}
	  
}

//div[@class = 'advance-controls']/span/select[3]
//select[@name = 'due_month']

//"arguments[0]" means first index of page starting at 0.

//Where an " Element " is the locator on the web page. 

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class AddCategoryPage extends BasePage {

	WebDriver driver;
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/input[1]"))
	WebElement ADD_CATEGORY_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/input[2]"))
	WebElement ADD_CATEGORY_SUBMIT_BUTTON_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/select[1]"))
	WebElement CHECK_CATEGORY_UNDER_DROPDOWN_LOCATOR;
	
	
	// Methods to interact with the elements

	public void insertCategory(String addcategory) {
		String enteredName = addcategory + BasePage.randomNumGenerator();
		BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[1]"));
		ADD_CATEGORY_FIELD_LOCATOR.sendKeys(enteredName);
	}
	
	public void clickAddCategoryButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[1]"));
		ADD_CATEGORY_SUBMIT_BUTTON_FIELD_LOCATOR.click();
	}
	
	
	public void checkCategoryName(String categoryname) {	
		BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/select[1]"));
		BasePage.dropDown(CHECK_CATEGORY_UNDER_DROPDOWN_LOCATOR, categoryname);
	}
	
	
}



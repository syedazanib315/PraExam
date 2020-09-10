package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class CategoryAlreadyExistsPage {

	WebDriver driver;
	public CategoryAlreadyExistsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/input[1]"))
	WebElement CATEGORY_NAME_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/input[2]"))
	WebElement CATEGORY_SUBMIT_BUTTON_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//div[@class = 'advance-controls']/span/select[1]"))
	WebElement CATEGORY_UNDER_DROPDOWN_LOCATOR;
	
	

	
	// Methods to interact with the elements

	public void insertCategoryName(String addcategory) {	
		BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[1]"));
		CATEGORY_NAME_FIELD_LOCATOR.sendKeys(addcategory);
	}
	
	public void clickOnAddCategoryButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//div[@class = 'advance-controls']/span/input[2]"));
		CATEGORY_SUBMIT_BUTTON_FIELD_LOCATOR.click();
	}
	
	
	/*
	 * public void checkCategoryNameDropDown(String categoryname) {
	 * BasePage.waitForElement(driver, 2,
	 * By.xpath("//div[@class = 'advance-controls']/span/select[1]"));
	 * BasePage.dropDown(CATEGORY_UNDER_DROPDOWN_LOCATOR, categoryname); }
	 */
	
	
}

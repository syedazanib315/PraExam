package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class ListAllCheckBoxRemovedPage extends BasePage {

	WebDriver driver;
	
	public ListAllCheckBoxRemovedPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// Element Library
			@FindBy(how = How.NAME, using = ("allbox"))
			WebElement CLICK_ON_ALL_CHECKBOX_LOCATOR;
			
			@FindBy(how = How.XPATH, using = ("//div[@class = 'controls']/input[1]"))
			WebElement LIST_ALL_REMOVE_BUTTON_FIELD_LOCATOR;
			
		
			// Methods to interact with the elements
			public void clickOnAllCheckBox() {
				CLICK_ON_ALL_CHECKBOX_LOCATOR.click();
				
			}
			
			public void ListAllCheckBoxRemoveButton() {			
				LIST_ALL_REMOVE_BUTTON_FIELD_LOCATOR.click();
				
				
			}
}

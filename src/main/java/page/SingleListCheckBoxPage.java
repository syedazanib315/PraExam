package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleListCheckBoxPage {

	WebDriver driver;
	
	public SingleListCheckBoxPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// Element Library
		@FindBy(how = How.NAME, using = ("todo[5]"))
		WebElement SINGLE_LIST_CHECKBOX_LOCATOR;
		
		@FindBy(how = How.XPATH, using = ("//div[@class = 'controls']/input[1]"))
		WebElement SINGLE_LIST_REMOVE_BUTTON_FIELD_LOCATOR;
		
		
		// Methods to interact with the elements
		public void singleListCheckBox() {
			SINGLE_LIST_CHECKBOX_LOCATOR.click();
		}
		
		public void singleListRemoveButton() {
			SINGLE_LIST_REMOVE_BUTTON_FIELD_LOCATOR.click();
		}
}

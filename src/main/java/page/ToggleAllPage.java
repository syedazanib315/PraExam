package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllPage {
	
	WebDriver driver;
	
	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
		@FindBy(how = How.NAME, using = ("allbox"))
		WebElement TOGGLE_ALL_Click_LOCATOR;
		
	
		// Methods to interact with the elements
		public void clickOnToggleButton() {
			TOGGLE_ALL_Click_LOCATOR.click();
			
		}

}

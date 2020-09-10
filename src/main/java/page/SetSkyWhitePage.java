package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class SetSkyWhitePage {
	
WebDriver driver;
	
	public SetSkyWhitePage(WebDriver driver) {
		this.driver = driver; 
	}
	

	// Element Library
	
	@FindBy(how = How.XPATH, using = ("//button[text() = 'Set White Background']"))
	WebElement SETSKYWHITE_BUTTON_EXIST_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//span[@id = 'extra']/button[2]"))
	WebElement SETSKYWHITE_BUTTON_LOCATOR;
	
	
	// Methods to interact with the elements
	
	public void whiteButtonExist() {
		
		SETSKYWHITE_BUTTON_EXIST_LOCATOR.getText();
		
	}
	public void clickOnAddSkyWhiteButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//span[@id = 'extra']/button[2]"));
		SETSKYWHITE_BUTTON_LOCATOR.click();
		
	}

}

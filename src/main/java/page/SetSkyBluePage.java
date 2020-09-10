package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class SetSkyBluePage {
	
	WebDriver driver;
	
	public SetSkyBluePage(WebDriver driver) {
		this.driver = driver; 
	}
	

	// Element Library
	
	
	@FindBy(how = How.XPATH, using = ("//button[text() = 'Set SkyBlue Background']"))
	WebElement SETSKYBLUE_BUTTON_EXIST_LOCATOR;
	
	@FindBy(how = How.XPATH, using = ("//span[@id = 'extra']/button[1]"))
	WebElement SETSKYBLUE_BUTTON_LOCATOR;
	
	
	// Methods to interact with the elements
	
	public void SkeyBlueButtonExist() {
		
		SETSKYBLUE_BUTTON_EXIST_LOCATOR.getText();
		
	}
	public void clickOnAddSkeyBlueButton() {
		BasePage.waitForElement(driver, 2, By.xpath("//span[@id = 'extra']/button[1]"));
		SETSKYBLUE_BUTTON_LOCATOR.click();
		
	}

}

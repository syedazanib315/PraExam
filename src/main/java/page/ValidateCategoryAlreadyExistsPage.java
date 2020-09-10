package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateCategoryAlreadyExistsPage {
	
WebDriver driver;
	
	public ValidateCategoryAlreadyExistsPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//a[text()='Nevermind']")
	WebElement VALIDATE_CATEGORY_ALREADY_EXISTS_LOCATER;


	// Methods to interact with the elements

	public void varifyCategoryAlready() {
		Assert.assertEquals(VALIDATE_CATEGORY_ALREADY_EXISTS_LOCATER.getText(), "Nevermind", "Wrong page!!!");	
	}

}



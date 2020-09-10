package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ValidateAddCategoryPage {
	
	WebDriver driver;
	
	public ValidateAddCategoryPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//div[@id = 'label-first']/b")
	WebElement VALIDATE_ADD_CATEGORY_LOCATER;


	// Methods to interact with the elements

	public void varifyAddCate() {
		Assert.assertEquals(VALIDATE_ADD_CATEGORY_LOCATER.getText(), "NSS-TODO List v 1.1", "Wrong page!!!");
	}


}

package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class ValidateWarningPage {
	
	
	WebDriver driver;
	public ValidateWarningPage(WebDriver driver) {

		this.driver = driver;

	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//body/b[1]")
	WebElement VALIDATE_WARNING_LOCATER;


	// Methods to interact with the elements

	public void varifyMainPageElement() {
		Assert.assertEquals(VALIDATE_WARNING_LOCATER.getText(), "Warning", "Wrong page!!!");
	}

}

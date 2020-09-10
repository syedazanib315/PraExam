package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SetSkyBluePage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class SkyBlueSteps {
	
	WebDriver driver;
	SetSkyBluePage skyblue;
	ValidateAddCategoryPage validatebluepage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		skyblue = PageFactory.initElements(driver, SetSkyBluePage.class);
		validatebluepage = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		
	}

	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		skyblue.SkeyBlueButtonExist();
	   
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		skyblue.clickOnAddSkeyBlueButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		
	    validatebluepage.varifyAddCate();
	}


}

package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SetSkyWhitePage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class WhiteSteps {

	WebDriver driver;
	SetSkyWhitePage whitesky;
	ValidateAddCategoryPage whitevalidate;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		whitesky = PageFactory.initElements(driver, SetSkyWhitePage.class);
		whitevalidate = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		
	}
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
	    whitesky.whiteButtonExist();
	}
	
	
	/*
	 * @When("^I click on the button$") public void i_click_on_the_button() throws
	 * Throwable { whitesky.clickOnAddSkyWhiteButton();
	 * 
	 * }
	 */

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		whitevalidate.varifyAddCate();
	}

}

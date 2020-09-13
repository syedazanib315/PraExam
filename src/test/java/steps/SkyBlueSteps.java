package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SetSkyBluePage;
import page.SetSkyWhitePage;
import util.BrowserFactory;

public class SkyBlueSteps {
	
	WebDriver driver;
	SetSkyBluePage skyblue;
	SetSkyWhitePage whitesky;
	
	
	
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		skyblue = PageFactory.initElements(driver, SetSkyBluePage.class);
		whitesky = PageFactory.initElements(driver, SetSkyWhitePage.class);
			
	}

	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		skyblue.SkeyBlueButtonExist();
	   
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
		skyblue.clickOnAddSkeyBlueButton();
		whitesky.clickOnAddSkyWhiteButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		
			skyblue.validateBlueButton();
	   
	}
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
	    whitesky.whiteButtonExist();
	}
	
	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		whitesky.validateWhiteButton();
	}



}

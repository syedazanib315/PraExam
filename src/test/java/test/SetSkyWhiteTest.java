package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.SetSkyWhitePage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class SetSkyWhiteTest {
	
WebDriver driver;
	
	@Test
	public void SetSkyWhiteAndValidate() {
		
		
		driver = BrowserFactory.init();
		
		
		SetSkyWhitePage setSkyWhite = PageFactory.initElements(driver, SetSkyWhitePage.class);
		setSkyWhite.clickOnAddSkyWhiteButton();
		
		
		
		ValidateAddCategoryPage validateSkyWhite = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateSkyWhite.varifyAddCate();
	}

}

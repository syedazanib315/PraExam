package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.SetSkyBluePage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class SetSkyBlueTest {

	
WebDriver driver;
	
	@Test
	public void SetSkyBlueAndValidate() {
		
		
		driver = BrowserFactory.init();
		
		
		SetSkyBluePage setSkyBlue = PageFactory.initElements(driver, SetSkyBluePage.class);
		setSkyBlue.clickOnAddSkeyBlueButton();
		
		
		
		ValidateAddCategoryPage validateSkeyBlue = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateSkeyBlue.varifyAddCate();
	}
}

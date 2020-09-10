package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.ToggleAllPage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class ToggleAllTest {
	WebDriver driver;
	
@Test
	public void validateToggleAll() {
		
		
		driver = BrowserFactory.init();
		
		ToggleAllPage toggleAll = PageFactory.initElements(driver, ToggleAllPage.class);
		toggleAll.clickOnToggleButton();
		
		
		ValidateAddCategoryPage validateToggleAll = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateToggleAll.varifyAddCate();
		
	}
}

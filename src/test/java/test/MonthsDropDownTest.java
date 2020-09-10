package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MonthsDropDownPage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class MonthsDropDownTest {
	
WebDriver driver;
	
	@Test
	public void MonthDropDownListAndValidate() {
		
		
		driver = BrowserFactory.init();
		
		
		MonthsDropDownPage monthDropDown = PageFactory.initElements(driver, MonthsDropDownPage.class);
		monthDropDown.checkMonthNameDropDown();
		//monthDropDown.scrollDown();
		
		ValidateAddCategoryPage validateMonths = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateMonths.varifyAddCate();
	}

}

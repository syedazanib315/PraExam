package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.SingleListCheckBoxPage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class SingleListCheckBoxTest {

WebDriver driver;
	
	@Test
	public void validateListCheckBox() {
		
		
		driver = BrowserFactory.init();
		
		SingleListCheckBoxPage singleList = PageFactory.initElements(driver, SingleListCheckBoxPage.class);
		singleList.singleListCheckBox();
		singleList.singleListRemoveButton();
		
		ValidateAddCategoryPage validateSingleList = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateSingleList.varifyAddCate();
	}
}

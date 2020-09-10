package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CategoryAlreadyExistsPage;
import page.ValidateCategoryAlreadyExistsPage;
import util.BrowserFactory;

public class CategoryAlreadyExistsTest {

WebDriver driver;
	
	@Test
	public void CategoryAlreadyExistsAndValidate() {
		
		
		driver = BrowserFactory.init();
		
		
		CategoryAlreadyExistsPage CategoryAllready = PageFactory.initElements(driver, CategoryAlreadyExistsPage.class);
		CategoryAllready.insertCategoryName("szanib");
		CategoryAllready.clickOnAddCategoryButton();
		//CategoryAllready.checkCategoryNameDropDown("szanib");
		
		ValidateCategoryAlreadyExistsPage validateCatAlready = PageFactory.initElements(driver, ValidateCategoryAlreadyExistsPage.class);
		validateCatAlready.varifyCategoryAlready();
	}
}

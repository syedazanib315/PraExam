package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import page.ValidateAddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	WebDriver driver;
	
	@Test
	public void addCategoryAndValidate() {
		
		
		driver = BrowserFactory.init();
		
		
		AddCategoryPage addCategory = PageFactory.initElements(driver, AddCategoryPage.class);
		addCategory.insertCategory("szanib");
		addCategory.clickAddCategoryButton();
		addCategory.checkCategoryName("szanib");
		
		
		ValidateAddCategoryPage validateAddCat = PageFactory.initElements(driver, ValidateAddCategoryPage.class);
		validateAddCat.varifyAddCate();
	}

}

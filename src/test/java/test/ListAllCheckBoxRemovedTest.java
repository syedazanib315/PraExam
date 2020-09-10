package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.ListAllCheckBoxRemovedPage;
import page.ValidateWarningPage;
import util.BrowserFactory;

public class ListAllCheckBoxRemovedTest {
	
WebDriver driver;
	
	@Test
	public void validateAllListCheckBoxRemoved() {
		
		
		driver = BrowserFactory.init();
		
		ListAllCheckBoxRemovedPage listAllRemoved = PageFactory.initElements(driver, ListAllCheckBoxRemovedPage.class);
		listAllRemoved.clickOnAllCheckBox();
		listAllRemoved.ListAllCheckBoxRemoveButton();
		
		ValidateWarningPage removedNValidate = PageFactory.initElements(driver, ValidateWarningPage.class);
		removedNValidate.varifyMainPageElement();
	}
}

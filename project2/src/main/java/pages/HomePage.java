package pages;

import static utils.BrowserUtils.driver;

import locators.HomePageLocators;
import utils.ReportUtils;

public class HomePage extends HomePageLocators {

	public void verifyHomePage() throws Exception {
		if (driver.findElement(text_customerLogin).isDisplayed()) {
			ReportUtils.updateReport("pass", "user navigaqted to homepage successfully");
		} else {
			ReportUtils.updateReport("fail", "user navigated to homepage is not successfully");
		}

	}

	public void navigateToRegisterationPage() throws Exception {
		driver.findElement(lnk_register).click();
		ReportUtils.updateReport("info", "user navigated to tregistartion page successfully");

	}

	public void verifyRegistrationSuccessfull() throws Exception {
		if (driver.findElement(text_Your_account_was_created_successfully).isDisplayed()) {
			ReportUtils.updateReport("pass", "Registartion is successfully");
		} else {
			ReportUtils.updateReport("fail", "registartion is not successfully");
		}

	}
}

package pages;

import static utils.BrowserUtils.driver;

import locators.RegistartionPageLocators;
import utils.ReportUtils;

public class RegistartionPage extends RegistartionPageLocators{

	public void verifyregistartionPage() throws Exception {
		if (driver.findElement(text_Signing_up).isDisplayed()) {
			ReportUtils.updateReport("pass", "navigated to registration page successfully");
		} else {
			ReportUtils.updateReport("fail", "navigated to registration page is not successfully");
		}
		
	}

	public void enterValidDetailsAndSubmit(String userdata)throws Exception  {
		driver.findElement(edit_firstname).sendKeys(userdata);
		driver.findElement(edit_lastname).sendKeys(userdata);
		driver.findElement(edit_street).sendKeys(userdata);
		driver.findElement(edit_city).sendKeys(userdata);
		driver.findElement(edit_state).sendKeys(userdata);
		driver.findElement(edit_zipcode).sendKeys(userdata);
		driver.findElement(edit_phoennumber).sendKeys(userdata);
		driver.findElement(edit_ssn).sendKeys(userdata);
		driver.findElement(edit_username).sendKeys(userdata);
		driver.findElement(edit_pswd).sendKeys(userdata);
		driver.findElement(edit_repeatpswd).sendKeys(userdata);
		driver.findElement(btn_register).click();
		ReportUtils.updateReport("info", "user entered valid details and submitted successfully");
		
	}

}

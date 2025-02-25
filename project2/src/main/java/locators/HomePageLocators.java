package locators;

import org.openqa.selenium.By;

public class HomePageLocators {
	public By text_customerLogin = By.xpath("//h2[normalize-space()='Customer Login']");
	public By lnk_register = By.xpath("//a[normalize-space()='Register']");
	public By text_Your_account_was_created_successfully = By
			.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

}

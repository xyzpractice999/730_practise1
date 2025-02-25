package locators;

import org.openqa.selenium.By;
import static utils.BrowserUtils.*;

public class RegistartionPageLocators {

	public By text_Signing_up = By.xpath("//h1[normalize-space()='Signing up is easy!']");

	public By edit_firstname = By.xpath("//input[@id='customer.firstName']");
	public By edit_lastname = By.xpath("//input[@id='customer.lastName']");
	public By edit_street = By.xpath("//input[@id='customer.address.street']");
	public By edit_city = By.xpath("//input[@id='customer.address.city']");
	public By edit_state = By.xpath("//input[@id='customer.address.state']");
	public By edit_zipcode = By.xpath("//input[@id='customer.address.zipCode']");
	public By edit_phoennumber = By.xpath("//input[@id='customer.phoneNumber']");
	public By edit_ssn = By.xpath("//input[@id='customer.ssn']");
	public By edit_username = By.xpath("//input[@id='customer.username']");
	public By edit_pswd = By.xpath("//input[@id='customer.password']");
	public By edit_repeatpswd = By.xpath("//input[@id='repeatedPassword']");
	public By btn_register =By.xpath("//input[@value='Register']");

}


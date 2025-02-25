package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegistartionPage;
import utils.BrowserUtils;
import utils.ExeclUtils;
import utils.FrameworkUtils;
import utils.ReportUtils;

public class NewTest3 {
	@Test
	public void testRegistartion() throws Exception {
		
		ReportUtils.intializeReport();
		ExeclUtils.loadTestData();
		System.out.println("total no of cases :" + ExeclUtils.data.size());
		for (int i = 0; i < ExeclUtils.data.size(); i++) {
			String userdata = "";
			System.out.println("##########Test case no ## executed : " + (i + 1));
			ReportUtils.IntializeTest((i + 1));
			FrameworkUtils.loadProptities();
			HomePage homePage = new HomePage();
			RegistartionPage registartionPage = new RegistartionPage();
			BrowserUtils.openBrowser();
			BrowserUtils.invokeApp();
			homePage.verifyHomePage();
			homePage.navigateToRegisterationPage();
			registartionPage.verifyregistartionPage();
			if (i < 9) {
				userdata = ExeclUtils.data.get("tc00" + (i + 1));
			} else {
				userdata = ExeclUtils.data.get("tc0" + (i + 1));
			}
			System.out.println("user data :" + userdata);
			registartionPage.enterValidDetailsAndSubmit(userdata);
			homePage.verifyRegistrationSuccessfull();
			BrowserUtils.killbrowser();
			ReportUtils.closeTest((i + 1));
		}
		ReportUtils.closeReport();

	}
}

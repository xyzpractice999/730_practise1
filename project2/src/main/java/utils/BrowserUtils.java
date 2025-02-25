package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	public static WebDriver driver;

	public static void openBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ReportUtils.updateReport("info", "Browser launced successfully");
		
	}

	public static void invokeApp() throws Exception {
		driver.manage().window().maximize();
		driver.get(FrameworkUtils.prop.getProperty("url"));
		ReportUtils.updateReport("info", "app invoked  successfully");
		
	}

	public static void killbrowser() throws Exception {
		driver.quit();
		ReportUtils.updateReport("info", "Browser closed successfully");
		
	}

}

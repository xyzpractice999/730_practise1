package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtils {
	public static ExtentReports report;
	public static ExtentTest test;
	public static String reportPath;

	public static void intializeReport() {
		reportPath = "C:\\Users\\suman\\eclipse-workspace730_5\\project2\\target\\report.html";
		report = new ExtentReports(reportPath);
	}

	public static void IntializeTest(int i) {
		test = report.startTest("test" + i);

	}

	public static void updateReport(String type, String msg) throws Exception {
		switch (type) {
		case "info":
			ReportUtils.test.log(LogStatus.INFO, msg);
			break;
		case "pass":
			ReportUtils.test.log(LogStatus.PASS, msg + test.addScreenCapture(getScreensshotPath(msg)));
			break;
		case "fail":
			ReportUtils.test.log(LogStatus.FAIL, msg + test.addScreenCapture(getScreensshotPath(msg)));
			break;
		default:
			System.out.println("invalid tyoe for report");
			break;
		}

	}

	private static String getScreensshotPath(String msg) throws Exception {
		String path = "C:\\Users\\suman\\eclipse-workspace730_5\\project2\\target\\" + msg + ".png";
		File src = ((TakesScreenshot) BrowserUtils.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		return path;
	}

	public static void closeTest(int i) {
		report.endTest(test);
		report.flush();
	}

	public static void closeReport() {
		report.close();
		new ChromeDriver().get(reportPath);

	}

}

package com.Magento.Browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	// Necessary objects declared globally
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static Actions act;
	public static Select select;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;

	// Method for Generating Extend Report
	
	public static void init(String reportName) {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//target//ExtentReports//" + reportName + ".html");
		extent.attachReporter(reporter);
	}
	
	// Open the browser based on the choice
	public static void openBrowser() {
		
		//logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try {
			String choice = Utility.properties("browser");
			if (choice.equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			logger1.log(Status.PASS, "Browser Opened Succesfully");
		} catch (Exception e) {
			// e.printStackTrace();
			logger1.log(Status.FAIL, "Failed Opening browser");
			System.out.println("Browser - openBrowser " + e);
			System.exit(0);
			
		}
		extent.flush();
	}

	// Navigates the browser to the URL of the application
	public static void navigateToUrl(String url) {
		
		logger1.log(Status.INFO, "Navigating to the URL");
		
		try {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			js = (JavascriptExecutor) driver;
			logger1.log(Status.PASS, "Navigated to URL Succesfully");
		} catch (Exception e) {
			System.out.println("Browser - navigatetoUrl " + e);
			logger1.log(Status.FAIL, " Failed to Navigating URL  ");
		}
		extent.flush();
	}

	// Closes the Browser
	public static void closeBrowser() {
		
		logger1.log(Status.INFO, "Closing the Browser");
		
		try {

			driver.quit();
			logger1.log(Status.PASS, "Browser Closed Successfully");

		} catch (Exception e) {
			System.out.println("Browser - closeBrowser " + e);
			logger1.log(Status.FAIL, "Failed Closing browser");
		}
		extent.flush();
	}

}

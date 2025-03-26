package com.Magento.Hooks;

import com.Magento.Browser.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks extends Browser {
	@BeforeAll
	public static void initializingExtentReport() {
		Browser.init("ExtentReport");
	}

	@Before
	public static void creatingExtentTest(Scenario scenario) {
		logger1 = extent.createTest(scenario.getName());
	}

	@After
	public static void closeapplication() {
		extent.flush();
		//Browser.closeBrowser();
	}

}

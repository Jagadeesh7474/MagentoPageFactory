package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.MagentoApplication.Features\\Registration.feature",
glue= {"com.Magento.StepDefination","com.Magento.Hooks"},
plugin= {"pretty","html:target/com.Magento.cucumberReport/Registration.html"})

public class MagentoAppTestRunner extends AbstractTestNGCucumberTests {

}

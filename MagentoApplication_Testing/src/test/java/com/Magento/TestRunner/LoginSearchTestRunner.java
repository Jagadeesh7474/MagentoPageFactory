package com.Magento.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\com.MagentoApplication.Features\\LoginSearchCart.feature",
glue= {"com.Magento.StepDefination","com.Magento.Hooks"},
plugin= {"pretty","html:target/com.Magento.cucumberReport/Login-Search-AddToCart.html"})
public class LoginSearchTestRunner extends AbstractTestNGCucumberTests {

}

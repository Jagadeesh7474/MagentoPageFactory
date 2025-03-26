package com.Magento.StepDefination;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.SignInPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutVerification extends Browser{
	@When("User clicks on {string} from {string}")
	public void user_clicks_on_from(String string, String string2) {
	   SignInPage.clickOnArrow();
	   SignInPage.clickOnSignOutButton();
	}
	@Then("User verifies session ends and the user is redirected to the homepage")
	public void user_verifies_session_ends_and_the_user_is_redirected_to_the_homepage() {
	    try {
	    	Thread.sleep(5000);
	    	logger1.log(Status.PASS, "Expected and Actual Matched");
	    	Assert.assertEquals(HomePage.getTitle(), "Home Page");
	    	CaptureScreenShot.screenShot("HomePage");
	    	logger1.addScreenCaptureFromPath(CaptureScreenShot.screenShot("Home Page"));
	    }
	    catch (Exception e) {
			System.out.println("Title verification Fails");
			logger1.log(Status.FAIL, "Expected and Actual Matched");
		}
	}

}

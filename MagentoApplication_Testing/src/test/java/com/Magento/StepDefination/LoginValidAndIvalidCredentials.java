package com.Magento.StepDefination;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.SignInPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidAndIvalidCredentials extends Browser {
	
	@When("User enters  {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    SignInPage.enterEmail(string);
	    SignInPage.enterPassword(string2);
	}
	@Then("User verifies {string} message displayed under the email textbox")
	public void user_verifies_message_displayed_under_the_email_textbox(String string) {
		try {
			
	    	Assert.assertEquals(SignInPage.errorMessage(), string);
	    	CaptureScreenShot.screenShot("Email Error Message");
	    	logger1.log(Status.PASS, "Expected and Actual Matched");
	    }
	    catch (Exception e) {
			System.out.println(e);
			logger1.log(Status.FAIL, "MisMatch in Expected and Actual Matched");
		}
	}

	@When("User re-enter {string} and {string}")
	public void user_re_enter_and(String string, String string2) {
		SignInPage.enterEmail(string);
	    SignInPage.enterPassword(string2);
	    
	}

}

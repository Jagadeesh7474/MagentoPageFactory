package com.Magento.StepDefination;

import org.testng.Assert;


import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.MyAccountPage;
import com.Magento.Pages.RegistrationPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefination extends Browser{

@Given("User launches the browser")
public void user_launches_the_browser() {
	//Browser.init("Extend_Report");
    Browser.openBrowser();
}

@Given("User navigates to the webpage url {string}")
public void user_navigates_to_the_webpage_url(String url) {
    Browser.navigateToUrl(url);
}

@When("User clicks the link Create an account link")
public void user_clicks_the_link_create_an_account_link() {
    HomePage.clickOnCreateAnAccountLink();
}

@When("User enters the valid {string} in firstname textbox")
public void user_enters_the_valid_in_firstname_textbox(String string) {
    RegistrationPage.firstNameTextBox(string);
}

@When("User enters the valid {string} in lastname textbox")
public void user_enters_the_valid_in_lastname_textbox(String string) {
	RegistrationPage.lastNameTextBox(string);
}

@When("User enters the invalid {string} in email textbox")
public void user_enters_the_invalid_in_email_textbox(String string) {
    RegistrationPage.emailTextBox(string);
}

@When("User enters the valid {string} in password textbox")
public void user_enters_the_valid_in_password_textbox(String string) {
    RegistrationPage.passwordTextBox(string);
}

@When("User enters the valid {string} in confirm password textbox")
public void user_enters_the_valid_in_confirm_password_textbox(String string) {
	RegistrationPage.confirmPasswordTextBox(string);
}

@When("User clicks the Create an account button.")
public void user_clicks_the_create_an_account_button() {
	RegistrationPage.clickOncreateAnAccountButton();
}

@Then("User verifies the {string} message displayed under the email textbox")
public void user_verifies_the_message_displayed_under_the_email_textbox(String string) {
    try {
    	Assert.assertEquals(RegistrationPage.errorMessage(), string);
    }
    catch (Exception e) {
		System.out.println(e);
	}
}

@When("User re-enters the email with valid data {string}")
public void user_re_enters_the_email_with_valid_data(String string) {
	RegistrationPage.emailTextBox(string);
}

@Then("User verifies thank you {string} in the next page")
public void user_verifies_thank_you_in_the_next_page(String string) {
	try {
		Assert.assertEquals(MyAccountPage.registartionText(), string);
		logger1.log(Status.PASS, "Expected and Actual Matched");
		CaptureScreenShot.screenShot("Registered SuccesFully");
		logger1.addScreenCaptureFromPath(CaptureScreenShot.screenShot("Registered Succesfully"));
	}
	catch (Exception e) {
		System.out.println(e);
		logger1.log(Status.FAIL, "Mismatch in Expected and Actual ");
	}
}

@Then("User Close the browser")
public void user_close_the_browser() {
    Browser.closeBrowser();
}

}

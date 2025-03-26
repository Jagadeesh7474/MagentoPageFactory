package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.SignInPageObjects;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

public class SignInPage extends Browser {
	// Necessary Objects declare Globally
	static SignInPageObjects signInPageObjects;

	// Method for Entering an email
	public static void enterEmail(String email) {
		logger1.log(Status.INFO, "Entering email ");
		signInPageObjects = new SignInPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.emailElement));
			signInPageObjects.emailElement.clear();
			signInPageObjects.emailElement.sendKeys(email);
			logger1.log(Status.PASS, "Sucessfully Entered email");

		} catch (Exception e) {
			System.out.println(e + "Exception while enetering Email field");
			logger1.log(Status.FAIL, "Failed to Entered email");

		}
	}

	// Method for Entering an Password
	public static void enterPassword(String password) {
		logger1.log(Status.INFO, "Entering password");
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.passwordElement));
			signInPageObjects.passwordElement.clear();
			signInPageObjects.passwordElement.sendKeys(password);
			logger1.log(Status.PASS, "Sucessfully Entered Password");

		} catch (Exception e) {
			System.out.println(e + "Exception while enetering password field");
			logger1.log(Status.FAIL, "Failed to Entered email");

		}
	}

	// Method for clicking on signinButton
	public static void clickOnSignInButton() {
		logger1.log(Status.INFO, "Clciking on SigininButton");
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.signInElement));
			signInPageObjects.signInElement.click();
			logger1.log(Status.PASS, "Sucessfully clciked on signIn button");

		} catch (Exception e) {
			System.out.println(e + "Exception While clicking on signin Button");
			logger1.log(Status.FAIL, "Failed to clciked on signin button");
		}
	}

	// Displaying error message
	public static String errorMessage() {
		logger1.log(Status.INFO, "Getting error message");
		String error = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.errorElement));
			error = signInPageObjects.errorElement.getText();
			logger1.log(Status.PASS, "Sucessfully recive error message");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While fetching the error message");
			logger1.log(Status.FAIL, "Failed to recive error message");

		}
		return error;

	}

	// Method for clicking on Arrow for drop down Option
	public static void clickOnArrow() {
		logger1.log(Status.INFO, "Clicking on Arrow");
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.downArrow));
			signInPageObjects.downArrow.click();
			logger1.log(Status.PASS, "Sucessfully clciked on arror");
		} catch (Exception e) {
			System.out.println("Exception While Clicking on Arrow " + e);
			logger1.log(Status.FAIL, "Failed to recive error message");
		}
	}

	// Method for clicking on SignOut Button
	public static void clickOnSignOutButton() {
		logger1.log(Status.INFO, "Clciking on sign in Button");
		try {
			wait.until(ExpectedConditions.visibilityOf(signInPageObjects.signOutButton));
			signInPageObjects.signOutButton.click();
			CaptureScreenShot.screenShot("SignOut");
			logger1.log(Status.PASS, "Sucessfully rclciked on signin button");
		} catch (Exception e) {
			System.out.println("Exception While Clicking on SignOut Button " + e);
			logger1.log(Status.FAIL, "Failed to clcik on signin button");
		}
	}

}

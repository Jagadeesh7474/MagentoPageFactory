package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.RegistrationPageObjects;
import com.aventstack.extentreports.Status;

public class RegistrationPage extends Browser {
	// Necessary Objects declare Globally
	static RegistrationPageObjects registrationPageObjects;

	// Method for Entering First Name
	public static void firstNameTextBox(String firstName) {
		logger1.log(Status.INFO, "Entering First Name");
		registrationPageObjects = new RegistrationPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.firstNameElement));
			registrationPageObjects.firstNameElement.clear();
			registrationPageObjects.firstNameElement.sendKeys(firstName);
			logger1.log(Status.PASS, "Sucessfully Entered first Name");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While enetering FirstName");
			logger1.log(Status.FAIL, "Failed to enter First Name");
		}
	}

	// Method for Entering Last Name
	public static void lastNameTextBox(String lastName) {
		logger1.log(Status.INFO, "Entering Last Name");
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.lastNameElemnt));
			registrationPageObjects.lastNameElemnt.clear();
			registrationPageObjects.lastNameElemnt.sendKeys(lastName);
			logger1.log(Status.PASS, "Sucessfully Last first Name");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While enetering LastName");
			logger1.log(Status.FAIL, "Failes Entered Last Name");
		}
	}

	// Method for Entering Email
	public static void emailTextBox(String email) {
		logger1.log(Status.INFO, "Entering Email ");
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.emailElement));
			registrationPageObjects.emailElement.clear();
			registrationPageObjects.emailElement.sendKeys(email);
			logger1.log(Status.PASS, "Sucessfully Entered Email");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While enetering Email");
			logger1.log(Status.FAIL, "Failed to Entered Email");
		}
	}

	// Method for Entering Password
	public static void passwordTextBox(String password) {
		logger1.log(Status.INFO, "Entering Password");
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.passwordElement));
			registrationPageObjects.passwordElement.clear();
			registrationPageObjects.passwordElement.sendKeys(password);
			logger1.log(Status.PASS, "Sucessfully Entered Passord");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While enetering Password");
			logger1.log(Status.FAIL, "Failed to Entered Password");
		}
	}

	// Method for Entering Password for confirmation
	public static void confirmPasswordTextBox(String confirmPassword) {
		logger1.log(Status.INFO, "Entering Confirm passord");
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.confrimPasswordElement));
			registrationPageObjects.confrimPasswordElement.clear();
			registrationPageObjects.confrimPasswordElement.sendKeys(confirmPassword);
			logger1.log(Status.PASS, "Sucessfully Entered conform Passord");
		} catch (Exception e) {
			System.out.println(e + "Excpetion While confirming the Password");
			logger1.log(Status.FAIL, "Failed to Entered fconfirm password");
		}
	}

	// Method for Clicking Create An Account Button
	public static void clickOncreateAnAccountButton() {
		logger1.log(Status.INFO, "Clicking on Create An Account Button");
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.createAnAccountButtonElement));
			js.executeScript("arguments[0].click();", registrationPageObjects.createAnAccountButtonElement);
			logger1.log(Status.PASS, "Sucessfully clicked on Create an account Button");

		} catch (Exception e) {
			System.out.println(e + "Excpetion While clicking On create AnA ccount Button ");
			logger1.log(Status.FAIL, "Failed to clicked on Create an account Button");
		}
	}

	// Method for Displaying error message
	public static String errorMessage() {
		logger1.log(Status.INFO, "Reading Error Message");
		String error = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(registrationPageObjects.errorElement));
			error = registrationPageObjects.errorElement.getText();
			logger1.log(Status.PASS, "Sucessfully read the error message");

		} catch (Exception e) {
			System.out.println(e + "Excpetion While fetching the error message");
			logger1.log(Status.FAIL, "Failed to read the error message");

		}
		return error;

	}

}

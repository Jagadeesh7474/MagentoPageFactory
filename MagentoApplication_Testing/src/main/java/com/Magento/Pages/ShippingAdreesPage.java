package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.Magento.Browser.Browser;
import com.Magento.Locators.ShippingAdreesPageObjects;
import com.aventstack.extentreports.Status;

public class ShippingAdreesPage extends Browser {
	// Declare Necessary Object Globally
	static ShippingAdreesPageObjects shippingAdreesPageObjects;

	// Method To enter FirstName
	public static void enterFirstName(String firstName) {
		logger1.log(Status.INFO, "Entering First Name");
		shippingAdreesPageObjects = new ShippingAdreesPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.firstName));
			shippingAdreesPageObjects.firstName.clear();
			shippingAdreesPageObjects.firstName.sendKeys(firstName);
			logger1.log(Status.PASS, "Sucessfully Entered first Name");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile entereing FirstName");
			logger1.log(Status.FAIL, "Failed to Entered first Name");
		}
	}

	// Method To enter LastName
	public static void enterLastName(String lastName) {
		logger1.log(Status.INFO, "Entering Last Name");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.lastName));
			shippingAdreesPageObjects.lastName.clear();
			shippingAdreesPageObjects.lastName.sendKeys(lastName);
			logger1.log(Status.PASS, "Sucessfully Entered Last Name");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile entereing Last Name");
			logger1.log(Status.FAIL, "Failed to Entered last Name");
		}
	}

	// Method To enter Street Address
	public static void enterStreetAdress(String streetAdress) {
		logger1.log(Status.INFO, "Entering Street Adrres");
		shippingAdreesPageObjects = new ShippingAdreesPageObjects();

		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.streetAddres));
			shippingAdreesPageObjects.streetAddres.clear();
			shippingAdreesPageObjects.streetAddres.sendKeys(streetAdress);
			logger1.log(Status.PASS, "Sucessfully Entered strretAdrees");
		} catch (Exception e) {
			System.out.println(e + "Exception While entereing street Adress");
			logger1.log(Status.FAIL, "Failed Entered street Adrees");
		}
	}

	// Method To enter city
	public static void enterCity(String city) {
		logger1.log(Status.INFO, "Entering city");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.city));
			shippingAdreesPageObjects.city.clear();
			shippingAdreesPageObjects.city.sendKeys(city);
			logger1.log(Status.PASS, "Sucessfully Entered city");
		} catch (Exception e) {
			System.out.println(e + "Exception While entereing city Adress");
			logger1.log(Status.FAIL, "Failed to Entered city");
		}
	}

	// Method To enter postal code
	public static void enterPostalCode(String postalCode) {
		logger1.log(Status.INFO, "Entering postal code");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.zipOrPostalCode));
			shippingAdreesPageObjects.zipOrPostalCode.clear();
			shippingAdreesPageObjects.zipOrPostalCode.sendKeys(postalCode);
			logger1.log(Status.PASS, "Sucessfully Entered postal code");
		} catch (Exception e) {
			System.out.println(e + "Exception While entereing postal or zip code");
			logger1.log(Status.FAIL, "Failed to Entered postalcode");
		}
	}

	// Method To enter PhoneNumber
	public static void enterPhoneNumber(String phoneNumber) {
		logger1.log(Status.INFO, "Entering Phone Number");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.phoneNumber));
			shippingAdreesPageObjects.phoneNumber.clear();
			shippingAdreesPageObjects.phoneNumber.sendKeys(phoneNumber);
			logger1.log(Status.PASS, "Sucessfully Entered PhoneNumber");
		} catch (Exception e) {
			System.out.println(e + "Exception While entereing Phone Number");
			logger1.log(Status.FAIL, "Failed to Entered Phone Number");
		}
	}

	// Method To click on Radio Button
	public static void clickOnRadioButton() {
		logger1.log(Status.INFO, "Clicking on Radio Button");

		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.radioButtion));
			js.executeScript("arguments[0].click();", shippingAdreesPageObjects.radioButtion);
			logger1.log(Status.PASS, "Sucessfully clciked on Radio button");
		} catch (Exception e) {
			System.out.println(e + "Exception While clicking on radio button ");
			logger1.log(Status.FAIL, "Failed to click on radio Button");
		}
	}

	// Method To click on Next Button
	public static void clickOnNextNutton() {
		logger1.log(Status.INFO, "Clciking on Next Button");

		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.nextButton));
			js.executeScript("arguments[0].click();", shippingAdreesPageObjects.nextButton);
			logger1.log(Status.PASS, "Failed to click on Next Button");
		} catch (Exception e) {
			System.out.println(e + "Exception While clcicking on next Button");
			logger1.log(Status.FAIL, "Failed to click on next Button");
		}
	}

	// Method to select region
	public static void selectRegion(String reglious) {
		logger1.log(Status.INFO, "Selection region");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.selectRegion));
			Select select = new Select(shippingAdreesPageObjects.selectRegion);
			select.selectByVisibleText(reglious);
			logger1.log(Status.PASS, "Sucessfully slected region");
		} catch (Exception e) {

			System.out.println(e + "Exception in selecing  region dropdwon content");
			logger1.log(Status.FAIL, "Failed to slected region");
		}
	}

	// Method to select country
	public static void selectCountry(String coutry) {
		logger1.log(Status.INFO, "Selection country");
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.selectCountry));
			Select select = new Select(shippingAdreesPageObjects.selectCountry);
			select.selectByVisibleText(coutry);
			logger1.log(Status.PASS, "Sucessfully slected country");
		} catch (Exception e) {

			System.out.println(e + "Exception in selecing country dropdwon content");
			logger1.log(Status.FAIL, "Failed to slected country");
		}
	}

	// Method for Displaying error message under Postal code
	public static String errorMessage() {
		logger1.log(Status.INFO, "Displaying error meassage");
		String error = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(shippingAdreesPageObjects.errorMessageText));
			error = shippingAdreesPageObjects.errorMessageText.getText();
			logger1.log(Status.PASS, "Sucessfully recived and error message");

		} catch (Exception e) {
			System.out.println(e + "Excpetion While fetching the error message");
			logger1.log(Status.FAIL, "Failed to  recived and error message");

		}
		return error;

	}

}

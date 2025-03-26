package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.ReviewAndPaymentPageObjects;
import com.aventstack.extentreports.Status;

public class ReviewAndPaymentPage extends Browser {
	// Declare NecassaryObject Globally
	static ReviewAndPaymentPageObjects reviewAndPaymentPageObjects;

	// method for clicking on Shipping Button
	public static void clickingOnShippingButton() {
		logger1.log(Status.INFO, "Clicking on shipping button");
		reviewAndPaymentPageObjects = new ReviewAndPaymentPageObjects();
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(reviewAndPaymentPageObjects.shippingButton));
			reviewAndPaymentPageObjects.shippingButton.click();
			logger1.log(Status.PASS, "Sucessfully clicked on Shipping button");
		} catch (Exception e) {
			System.out.println(e + "Exception While clicking On Shipping Button");
			logger1.log(Status.FAIL, "Sucessfully Clicked on Shipping button");
		}
	}

	// method for clicking on Place Oder Button
	public static void clickingOnPlaceOrderButton() {
		logger1.log(Status.INFO, "Clicking on Place order");
		reviewAndPaymentPageObjects = new ReviewAndPaymentPageObjects();
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(reviewAndPaymentPageObjects.placeOrderButton));
			js.executeScript("arguments[0].click();", reviewAndPaymentPageObjects.placeOrderButton);
			logger1.log(Status.PASS, "Sucessfully Clicked on place order Button");
		} catch (Exception e) {
			System.out.println(e + "Exception While clicking On place Order Button");
		}
		logger1.log(Status.FAIL, "Failed  on clicking on place order button");
	}

	// Method for Displaying error message under Postal code
	public static String thankYouMessage() {
		logger1.log(Status.INFO, "Getting thank you message ");
		String message = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(reviewAndPaymentPageObjects.thankYouMessage));
			message = reviewAndPaymentPageObjects.thankYouMessage.getText();
			System.out.println(message);
			logger1.log(Status.PASS, "Sucessfully received the thank you message");

		} catch (Exception e) {
			System.out.println(e + "Excpetion While fetching the Thank you message");
			logger1.log(Status.FAIL, "Failed to recive  Thak you message");

		}
		return message;

	}

}

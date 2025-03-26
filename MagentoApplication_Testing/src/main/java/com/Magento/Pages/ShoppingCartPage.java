package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.ShoppingCartPageObjects;
import com.aventstack.extentreports.Status;

public class ShoppingCartPage extends Browser {
	// Necessary Objects Declare Globally
	static ShoppingCartPageObjects shoppingCartPageObjects;

	// Method for Getting productName in cart
	public static String firtsProductName() {
		logger1.log(Status.INFO, "Getting 1st Product Name");
		shoppingCartPageObjects = new ShoppingCartPageObjects();
		String text = null;
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(shoppingCartPageObjects.cartProductList));
			text = shoppingCartPageObjects.cartProductList.getFirst().getText();
			logger1.log(Status.PASS, "Sucessfully received 1st product name");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile Getting Product NAme from Shopping cart list");
			logger1.log(Status.FAIL, "Failed to recive 1st product name");
		}
		return text;
	}

	// Method for Getting Second productName in cart
	public static String sceondProductName() {
		logger1.log(Status.INFO, "Getting 2st Product Name");
		String text = null;
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(shoppingCartPageObjects.cartProductList));
			text = shoppingCartPageObjects.cartProductList.getLast().getText();
			logger1.log(Status.PASS, "Sucessfully recived 2nd product text");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile Getting Product NAme from Shopping cart list");
			logger1.log(Status.FAIL, "Failed to Recive 2nd prosct Name");
		}
		return text;
	}

	// Method for Getting first productPric in cart
	public static String firstProductPrice() {
		logger1.log(Status.INFO, "Getting 1st Product price");
		String text = null;
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(shoppingCartPageObjects.cartProcuctPriceList));
			text = shoppingCartPageObjects.cartProcuctPriceList.get(0).getText();
			logger1.log(Status.PASS, "Sucessfully recived 1st product price");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile Getting Product Price from Shopping cart list");
			logger1.log(Status.FAIL, "Sucessfully recived 2nd product price");
		}
		return text;
	}

	// Method for Getting second productPric in cart
	public static String secondProductPrice() {
		logger1.log(Status.INFO, "Getting 2st Product Price");
		String text = null;
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(shoppingCartPageObjects.cartProcuctPriceList));
			text = shoppingCartPageObjects.cartProcuctPriceList.get(1).getText();
			logger1.log(Status.PASS, "Sucessfully recived 2nd product price");
		} catch (Exception e) {
			System.out.println(e + "Exception WHile Getting Product Price from Shopping cart list");
			logger1.log(Status.FAIL, "Failed to recived 2nd product price");
		}
		return text;
	}

}

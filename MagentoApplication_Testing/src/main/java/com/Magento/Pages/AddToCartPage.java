package com.Magento.Pages;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.AddToCartPageObjects;
import com.aventstack.extentreports.Status;

public class AddToCartPage extends Browser {
	// Necessary Objects declare Globally
	static AddToCartPageObjects addToCartPageObjects;
	static List<String> itemNames = new ArrayList<String>();
	static List<String> priceList = new ArrayList<String>();

	// Method for Selecting color
	public static void selectColor(String color) {
		logger1.log(Status.INFO, "Slecting the color from excel sheet");
		addToCartPageObjects = new AddToCartPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(addToCartPageObjects.colorList));
			for (WebElement c : addToCartPageObjects.colorList) {
				if (c.getDomAttribute("option-label").equalsIgnoreCase(color)) {
					js.executeScript("arguments[0].click();", c);
					break;
				}
				logger1.log(Status.PASS, "Sucessfully  selet color  from the exel");
			}

		} catch (Exception e) {
			System.out.println(e + "Exception While selecting color");
			logger1.log(Status.FAIL, "Failed to selet color  from the exel");
		}
	}

	// Method for Selecting Quantity
	public static void slectQuantity(String quantity) {
		logger1.log(Status.INFO, "Slecting the Qunatity from excel sheet");
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartPageObjects.quantityElement));
			addToCartPageObjects.quantityElement.clear();
			addToCartPageObjects.quantityElement.sendKeys(quantity);
			logger1.log(Status.PASS, "Sucessfully  selet quantity  from the exel");
		} catch (Exception e) {
			System.out.println(e + "Exception While entering Quantity");
			logger1.log(Status.FAIL, "Failed to  selet quantity  from the exel");
		}

	}

	// method to click on Add to cart Button
	public static void clickOnAddToCartButton() {
		logger1.log(Status.INFO, "Clicking  On Add to Cart Button");
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartPageObjects.addToCartButtonElement));
			addToCartPageObjects.addToCartButtonElement.click();
			logger1.log(Status.PASS, "Successfully clicked on Add to Cart Button");
		} catch (Exception e) {
			System.out.println(e + "Exception while clicking on Add to Cart Button");
			logger1.log(Status.FAIL, "Failed  clicking on Add to Cart Button");
		}
	}

	// Verifying Weather the product is successfully added to cart or not
	public static void VerifyingAddtoCartMessage() {
		logger1.log(Status.INFO, "Veriying the product adding to cart");
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartPageObjects.confirmationMessageElement));
			String confirmationMeaasage = addToCartPageObjects.confirmationMessageElement.getText();
			String name = addToCartPageObjects.productName.getText();

			if (confirmationMeaasage.contains(name)) {
				System.out.println("Product added to cart sucessfully");
				logger1.log(Status.PASS, "Product added to cart sucessfully");

			}
		} catch (Exception e) {
			System.out.println(e + "Excption while verifying conformation message");
			logger1.log(Status.FAIL, "Failed While adding product to cart");

		}
	}

	// Method for Selecting size
	public static void selectSize(String size) {
		logger1.log(Status.INFO, "Slecting the Size from excel sheet");
		addToCartPageObjects = new AddToCartPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(addToCartPageObjects.sizeList));
			for (WebElement s : addToCartPageObjects.sizeList) {
				if (s.getText().trim().equalsIgnoreCase(size)) {
					js.executeScript("arguments[0].click();", s);
					break;
				}
			}
			logger1.log(Status.PASS, "Size selecetd Successfully from the exel");
		} catch (Exception e) {
			System.out.println(e + "Exception While selecting size");
			logger1.log(Status.FAIL, "Failed Size selecetd  from the exel");
		}
	}

	// Method for Getting ProductName
	public static String gettingProductName() {
		logger1.log(Status.INFO, "Getting  Product name While Adding to cart");
		String productName = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartPageObjects.productName));
			productName = addToCartPageObjects.productName.getText();
			itemNames.add(productName);
			System.out.println("productName  : " + productName);
			logger1.log(Status.PASS, "Successfully got the message ");
		} catch (Exception e) {
			System.out.println(e + "Exception While getting product Name");
			logger1.log(Status.FAIL, "Failed got the message ");
		}
		return productName;
	}

	// Method for Getting ProductPrice
	public static String gettingProductPrice() {
		logger1.log(Status.INFO, "Getting  Product price While Adding to cart");
		String productPrice = null;
		try {
			wait.until(ExpectedConditions.visibilityOf(addToCartPageObjects.productPrice));
			productPrice = addToCartPageObjects.productPrice.getText();
			priceList.add(productPrice);
			System.out.println("Product Price : " + productPrice);
			logger1.log(Status.PASS, "Successfully got the message ");
		} catch (Exception e) {
			System.out.println(e + "Exception While getting product Price");
			logger1.log(Status.FAIL, "Failed got the message ");
		}
		return productPrice;
	}

	// method for getting product1 price
	public static String prduct1Price() {
		logger1.log(Status.INFO, "Getting  Product price from the list");
		String price = null;
		try {
			price = priceList.get(0);
			System.out.println(price);
			logger1.log(Status.PASS, "Successfully got the message ");
		} catch (Exception e) {
			System.out.println(e + "Exception While Fetching Producut 1 Price");
			logger1.log(Status.FAIL, "Failed got the message ");
		}
		return price;
	}

	// method for getting product1 price
	public static String prduct2Price() {
		logger1.log(Status.INFO, "Getting  Product price from the list");
		String price = null;
		try {
			price = priceList.get(1);
			System.out.println(price);
			logger1.log(Status.PASS, "Successfully got the message ");
		} catch (Exception e) {
			System.out.println(e + "Exception While Fetching Producut 2 Price");
			logger1.log(Status.FAIL, "Failed got the message ");
		}
		return price;
	}

	// method for getting product name
	public static String product1TextMessage() {
		logger1.log(Status.INFO, "Getting the product1Text message ");
		String text = null;
		try {
			text = itemNames.getFirst();
			System.out.println(text);
			logger1.log(Status.PASS, "Successfully got the message ");
			// logger1.addScreenCaptureFromPath(capturingScreenShot.screenShot("message2"));
		} catch (Exception e) {
			logger1.log(Status.FAIL, "Error in getting the  message : " + e);
			System.out.println("Exception in product1TextMessage method : " + e);
		}
		return text;
	}

	public static String product2TextMessage() {
		logger1.log(Status.INFO, "Getting the product1Text message ");
		String text = null;
		try {
			text = itemNames.getLast();
			System.out.println(text);
			logger1.log(Status.PASS, "Successfully got the message ");
			// logger1.addScreenCaptureFromPath(capturingScreenShot.screenShot("message2"));
		} catch (Exception e) {
			logger1.log(Status.FAIL, "Error in getting the  message : " + e);
			System.out.println("Exception in product1TextMessage method : " + e);
		}
		return text;
	}
}

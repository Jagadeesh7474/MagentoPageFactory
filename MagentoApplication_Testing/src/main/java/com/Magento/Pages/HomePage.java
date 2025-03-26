package com.Magento.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Locators.HomePageObjects;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

public class HomePage extends Browser {
	// Necessary Objects declare Globally
	static HomePageObjects homePageObjects;

	// Method For Clicking Create An Account
	public static void clickOnCreateAnAccountLink() {
		homePageObjects = new HomePageObjects();
		logger1.log(Status.INFO, "Clicking on CreateAn AccountLink");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.createAnAccountLink));
			CaptureScreenShot.screenShot("HomePage Name ");
			homePageObjects.createAnAccountLink.click();
			logger1.log(Status.PASS, "Sucessfully  Click on Create an account ");
		} catch (Exception e) {
			System.out.println(e + "Exception by clicking on Create an accountlink");
			logger1.log(Status.FAIL, "Failed to Click on Create An Account ");
		}
	}

	// Method For Verifying HomePageText
	public static void verifyingHomePageText(String text) {
		logger1.log(Status.INFO, " Verifyinhg Home Page text");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.homePagetext));
			homePageObjects.homePagetext.getText();
			logger1.log(Status.PASS, "Sucessfully  Verified the Homepage text ");
		} catch (Exception e) {
			System.out.println(e + "Excpetion Verifying HomePage Text");
			logger1.log(Status.FAIL, "Failed to verify homepage text ");
		}
	}

	// Method To click on searchBox
	public static void clickOnSearchBox() {
		logger1.log(Status.INFO, "Clicking on Search Box");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.searchBoxElement));
			homePageObjects.searchBoxElement.click();
			logger1.log(Status.PASS, "Sucessfully  clicked on serach Box ");
		} catch (Exception e) {
			System.out.println(e + "Excption While Clicking onsearch Box");
			logger1.log(Status.FAIL, "Failed to Click on Serch Box ");
		}
	}

	// Method to enter searchItem in search Box
	public static void enterSearchTerm(String searchTerm) {
		logger1.log(Status.INFO, "Giving  search Term");
		try {
			homePageObjects.searchBoxElement.sendKeys(searchTerm);
			logger1.log(Status.PASS, "Sucessfully given the serch term ");
		} catch (Exception e) {
			System.out.println(e + "Exception While Entering searchTerm in search box");
			logger1.log(Status.FAIL, "Failed given serach term");
		}
	}

	// Method to select the Auto-suggested drop down option
	public static void selectSearchSuggestion(String suggestedItem) {
		logger1.log(Status.INFO, "Selecting Options From From the drop down list");
		try {
			for (WebElement suggestion : homePageObjects.searchBoxAutoSuggestions) {
				if (suggestion.getText().equalsIgnoreCase(suggestedItem)) {
					suggestion.click();
					return; // Exit the method after clicking the correct item
				}
				logger1.log(Status.PASS, "Sucessfully  selected text From Auto Suggestion ");
			}
			throw new Exception("Suggested item '" + suggestedItem + "' not found in search suggestions.");
		} catch (Exception e) {
			System.out.println("Error selecting search suggestion: " + e.getMessage());
			logger1.log(Status.FAIL, "Failed selected text from Auto Suggestion  ");
		}
	}

	// Getting title
	public static String getTitle() {
		logger1.log(Status.INFO, "Getting Title");
		String title = null;
		try {
			title = driver.getTitle();
			logger1.log(Status.PASS, "Sucessfully getting title ");
		} catch (Exception e) {

			System.out.println("Exception While Fetching Title" + e);
			logger1.log(Status.FAIL, "Failed Title ");

		}
		return title;
	}

	// Method for clicking on ShowCart Button
	public static void clickOnCartButton() {
		logger1.log(Status.INFO, "Clicking on Cart Button");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.cartButton));
			homePageObjects.cartButton.click();
			logger1.log(Status.PASS, "Sucessfully  click on Cart Button ");
		} catch (Exception e) {
			System.out.println(e + " Exception While clicking on Cart Button");
			logger1.log(Status.FAIL, "Failed on clicking on cart Button ");
		}
	}

	// Method for clicking on Proceed To CheckOut Button
	public static void clickProceedToCheckOutButton() {
		logger1.log(Status.INFO, "Clicking on Proceed to CheckOut Button");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.proceedToCheckOutButton));
			js.executeScript("arguments[0].click();", homePageObjects.proceedToCheckOutButton);
			logger1.log(Status.PASS, "Sucessfully  clicked on Proceed to Checkout Button ");
		} catch (Exception e) {
			System.out.println(e + " Exception While clicking on Cart Button");
			logger1.log(Status.FAIL, "Failed to  clicked on Proceed to Checkout Button ");
		}
	}

	// Method For Clicking Sign Up
	public static void clickOnsignUpLink() {
		logger1.log(Status.INFO, "Clicking on SignUp link");
		homePageObjects = new HomePageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.signUpLink));
			homePageObjects.signUpLink.click();
			logger1.log(Status.PASS, "Sucessfully  clcked on SignUp ");
		} catch (Exception e) {
			System.out.println(e + "Exception by clicking on sign Up Link");
			logger1.log(Status.FAIL, "Sucessfully  clcked on SignUp link ");
		}
	}

	// Method for navigating Men Option
	public static void movingToMenOption() {
		logger1.log(Status.INFO, "Moving to Mens Option");
		act = new Actions(driver);
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.menOption));
			act.moveToElement(homePageObjects.menOption).build().perform();
			logger1.log(Status.PASS, "Sucessfully  Moved cursor on mens option");
		} catch (Exception e) {
			System.out.println(e + "Exception Whive moving cursor to Men Option");
			logger1.log(Status.FAIL, "Failed to Moved cursor on mens option");
		}
	}

	// Method for navigating Top Option
	public static void movingToTopOption() {
		logger1.log(Status.INFO, "Moving to Top Options");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.topsOption));
			act.moveToElement(homePageObjects.topsOption).build().perform();
			logger1.log(Status.PASS, "Sucessfully  Moved cursor on Top option");
		} catch (Exception e) {
			System.out.println(e + "Exception Whive moving cursor to top Option");
			logger1.log(Status.FAIL, "Failed to  Moved cursor on Top option");
		}
	}

	// Method for navigating Jacket Option
	public static void movingToJacketOption() {
		logger1.log(Status.INFO, "Moving to Jacket Option andd click");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.jacketsOption));
			act.moveToElement(homePageObjects.jacketsOption).click().build().perform();
			logger1.log(Status.PASS, "Sucessfully  Moved cursor on Jacket option");
		} catch (Exception e) {
			System.out.println(e + "Exception Whive moving clicking on jacket Option");
			logger1.log(Status.FAIL, "Failed to  Moved cursor on Jacket option");
		}
	}

	// Method for navigating Teas Option
	public static void movingToTeesOption() {
		logger1.log(Status.INFO, "Moving to Tees option and click");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.teesOption));
			act.moveToElement(homePageObjects.teesOption).click().build().perform();
			logger1.log(Status.PASS, "Sucessfully  Moved cursor on Tees option");
		} catch (Exception e) {
			System.out.println(e + "Exception Whive moving clicking on tees Option");
			logger1.log(Status.FAIL, "Failed to  Moved cursor on Tees option");
		}
	}

	// Method for Clicking on View and Edit Cart Button
	public static void clickOnViewAndEditCartButton() {
		logger1.log(Status.INFO, "Clicking on View and Edit Cart Option");
		try {
			wait.until(ExpectedConditions.visibilityOf(homePageObjects.viewAndEditCartButton));
			js.executeScript("arguments[0].click();", homePageObjects.viewAndEditCartButton);
			logger1.log(Status.PASS, "Sucessfully Clicked on View And Edit Option");
		} catch (Exception e) {
			System.out.println(e + "Exception While Clicking on View And Cart Button");
			logger1.log(Status.FAIL, "Failed to Clicked on View And Edit Option");
		}
	}

	// verifying Cart items product and prices
	public static void verifyProductInCart() {
		// Get the product name and price from the product page
		String expectedProductName = AddToCartPage.gettingProductName();
		// String expectedProductPrice = AddToCartPage.gettingProductPrice();
		System.out.println("expectedProductName : " + expectedProductName);
		// System.out.println("expectedProductPrice : " + expectedProductPrice);

		boolean isProductFound = false;

		String cartProductName = homePageObjects.productNameList.get(1).getText();
		// String cartProductPrice = homePageObjects.productPriceList.get(1).getText();

		System.out.println("Checking cart item: " + cartProductName);

		if (cartProductName.equalsIgnoreCase(expectedProductName)) {
			System.out.println("cartProductName : " + cartProductName);
			// System.out.println("cartProductPrice : " + cartProductPrice);
			isProductFound = true;

		}

		Assert.assertTrue(isProductFound, "The product is not found in the mini-cart!");
	}

}

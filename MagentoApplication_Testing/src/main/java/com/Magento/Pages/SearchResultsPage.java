package com.Magento.Pages;

import org.openqa.selenium.WebElement;
import com.Magento.Browser.Browser;
import com.Magento.Locators.SearchResultsPageObjets;
import com.aventstack.extentreports.Status;

public class SearchResultsPage extends Browser {
	// Necessary Objects declare Globally
	static SearchResultsPageObjets searchResultsPageObjets;

	// Method for Selecting product from product List
	public static void productSelection() {
		logger1.log(Status.INFO, "Slecting a Product in product list");
		searchResultsPageObjets = new SearchResultsPageObjets();
		try {
			boolean check = true;
			do {
				for (WebElement e : searchResultsPageObjets.productList) {
					if (e.getText().contains(searchResultsPageObjets.ProductNameElement.getText())) {
						js.executeScript("arguments[0].scrollIntoView();", e);
						js.executeScript("arguments[0].click();", e);
						check = false;
						break;
					}
				}

			} while (check);
			logger1.log(Status.PASS, "Sucessfully Selected a product from products");
		} catch (Exception e) {
			System.out.println("Error selecting product suggestion: " + e.getMessage());
			logger1.log(Status.FAIL, "Failed to Selected a product from products");
		}
	}

}

/*
 * wait.until(ExpectedConditions.visibilityOfAllElements(searchResultsPageObjets
 * .productList)); for (WebElement suggestion :
 * searchResultsPageObjets.productList) { if
 * (suggestion.getText().equalsIgnoreCase(searchResultsPageObjets.
 * ProductNameElement.getText())) {
 * wait.until(ExpectedConditions.visibilityOf(suggestion));
 * js.executeScript("arguments[0].click();", suggestion); return; // Exit the
 * method after clicking the correct item } } // Method for clicking on
 * particular product public static void clickOnProduct() {
 * searchResultsPageObjets = new SearchResultsPageObjets(); try {
 * 
 * wait.until(ExpectedConditions.visibilityOf(searchResultsPageObjets.
 * ProductNameElement));
 * 
 * js.executeScript("arguments[0].click();",
 * searchResultsPageObjets.ProductNameElement); } catch (Exception e) {
 * System.out.println(e + "Execption while clicking on Product"); } }
 */

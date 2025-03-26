package com.Magento.StepDefination;

import java.util.List;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Excel.DataManipulations;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.ReviewAndPaymentPage;
import com.Magento.Pages.ShippingAdreesPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutProcess extends Browser{
	@Then("User clicks the cart icon on the homepage")
	public void user_clicks_the_cart_icon_on_the_homepage() throws InterruptedException {
		Thread.sleep(3000);
	    HomePage.clickOnCartButton();
	    Thread.sleep(3000);
	}

	@Then("User then clicks the Proceed to checkout button")
	public void user_then_clicks_the_proceed_to_checkout_button() {
	    HomePage.clickProceedToCheckOutButton();
	}

	@Then("User enters the shipping address fields with valid data except zip\\/postal code textbox")
	public void user_enters_the_shipping_address_fields_with_valid_data_except_zip_postal_code_textbox(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> credentials = DataManipulations.datFromExcel(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\ExcelData.xlsx",
				1);

		dataTable = DataTable.create(credentials);
		ShippingAdreesPage.enterFirstName(dataTable.cell(1, 0));
		ShippingAdreesPage.enterLastName(dataTable.cell(1, 1));
		ShippingAdreesPage.enterStreetAdress(dataTable.cell(1, 2));
		ShippingAdreesPage.enterCity(dataTable.cell(1, 3));
		ShippingAdreesPage.selectRegion(dataTable.cell(1, 4));
		ShippingAdreesPage.enterPostalCode(dataTable.cell(1, 5));
		ShippingAdreesPage.selectCountry(dataTable.cell(1, 7));
		ShippingAdreesPage.enterPhoneNumber(dataTable.cell(1, 8));
	}

	@When("User clicks the next button")
	public void user_clicks_the_next_button() {
		ShippingAdreesPage.clickOnRadioButton();
	    ShippingAdreesPage.clickOnNextNutton();
	}

	@Then("User clicks the shipping button")
	public void user_clicks_the_shipping_button() {
	   ReviewAndPaymentPage.clickingOnShippingButton();
	}

	@Then("User verifies the {string} displayed under zip\\/postal code textbox")
	public void user_verifies_the_displayed_under_zip_postal_code_textbox(String string) {
		try {
	    	Assert.assertEquals(ShippingAdreesPage.errorMessage(), string);
	    }
	    catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User re-Enters the valid data in zip\\/postal code textbox")
	public void user_re_enters_the_valid_data_in_zip_postal_code_textbox(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> credentials = DataManipulations.datFromExcel(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\ExcelData.xlsx",
				1);

		dataTable = DataTable.create(credentials);
		ShippingAdreesPage.enterPostalCode(dataTable.cell(1, 6));
	}

	/*
	 * @When("User clicks the next button") public void
	 * user_clicks_the_next_button() { ShippingAdreesPage.clickOnNextNutton(); }
	 */

	@When("User clicks the place order button")
	public void user_clicks_the_place_order_button() {
	    ReviewAndPaymentPage.clickingOnPlaceOrderButton();
	}

	@Then("User verifies the Thank you {string}")
	public void user_verifies_the_thank_you(String string) {
		try {
	    	Assert.assertEquals(ReviewAndPaymentPage.thankYouMessage(), string);
	    	CaptureScreenShot.screenShot("Verifies");
	    	logger1.addScreenCaptureFromPath(CaptureScreenShot.screenShot("Verifie"));
	    	logger1.log(Status.PASS, "Expected and Actual Matched");
	    }
	    catch (Exception e) {
			System.out.println(e);
			logger1.log(Status.FAIL, "Expected and Actual Matched");
		}
	}

}

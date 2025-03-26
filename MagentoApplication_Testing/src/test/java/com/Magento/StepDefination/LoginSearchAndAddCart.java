package com.Magento.StepDefination;

import java.util.List;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Excel.DataManipulations;
import com.Magento.Pages.AddToCartPage;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.MyAccountPage;
import com.Magento.Pages.SearchResultsPage;
import com.Magento.Pages.SignInPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSearchAndAddCart extends Browser{
	@When("User clicks on the SignIn link")
	public void user_clicks_on_the_sign_in_link() {
		HomePage.clickOnsignUpLink();
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
		SignInPage.enterEmail(string);
		SignInPage.enterPassword(string2);
	}

	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		SignInPage.clickOnSignInButton();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		try {
			Assert.assertEquals(MyAccountPage.registartionText(), "Home Page");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User searches for {string}")
	public void user_searches_for(String string) {
		HomePage.clickOnSearchBox();
		HomePage.enterSearchTerm(string);

	}

	@When("User selects {string} from the auto-suggestions and click on it")
	public void user_selects_from_the_auto_suggestions_and_click_on_it(String string) {
		HomePage.selectSearchSuggestion(string);
	}
	@When("User cliks on the product")
	public void user_cliks_on_the_product() {
	    SearchResultsPage.productSelection();
	}
	@When("User selects Size ,Color and Quantity of the product")
	public void user_selects_size_color_and_quantity_of_the_product(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> credentials = DataManipulations.datFromExcel(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\ExcelData.xlsx",
				0);

		dataTable = DataTable.create(credentials);
		AddToCartPage.selectSize(dataTable.cell(1, 0));
		AddToCartPage.selectColor(dataTable.cell(1, 1));
		AddToCartPage.slectQuantity(dataTable.cell(1, 2));
	}

	@When("User clicks on Add To Cart button")
	public void user_clicks_on_add_to_cart_button() {
		AddToCartPage.clickOnAddToCartButton();
	}

	@When("Verify wheather product added to cart {string}")
	public void verify_wheather_product_added_to_cart(String string) {
		
		try {
			AddToCartPage.VerifyingAddtoCartMessage();
			CaptureScreenShot.screenShot("Added to Cart Sucessfully");
			logger1.addScreenCaptureFromPath(CaptureScreenShot.screenShot("Added to Cart Sucessfully"));
			logger1.log(Status.PASS, "Expected and Actual Matched");
		} catch (Exception e) {
			
			System.out.println(e+"Exception While Generating ScreenShot");
			logger1.log(Status.FAIL, "MisMatch in Expected and Actual ");
		}
	}

}

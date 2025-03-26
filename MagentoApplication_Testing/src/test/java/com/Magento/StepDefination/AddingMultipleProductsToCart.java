package com.Magento.StepDefination;

import org.testng.Assert;

import com.Magento.Browser.Browser;
import com.Magento.Pages.HomePage;
import com.Magento.Pages.ShoppingCartPage;
import com.Magento.ScreenShots.CaptureScreenShot;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingMultipleProductsToCart extends Browser{

	@When("User mouse hover on Men option")
	public void user_mouse_hover_on_men_option() {
		HomePage.movingToMenOption();
	}

	@Then("User moves to top option")
	public void user_moves_to_top_option() {
		HomePage.movingToTopOption();
	}

	@Then("User moves to Jacket option and Click")
	public void user_moves_to_jacket_option_and_click() {
		HomePage.movingToJacketOption();
	}

	@Then("User moves to Tees option and Click")
	public void user_moves_to_tees_option_and_click() {
		HomePage.movingToTeesOption();
	}
	@Then("User clicks on ViewAndEditCart")
	public void user_clicks_on_view_and_edit_cart() {
	    HomePage.clickOnViewAndEditCartButton();
	}

	@Then("User Verify that the correct {string} and {string} are displayed")
	public void user_verify_that_the_correct_and_are_displayed(String string, String string2) {
	  
		try {
			Assert .assertEquals(string, ShoppingCartPage.firtsProductName());
			Assert .assertEquals(string2, ShoppingCartPage.firstProductPrice());
			logger1.log(Status.PASS, "Expected and Actual Matched");
			CaptureScreenShot.screenShot("Products Added into CartList");
			logger1.addScreenCaptureFromPath(CaptureScreenShot.screenShot("Prodct Added into cart list"));
		
		
		}
		catch (Exception e) {
			System.out.println(e+"Execption While Verifying ");
			logger1.log(Status.FAIL, "Mismatch in Expected and Actual ");
		}
	}
	

}

package com.Magento.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Magento.Browser.Browser;
import com.Magento.Locators.MyAccountPageObjects;
import com.aventstack.extentreports.Status;

public class MyAccountPage extends Browser{
	//Necessary Objects declare Globally
	static MyAccountPageObjects accountPageObjects;
	//Method For Verifying Registration Text
	public static String registartionText() {
		logger1.log(Status.INFO, "Getting Registartion text message");
		String text=null;
		accountPageObjects=new MyAccountPageObjects();
		try {
			wait.until(ExpectedConditions.visibilityOf(accountPageObjects.myAccountTextVerificationElement));
			text=accountPageObjects.myAccountTextVerificationElement.getText();
			logger1.log(Status.PASS, "Sucessfully revied Registration text message");
		}
		catch (Exception e) {
			System.out.println(e+"Exception in myaccount Method");
			logger1.log(Status.FAIL, "Failed to revied Registration text message");
		}
		return text;			
	}

}

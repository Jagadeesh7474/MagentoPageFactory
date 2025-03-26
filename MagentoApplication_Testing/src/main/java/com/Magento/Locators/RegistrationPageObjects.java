package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class RegistrationPageObjects extends Browser {
	public RegistrationPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastNameElemnt;
	
	@FindBy(xpath = "//input[@id='email_address']")
	public WebElement emailElement;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordElement;
	@FindBy(xpath = "//input[@id='password-confirmation']")
	public WebElement confrimPasswordElement;
	@FindBy(xpath = "//button[@title='Create an Account']")
	public WebElement createAnAccountButtonElement;
	@FindBy(xpath = "//div[@id='email_address-error'] ")
	public WebElement errorElement;
	

}

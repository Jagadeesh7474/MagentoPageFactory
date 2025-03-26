package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class SignInPageObjects extends Browser {
	public SignInPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailElement;
	@FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
	public WebElement passwordElement;
	@FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	public WebElement signInElement;
	@FindBy(xpath = "//div[@id='email-error']")
	public WebElement errorElement;
	
	@FindBy(xpath = "//div[@class='panel header']//button[@type='button']")
	public WebElement downArrow;
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	public WebElement signOutButton;
	
}

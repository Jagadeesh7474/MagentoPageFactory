package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class MyAccountPageObjects extends Browser{
	public MyAccountPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='base']")
	public WebElement myAccountTextVerificationElement;
		
}

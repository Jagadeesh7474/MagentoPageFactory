package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class ConformingOrderPageObjects extends Browser{
	public ConformingOrderPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='base']")
	public WebElement thankYouMessage;

}

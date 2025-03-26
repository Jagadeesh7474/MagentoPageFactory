package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class ReviewAndPaymentPageObjects extends Browser{
	public ReviewAndPaymentPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//li[@class='opc-progress-bar-item _complete']//span[contains(text(),'Shipping')]")
	public WebElement shippingButton;
	@FindBy(xpath = "//button[@class='action primary checkout'] ")
	public WebElement placeOrderButton;
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span")
	public WebElement thankYouMessage;

}

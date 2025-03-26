package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class AddToCartPageObjects extends Browser{
	public AddToCartPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='swatch-attribute color']/div/div")
	public List<WebElement> colorList;
	@FindBy(xpath = "//div[@class='swatch-attribute size']/div/div")
	public List<WebElement> sizeList;
	@FindBy(xpath = "//input[@class='input-text qty']")
	public WebElement quantityElement;
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	public WebElement addToCartButtonElement;
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	public WebElement confirmationMessageElement;
	@FindBy(xpath = "//span[@class='base']")
	public WebElement productName;
	
	@FindBy(xpath = "//div[@class='product-info-main']//span[@class='price']")
	public WebElement productPrice;
	
}

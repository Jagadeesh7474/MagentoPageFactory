package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class ShoppingCartPageObjects extends Browser{
	public ShoppingCartPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody/tr//strong/a")
	public List<WebElement> cartProductList;
	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody//td[@class='col price']//span[@class='price']")
	public List<WebElement> cartProcuctPriceList;
	

}

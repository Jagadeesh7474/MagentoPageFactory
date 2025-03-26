package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class SearchResultsPageObjets extends Browser{
	public SearchResultsPageObjets() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='product details product-item-details']/strong/a")
	public List<WebElement> productList;
	@FindBy(xpath = "//a[normalize-space()='Jupiter All-Weather Trainer']")
	public WebElement ProductNameElement;
	 


}

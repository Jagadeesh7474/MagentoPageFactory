package com.Magento.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class HomePageObjects extends Browser {
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	public WebElement createAnAccountLink;
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	public WebElement signUpLink;
	@FindBy(xpath = "//span[text()='Home Page']")
	public WebElement homePagetext;
	
	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchBoxElement;
	@FindBy(xpath = "//ul[@role='listbox']/li/span")
	public List<WebElement> searchBoxAutoSuggestions;
	
	@FindBy(xpath = "//div[@class='minicart-wrapper']/a")
	public WebElement cartButton;
	@FindBy(xpath ="//button[@id='top-cart-btn-checkout']" )
	public WebElement proceedToCheckOutButton;
	
	@FindBy(xpath = "//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
	public WebElement menOption;
	@FindBy(xpath = "//a[@id='ui-id-17']")
	public WebElement topsOption;
	@FindBy(xpath = "//a[@id='ui-id-19']//span[contains(text(),'Jackets')]")
	public WebElement jacketsOption;
	
	@FindBy(xpath = "//a[@id='ui-id-21']//span[contains(text(),'Tees')]")
	public WebElement teesOption;
	
	@FindBy(xpath = "//ol[@id='mini-cart']/li")
	public List<WebElement> ProductsList;
	
	@FindBy(xpath = "//ol[@id='mini-cart']/li//a")
	public List<WebElement> productNameList;
	@FindBy(xpath = "//ol[@id='mini-cart']/li//span[@class='price']")
	public List<WebElement> productPriceList;
	
	@FindBy(xpath = "//span[normalize-space()='View and Edit Cart']")
	public WebElement viewAndEditCartButton;
	
	
	
	
}

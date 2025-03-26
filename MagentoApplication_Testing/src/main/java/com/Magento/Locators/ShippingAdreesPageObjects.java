package com.Magento.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.Browser.Browser;

public class ShippingAdreesPageObjects extends Browser{
	public ShippingAdreesPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = " //input[@name='firstname']  ")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']   ")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@name='street[0]']   ")
	public WebElement streetAddres;
	
	@FindBy(xpath = " //input[@name='city'] ")
	public WebElement city;
	
	@FindBy(xpath = "//select[@name='region_id']   ")
	public WebElement selectRegion;
	
	@FindBy(xpath = "//input[@name='postcode']  ")
	public WebElement zipOrPostalCode;
	
	@FindBy(xpath = " //select[@name='country_id']   ")
	public WebElement selectCountry;
	
	@FindBy(xpath = " //input[@name='telephone']  ")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "//td[text()='Fixed']")
	public WebElement radioButtion;
	
	@FindBy(xpath = "//button[@class='button action continue primary']   ")
	public WebElement nextButton;
	
	@FindBy(xpath = "//div[@class='message warning']/span   ")
	public WebElement errorMessageText;
	
	@FindBy(xpath= "//button[@class='action action-show-popup']  ")
	public WebElement addressButtonElement;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement saveAddressCheckBoxButton;
	
	@FindBy(xpath="//button[@class='action primary action-save-address'] ")
	public WebElement shipHereButtonElement;
	
	
	
	
	
	/*
	 * @FindBy(xpath="//input[@id='W9QTF6F']") public WebElement firstName;
	 * 
	 * @FindBy(xpath="//input[@id='LA1W83P']") public WebElement lastName;
	 * 
	 * @FindBy(id = "BE48YE2") public WebElement streetAddres;
	 * 
	 * @FindBy(xpath="//input[@id='ONSBVVW']") public WebElement city;
	 * 
	 * @FindBy(xpath="//input[@id='DPDVKBD']") public WebElement zipOrPostalCode;
	 * 
	 * @FindBy(xpath="//input[@id='GB79TMS']") public WebElement phoneNumber;
	 * 
	 * @FindBy(xpath = "//input[@name='ko_unique_1']") public WebElement
	 * radioButtion;
	 * 
	 * @FindBy(xpath = "//span[normalize-space()='Next']") public WebElement
	 * nextButton;
	 * 
	 * @FindBy(xpath = "//select[@id='HHARHTN']") public WebElement selectReligion;
	 * 
	 * @FindBy(xpath = "//select[@id='VX529RL']") public WebElement selectCountry;
	 */
	

}

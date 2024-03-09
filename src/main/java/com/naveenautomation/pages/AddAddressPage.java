package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomation.TestBase.TestBase;

public class AddAddressPage extends TestBase{
	
	public AddAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input#input-firstname")

	WebElement firstName;
	
	@FindBy(css = "input#input-lastname")

	WebElement lastName;
	
	@FindBy(css = "input#input-address-1")

	WebElement address1;
	
	@FindBy(css = "input#input-city")

	WebElement city;
	
	@FindBy(css = "input#input-postcode")

	WebElement postCode;
	
	@FindBy(css = "select#input-country")

	WebElement selectCountry;
	
	@FindBy(css = "select#input-zone")

	WebElement selectZone;
	
	@FindBy(css = "input[name='default'][value='1']")

	WebElement defaultAddressCheckBox;
	
	@FindBy(css = "input.btn.btn-primary")

	WebElement addressBookContinue;
	
	private void enterFirstNAme(String fname) {
		firstName.clear();
		firstName.sendKeys(fname);;
			}
	private void enterLastNAme(String lname) {
		lastName.clear();
		lastName.sendKeys(lname);;
			}
	private void enterAddress(String address1) {
		this.address1.clear();
		this.address1.sendKeys(address1);;
			}
	private void enterCity(String cityName) {
		city.clear();
		city.sendKeys(cityName);;
			}
	
	private void enterPostCode(String post) {
		postCode.clear();
		postCode.sendKeys(post);
			}
	
	private void selectCountry() {
		Select select=new Select(selectCountry);
		select.selectByVisibleText("Canada");
	}

	private void selectZone() {
		Select select2=new Select(selectZone);
		select2.selectByVisibleText("Ontario");
	}
	
	private void clickDefaultAddress() {
		defaultAddressCheckBox.click();
		
			}
	
	private void clickContinue() {
	addressBookContinue.click();
		
			}
	
	public AddressBookPage newAddressFillingFlow(String fname,String lName,String address1, String city, String postCode) {
		enterFirstNAme(fname);
		enterLastNAme(lName);
		enterAddress(address1);
		enterCity(city);
		enterPostCode(postCode);
		selectCountry();
		selectZone();
		clickDefaultAddress();
		clickContinue();
		return new AddressBookPage();
		
	}

}
 
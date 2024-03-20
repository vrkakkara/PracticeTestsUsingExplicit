package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

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
		Utility.clearField(firstName);
		Utility.enterText(firstName, fname);
					}
	private void enterLastNAme(String lname) {
		Utility.clearField(lastName);
		Utility.enterText(lastName, lname);
			}
	private void enterAddress(String address1) {
		Utility.clearField(this.address1);
		Utility.enterText(this.address1, address1);
			}
	private void enterCity(String cityName) {
		Utility.clearField(city);
		Utility.enterText(city, cityName);
			}
	
	private void enterPostCode(String post) {
		Utility.clearField(postCode);
		Utility.enterText(postCode, post);
			}
	
	private void selectCountry() {
		Utility.selectDropdownByVisibleText(selectCountry, "Canada");
	}

	private void selectZone() {
		Select select2=new Select(selectZone);
		Utility.sleep(3);
		select2.selectByVisibleText("Ontario");
	}
	
	private void clickDefaultAddress() {
		Utility.clickElement(defaultAddressCheckBox);
		
			}
	
	private void clickContinue() {
		Utility.clickElement(addressBookContinue);
		
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
 
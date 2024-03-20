package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class AddressBookPage extends TestBase{
	
	public AddressBookPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.buttons.clearfix>div.pull-right>a")

	WebElement newAddressBtn;
	
	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement addressAddedBanner;
	

	public AddAddressPage clickNewAddressBtn() {
		Utility.clickElement(newAddressBtn);
		return new AddAddressPage();

	}
	
	public void validateAddressAddition() {
		String addressBanner=addressAddedBanner.getText();
		Assert.assertEquals(addressBanner,
				"Your address has been successfully added");
	}

}

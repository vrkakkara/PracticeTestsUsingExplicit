package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class EditAccountPage extends TestBase{
	
	@FindBy(css = "input#input-firstname")

	WebElement firstName;
	
	@FindBy(css = "input#input-lastname")

	WebElement lastName;
	
	@FindBy(css = "input#input-email")

	WebElement emailField;
	
	@FindBy(css = "input#input-telephone")

	WebElement telephoneField;
	
	@FindBy(xpath = "//input[@class='btn btn-primary' and @value='Continue']")

	WebElement continueBtn;
	
	
	private void enterFirstName() {
		Utility.clearField(firstName);
		Utility.enterText(firstName, Utility.generateRandomName());
	}
	
	private void enterLastName() {
		Utility.clearField(lastName);
		Utility.enterText(lastName, Utility.generateRandomName());
	}
	
	private void enterEmail() {
		Utility.clearField(emailField);
		Utility.enterText(emailField, Utility.generateRandomemail());
	}
	
	private void enterTelephone() {
		Utility.clearField(telephoneField);
		Utility.enterText(telephoneField, Utility.generateRandomPhoneNumber());
	}
	
	private void clickContinueBtn() {
		Utility.submitClickElement(continueBtn);
	}
	
	
	public MyAccountPage editAccountFlow() {
		enterFirstName();
		enterLastName();
		enterEmail();
		enterTelephone();
		clickContinueBtn();
		return new MyAccountPage();
	}
	

}

package com.naveenautomation.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class ContactUsPage extends TestBase {

	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}

		

	@FindBy(css = "input[name='name']")

	WebElement yourName;

	@FindBy(css = "input[name='email']")

	WebElement emailAddress;

	@FindBy(css = "textarea[name='enquiry']")

	WebElement enquiry;

	@FindBy(css = "input[value='Submit']")

	WebElement contactSubmitBtn;

	@FindBy(css = "div#content>p")

	WebElement contactUsConfirmation;
	
	@FindBy(css = "a.btn")

	WebElement continueBtn;

	private void enterName(String name) {
		Utility.enterText(yourName, name);
			//yourName.sendKeys(name);
		

	}
private void enterEmail(String email) {
		
	Utility.clearField(emailAddress);
	Utility.enterText(emailAddress, email);

	}

	
	
	private void enterEnquiry(String enquiryText) {
		Utility.enterText(enquiry, enquiryText);

	}

	private void clickContactSubmit() {
		Utility.submitClickElement(contactSubmitBtn);


	}
	
	private void validateContactUs() {

		String contactUsConfirmationText = Utility.getTextOfElement(contactUsConfirmation);
		System.out.println(contactUsConfirmationText);

		Assert.assertEquals(contactUsConfirmationText, "Your enquiry has been successfully sent to the store owner!");

	}
	
	private void clickContinueBtn() {
    Utility.clickElement(continueBtn);

	}

	public MyAccountPage validateContactUsFlow( String name, String email, String enquiryText) {
		enterName(name);
		enterEmail(email);
		enterEnquiry(enquiryText);
		clickContactSubmit();
		validateContactUs();
		clickContinueBtn();
        return new MyAccountPage();
	}

	
}

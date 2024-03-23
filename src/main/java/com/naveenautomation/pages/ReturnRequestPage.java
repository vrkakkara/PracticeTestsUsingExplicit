package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class ReturnRequestPage extends TestBase{
	
	
	public ReturnRequestPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div#content h1")

	WebElement returnRequestBanner;
	
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement returnRequestContinueBtn;
	
	
	private void validateReturnRequestConfirmation() {
		String returnRequestText=returnRequestBanner.getText();
		Assert.assertEquals(returnRequestText,
				"Product Returns");
	}
	
	private void clickReturnContinue() {
		returnRequestContinueBtn.click();

	}
	
	public void validateReturnRequestFlow() {
		validateReturnRequestConfirmation();
		clickReturnContinue();
	}

}

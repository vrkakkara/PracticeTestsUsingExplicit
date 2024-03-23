package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class RecurringPaymentPage extends TestBase{
	@FindBy(xpath = "//div[@id='content']/p")

	WebElement recurringPaymentText;
	
	public void assertRecurringPayments() {
		String recurringBanner = Utility.getTextOfElement(recurringPaymentText);
		Assert.assertEquals(recurringBanner, "No recurring payments found!");
	}

}

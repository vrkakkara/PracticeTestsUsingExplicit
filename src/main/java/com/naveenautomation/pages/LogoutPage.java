package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class LogoutPage extends TestBase{
	
	@FindBy(css = "div#content p:first-of-type")

	WebElement logoutText;
	
	public void assertLogout() {
		String logoutConfirmationText = Utility.getTextOfElement(logoutText);
		Assert.assertEquals(logoutConfirmationText, "You have been logged off your account. It is now safe to leave the computer.");
	}

}

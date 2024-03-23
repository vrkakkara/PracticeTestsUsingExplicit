package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class PrivacyPolicyPage extends TestBase{
	@FindBy(css = "div#content p")

	WebElement privacyPolicyText;
	
	public void assertPrivacyPolicy(){
		String privacyPolicyBanner = Utility.getTextOfElement(privacyPolicyText);
		Assert.assertEquals(privacyPolicyBanner, "Privacy Policy");
	}

}

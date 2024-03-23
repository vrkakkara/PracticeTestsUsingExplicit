package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class SpecialsPage extends TestBase{

	
	@FindBy(css = "div#content h2")

	WebElement specialsText;
	
	public void validateSpecialsBanner() {
		String specialsBanner = Utility.getTextOfElement(specialsText);
		Assert.assertEquals(specialsBanner, "Special Offers");
	}



}

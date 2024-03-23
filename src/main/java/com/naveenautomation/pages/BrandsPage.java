package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class BrandsPage extends TestBase{
	

	
	@FindBy(css = "div#content h1")

	WebElement BrandsText;
	
	public void validateBrandsBanner() {
		String brandsBanner = Utility.getTextOfElement(BrandsText);
		Assert.assertEquals(brandsBanner, "Find Your Favorite Brand");
	}



}

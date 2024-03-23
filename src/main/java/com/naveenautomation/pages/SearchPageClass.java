package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class SearchPageClass extends TestBase {
	
	@FindBy(css = "div.caption")

	WebElement appleCinemaCaption;
	
	@FindBy(css = "div.caption a")

	WebElement HTCCaption;
	
	@FindBy(css = "div.caption a")

	WebElement CanonCaption;
	
	public void validateAppleProduct() {
		String productName=Utility.getTextOfElement(appleCinemaCaption);

		if(productName.contains("Apple"));
		{Assert.assertTrue(true);}
	}
	
	public void validateHTCProduct() {
		String HTCproductName=Utility.getTextOfElement(HTCCaption);

		if(HTCproductName.contains("HTC"));
		{Assert.assertTrue(true);}
	}
	
	public void validateCanonProduct() {
		String CanonProductName=Utility.getTextOfElement(CanonCaption);

		if(CanonProductName.contains("Canon"));
		{Assert.assertTrue(true);}
	}

}

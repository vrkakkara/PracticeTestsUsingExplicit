package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class SiteMapsPage extends TestBase{
	
	@FindBy(css = "div#content h1")

	WebElement siteMapText;
	
	public void assertSiteMap() {
		String siteMapBanner = Utility.getTextOfElement(siteMapText);
		Assert.assertEquals(siteMapBanner, "Site Map");
	}

}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class AboutUsPage extends TestBase{
	
	@FindBy(css = "div#content p")

	WebElement aboutUsText;
	
	public void assertAboutUs() {
		String aboutUsBanner = Utility.getTextOfElement(aboutUsText);
		Assert.assertEquals(aboutUsBanner, "About us");
	}

}

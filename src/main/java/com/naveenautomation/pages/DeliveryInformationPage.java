package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class DeliveryInformationPage extends TestBase{
	@FindBy(css = "div#content p")

	WebElement DeliveryInformationText;
	
	public void assertDeliveryInformation() {
		String DeliveryInformationBanner = Utility.getTextOfElement(DeliveryInformationText);
		Assert.assertEquals(DeliveryInformationBanner, "Delivery Information");
	}

}

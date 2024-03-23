package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class MonitorsPage extends TestBase{
	
	//Apple cinema
	@FindBy(css = "div.row>div.product-layout:nth-of-type(1) div.caption")

	WebElement appleCinema;
	
	public AppleCinemaPage clickAppleCinemaBtn() {
		Utility.clickElement(appleCinema);
		return new AppleCinemaPage();
		
	}

}

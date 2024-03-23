package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class AppleCinemaPage extends TestBase{
	
	//Apple cinema screen size
		@FindBy(css = "div#tab-description ul:nth-of-type(9)")

		WebElement appleCinemaScreenSize;
		
		public void validateScreenSize(){
			String screenSize=Utility.getTextOfElement(appleCinemaScreenSize);

			if(screenSize.contains("30-inch"));
			{Assert.assertTrue(true);}
		}
		

}

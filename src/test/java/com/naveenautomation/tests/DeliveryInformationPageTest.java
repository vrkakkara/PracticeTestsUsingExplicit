package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AboutUsPage;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.DeliveryInformationPage;
import com.naveenautomation.pages.MyAccountPage;

public class DeliveryInformationPageTest extends TestBase{
	MyAccountPage myAccount;
	DeliveryInformationPage deliveryInformation;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateDeliveryInformation() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    deliveryInformation=myAccount.clickDeliveryInfo();
	    deliveryInformation.assertDeliveryInformation();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}
}

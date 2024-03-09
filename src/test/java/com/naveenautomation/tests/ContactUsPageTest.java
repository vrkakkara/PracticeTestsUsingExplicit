package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUsPage;
import com.naveenautomation.pages.MyAccountPage;

public class ContactUsPageTest extends TestBase {
	AccountLoginPage loginPage;
	ContactUsPage contactUsPage;
	MyAccountPage myAccount;

	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
	}

	
	  @AfterMethod (enabled = false)
	  public void closeBrowser() { 
		  pageQuit(); }
	 



	@Test
	public void validateContactUs() {
		loginPage=new AccountLoginPage();
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		contactUsPage=myAccount.clickContactUsBtn();
		contactUsPage.validateContactUsFlow("Vishnu", RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(25));
		
	}

	

}

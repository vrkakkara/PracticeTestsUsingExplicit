package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.LogoutPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.RecurringPaymentPage;

public class RecurringPaymentTest extends TestBase{
	MyAccountPage myAccount;
	RecurringPaymentPage recurring;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateRecurringPayments() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    recurring=myAccount.clickRecurringPayentBtn();
	    recurring.assertRecurringPayments();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}
	
	

}

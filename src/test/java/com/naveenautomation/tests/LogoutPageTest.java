package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.LogoutPage;
import com.naveenautomation.pages.MyAccountPage;

public class LogoutPageTest extends TestBase{
	MyAccountPage myAccount;
	LogoutPage logout;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateLogout() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    logout=myAccount.clickLogoutBtn();
	    logout.assertLogout();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}


}

package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AboutUsPage;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.PrivacyPolicyPage;

public class PrivacyPolicyPageTest extends TestBase {
	MyAccountPage myAccount;
	PrivacyPolicyPage privacyPolicy;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAboutUs() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    privacyPolicy=myAccount.clickPrivacyPolicy();
	    privacyPolicy.assertPrivacyPolicy();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}

}

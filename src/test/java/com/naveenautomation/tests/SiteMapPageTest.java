package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.SiteMapsPage;
import com.naveenautomation.pages.TermsConditionsPage;

public class SiteMapPageTest extends TestBase{


	
	MyAccountPage myAccount;
	SiteMapsPage siteMap;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateSiteMap() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    siteMap=myAccount.clickSiteMap();
	    siteMap.assertSiteMap();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}





}

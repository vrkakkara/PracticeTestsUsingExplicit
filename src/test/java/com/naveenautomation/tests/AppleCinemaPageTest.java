package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AppleCinemaPage;
import com.naveenautomation.pages.MonitorsPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.TermsConditionsPage;

public class AppleCinemaPageTest extends TestBase{


	
	MyAccountPage myAccount;
	AppleCinemaPage applecinema;
	MonitorsPage monitor;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAboutUs() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    monitor=myAccount.clickMonitorFlow();
	    applecinema=monitor.clickAppleCinemaBtn();
	    applecinema.validateScreenSize();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}





}

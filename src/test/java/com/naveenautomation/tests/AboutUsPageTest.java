package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AboutUsPage;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;

public class AboutUsPageTest extends TestBase{
	
	MyAccountPage myAccount;
	AboutUsPage aboutUs;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAboutUs() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    aboutUs=myAccount.clickAboutus();
	    aboutUs.assertAboutUs();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}

}

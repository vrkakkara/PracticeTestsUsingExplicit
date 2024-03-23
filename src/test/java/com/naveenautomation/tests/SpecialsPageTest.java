package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.SpecialsPage;
import com.naveenautomation.pages.TermsConditionsPage;

public class SpecialsPageTest extends TestBase{
	


	
	MyAccountPage myAccount;
	SpecialsPage specials;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAboutUs() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    specials=myAccount.clickSpecials();
	    specials.validateSpecialsBanner();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}





}

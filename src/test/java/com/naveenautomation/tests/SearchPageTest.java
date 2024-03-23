package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.SearchPageClass;
import com.naveenautomation.pages.TermsConditionsPage;

public class SearchPageTest extends TestBase{

	
	MyAccountPage myAccount;
	SearchPageClass search;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAppleProduct() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    search=myAccount.clickSearchBtnAppleFlow();
	    search.validateAppleProduct();
	 	}
	
	
	@Test
	public void validateHTCProduct() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    search=myAccount.clickSearchBtnHTCFlow();
	    search.validateHTCProduct();
	 	}
	
	@Test
	public void validateCanonProduct() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    search=myAccount.clickSearchBtnCanonFlow();
	    search.validateCanonProduct();
	 	}
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}



}

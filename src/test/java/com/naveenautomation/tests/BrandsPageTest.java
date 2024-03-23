package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.BrandsPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.TermsConditionsPage;

public class BrandsPageTest extends TestBase{
	


	
	MyAccountPage myAccount;
	BrandsPage brands;
	AccountLoginPage loginPage;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateAboutUs() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    brands=myAccount.clickBrands();
	    brands.validateBrandsBanner();
	 	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}





}

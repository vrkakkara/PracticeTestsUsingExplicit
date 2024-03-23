package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ReturnRequestPage;
import com.naveenautomation.pages.RewardPointsPage;

public class ReturnRequestTest extends TestBase{
	
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
    ReturnRequestPage returnRequest;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	@Test
	public void validateRewardPoints() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		returnRequest=myAccount.clickReturnRequest();
		returnRequest.validateReturnRequestFlow();
		
					
	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}


}

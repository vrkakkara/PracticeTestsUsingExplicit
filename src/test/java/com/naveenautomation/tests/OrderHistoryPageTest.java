package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsLetterPage;
import com.naveenautomation.pages.OrderHistoryPage;
import com.naveenautomation.pages.PasswordChangePage;

public class OrderHistoryPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
	OrderHistoryPage orderHistory;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	
	
	
	
	@Test
	public void validateAdditionToWishlist() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	    orderHistory=myAccount.clickOrderHistoryBtn();
	    orderHistory.fetchOrderIdFlow();
	    
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}


}

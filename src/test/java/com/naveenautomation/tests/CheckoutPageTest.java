package com.naveenautomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.CheckoutPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.ShoppingCartPage;

public class CheckoutPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
	ShoppingCartPage shoppingCart;
	CheckoutPage checkout;
	
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateCheckout() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		shoppingCart=myAccount.addToCartFlow();
		checkout=shoppingCart.checkoutFlow("M3A 1Y1");
		checkout.validateOrderPlacement();
	}
	
	@AfterMethod
	public void closeBrowser() {
		pageQuit();
	}


}

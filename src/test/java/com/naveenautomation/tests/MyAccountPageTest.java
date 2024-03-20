package com.naveenautomation.tests;

import org.testng.annotations.BeforeMethod;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
	//NewsLetterPage newsLetter;
	//PasswordChangePage password;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
		//newsLetter
	//@Test
	/*
	 * public void validateNewsletter() {
	 * myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	 * newsLetter=myAccount.clicknewsLetterBtn();
	 * myAccount=newsLetter.newsLetterFlow(); myAccount.validateNewsLetterMessage();
	 * }
	 */
	
	
	
	
	
	
	//change Password
//@Test
	/*
	 * public void validatePasswordChange() {
	 * myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	 * password=myAccount.clickPaswordChangeBtn();
	 * myAccount=password.passwordChangeFlow("Password@1", "Password@1");
	 * myAccount.validatePasswordChangeMessage();
	 * 
	 * }
	 */

	
	
	
	
	
	
//added to Wishlist

	/*
	 * @Test public void validateAdditionToWishlist() {
	 * myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
	 * myAccount.addToWishlistFlow();
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

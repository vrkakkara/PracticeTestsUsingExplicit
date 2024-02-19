package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;

public class AccountloginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
	}

	/*
	 * @AfterMethod public void closeBrowser() { pageQuit(); }
	 */

	@Test
	public void signupSignin() {
		AccountLoginPage page = new AccountLoginPage();
		page.signingUpFlow("Vishnu", "Raj", "vrk@yahoo.com", "6479131386", "Password@1", "Password@1");
		page.loggingIn("vrk@yahoo.com", "Password@1");
	}

	@Test
	public void validateContactUs() {
		AccountLoginPage page = new AccountLoginPage();
		page.contactUsFlow("vrk@yahoo.com", "Password@1", RandomStringUtils.randomAlphabetic(5),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(25));
	}

	@Test
	public void validateGiftCertificate() {
		AccountLoginPage page = new AccountLoginPage();
		page.giftCertificateFlow("vrk@yahoo.com", "Password@1", RandomStringUtils.randomAlphabetic(5),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(7),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(25),
				RandomStringUtils.randomNumeric(2));

	}

}

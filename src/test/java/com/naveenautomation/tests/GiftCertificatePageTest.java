package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ContactUsPage;
import com.naveenautomation.pages.GiftCertificatePage;
import com.naveenautomation.pages.MyAccountPage;

public class GiftCertificatePageTest extends TestBase{
	
	AccountLoginPage loginPage;
	GiftCertificatePage giftCertificate;
	MyAccountPage myAccount;

	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}

	@Test
	public void validateGiftCertificate() {
		
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		giftCertificate=myAccount.clickGiftCertificateBtn();
		giftCertificate.validateGiftCertificateFlow(RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(5),  RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(25), RandomStringUtils.randomNumeric(2));
		
	}
	
}

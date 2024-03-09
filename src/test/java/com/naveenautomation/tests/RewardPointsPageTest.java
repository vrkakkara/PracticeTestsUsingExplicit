package com.naveenautomation.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.DownloadsPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.RewardPointsPage;

public class RewardPointsPageTest extends TestBase{

	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
    RewardPointsPage rewards;
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	@Test
	public void validateRewardPoints() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		rewards=myAccount.clickRewardPointsBtn();
		rewards.validateRewardPointsConfirmation();
					
	}
}

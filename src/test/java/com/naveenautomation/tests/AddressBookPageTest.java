package com.naveenautomation.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AddAddressPage;
import com.naveenautomation.pages.AddressBookPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.pages.NewsLetterPage;
import com.naveenautomation.pages.PasswordChangePage;

public class AddressBookPageTest extends TestBase{
	
	AccountLoginPage loginPage;
	MyAccountPage myAccount;
	AddressBookPage addressBook;
	AddAddressPage addAddress;

	
	
	@BeforeMethod
	public void launchBrowser() {
		pageInitialisation();
		loginPage=new AccountLoginPage();
	}
	
	
	@Test
	public void validateNewAddressAddition() {
		myAccount=loginPage.loggingIn("vrk@yahoo.com", "Password@1");
		addressBook=myAccount.clickAddressChnageBtn();
		addAddress=addressBook.clickNewAddressBtn();
		addressBook=addAddress.newAddressFillingFlow("Vishnu", "Raj", "houseNo10", "Mississauga", "l4z4e9");
		addressBook.validateAddressAddition();
					
				}


	
	
}

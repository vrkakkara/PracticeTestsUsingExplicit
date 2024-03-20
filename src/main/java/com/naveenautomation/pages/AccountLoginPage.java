package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class AccountLoginPage extends TestBase {

	public AccountLoginPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(css = "a.dropdown-toggle[title='My Account']")
	WebElement myAccount;

	@FindBy(css = "ul.dropdown-menu.dropdown-menu-right li:nth-of-type(2)>a")
	WebElement loginBtn;

	@FindBy(css = "input#input-email")
	WebElement emailInput;

	@FindBy(css = "input#input-password")
	WebElement passwordInput;

	@FindBy(css = "input.btn.btn-primary")
	WebElement submitBtn;

	private void clickMyAccountLoginBtns() {
		Utility.clickElement(myAccount);
		Utility.clickElement(loginBtn);
			}

	private void enterUsernamePassword(String userName, String password) {
		Utility.clearField(emailInput);
		Utility.enterText(emailInput, userName);
		//emailInput.sendKeys(userName);
		Utility.clearField(passwordInput);
		Utility.enterText(passwordInput, password);
		//passwordInput.sendKeys(password);

	}

	private void clickSubmit() {
		Utility.submitClickElement(submitBtn);
		
	}

	public MyAccountPage loggingIn(String userName, String password) {
		clickMyAccountLoginBtns();
		enterUsernamePassword(userName, password);
		clickSubmit();
        return new MyAccountPage();
	}

	
}

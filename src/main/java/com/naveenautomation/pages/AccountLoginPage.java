package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

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
		myAccount.click();
		loginBtn.click();
	}

	private void enterUsernamePassword(String userName, String password) {
		emailInput.clear();
		emailInput.sendKeys(userName);
		passwordInput.clear();
		passwordInput.sendKeys(password);

	}

	private void clickSubmit() {
		submitBtn.submit();

	}

	public MyAccountPage loggingIn(String userName, String password) {
		clickMyAccountLoginBtns();
		enterUsernamePassword(userName, password);
		clickSubmit();
        return new MyAccountPage();
	}

	
}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class PasswordChangePage extends TestBase{
	
	public PasswordChangePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input#input-password")

	WebElement newPassword;
	
	@FindBy(css = "input#input-confirm")

	WebElement newPasswordConfirm;
	
	@FindBy(css = "input.btn.btn-primary")

	WebElement passwordContinueBtn;
	
	
	private void enterNewPassword(String password) {
		this.newPassword.clear();
		this.newPassword.sendKeys(password);
		
	}
	
	private void enterConfirmNewPassword(String confirmPassword) {
		this.newPasswordConfirm.clear();
		this.newPasswordConfirm.sendKeys(confirmPassword);
		
	}
	
	private void clickPasswordChangeContinueBtn() {
		passwordContinueBtn.click();
	}
	
	public MyAccountPage passwordChangeFlow(String password,String confPassword) {
		enterNewPassword(password);
		enterConfirmNewPassword(confPassword);
		clickPasswordChangeContinueBtn();
		return new MyAccountPage();
	}
	

}

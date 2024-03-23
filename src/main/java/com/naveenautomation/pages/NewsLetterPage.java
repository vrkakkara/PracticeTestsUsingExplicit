package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class NewsLetterPage extends TestBase {
	

	public NewsLetterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css = "input[name='newsletter'][value='1']")

	WebElement newsLetterCheckBoxYes;
	
	@FindBy(css = "input.btn.btn-primary")

	WebElement newsLetterContinueBtn;
	
	
	private void clickNewsletterCheckbox() {
		newsLetterCheckBoxYes.click();
	}
	
	private void clickNewsletterContinueBtn() {
		newsLetterContinueBtn.click();
	}
	
	public MyAccountPage newsLetterFlow() {
		clickNewsletterCheckbox();
		clickNewsletterContinueBtn();
		return new MyAccountPage();
	}


}

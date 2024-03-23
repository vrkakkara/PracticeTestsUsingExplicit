package com.naveenautomation.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class GiftCertificatePage extends TestBase {

	public GiftCertificatePage() {
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(css = "ul.list-unstyled>li:nth-of-type(2) a[href*='voucher']")

	WebElement giftCertificateBtn;

	@FindBy(css = "input[name='to_name']")

	WebElement recipientName;

	@FindBy(css = "input[name='to_email']")

	WebElement recipientEmail;

	@FindBy(css = "input[name='from_name']")

	WebElement GiftCertiYourName;

	@FindBy(css = "input[name='from_email']")

	WebElement yourEmail;

	@FindBy(css = "input[name='voucher_theme_id'][value='6']")

	WebElement giftCertificateTheme;

	@FindBy(css = "textarea[name='message'][id='input-message']")

	WebElement giftCertificateMessage;

	@FindBy(css = "input[name='amount'][id='input-amount']")

	WebElement giftCertificateAmount;

	@FindBy(css = "input[type='checkbox']")

	WebElement giftCertificateCheckBox;

	@FindBy(css = "input[type='submit'][value='Continue")

	WebElement giftCertificateContinueBtn;

	@FindBy(css = "div#content>p")

	WebElement giftCertificateConfirmation;
	
	@FindBy(css = "div>div#logo>a")

	WebElement continueBtn;

	private void clickGiftCertificate() {
		giftCertificateBtn.click();

	}

	private void enterRecipientName(String recipientNameEntered) {
		recipientName.clear();
		recipientName.sendKeys(recipientNameEntered);
		

	}
	
	private void enterRecipientEmail(String recipientEmail) {
		this.recipientEmail.clear();
		this.recipientEmail.sendKeys(recipientEmail);;
		

	}
	
	private void enterGiftCertiYourName(String GiftCertiName) {
		GiftCertiYourName.clear();
		GiftCertiYourName.sendKeys(GiftCertiName);
		

	}
	private void enterYourEmail(String yourEmailAddress) {
		yourEmail.clear();
		yourEmail.sendKeys(yourEmailAddress);
		

	}
	
	private void clickGiftCertificateTheme() {

		giftCertificateTheme.click();
			}
	
	private void enterGiftCertificateMessage(String message) {

		giftCertificateMessage.clear();
		giftCertificateMessage.sendKeys(message);
			}
	
	private void enterGiftCertificateAmount(String giftAmount) {

		giftCertificateAmount.sendKeys(giftAmount);
			}
	
	private void clickGiftCertificateCheckBox() {

		giftCertificateCheckBox.click();
			}
	
	
	private void giftCertificateSubmit() {

		giftCertificateContinueBtn.submit();

	}

	public void validateGiftCertificate() {

		String giftCertificateText = giftCertificateConfirmation.getText();
		Assert.assertEquals(giftCertificateText,
				"Thank you for purchasing a goft certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.");

	}
	
	private void clickContinueBtn() {

		continueBtn.click();
			}
	

	public MyAccountPage validateGiftCertificateFlow( String recipientNameEntered, String recipientMail,
			String giftCertiName, String yourEmailAddress, String giftMessage, String giftAmount) {
		clickGiftCertificate();
		enterRecipientName(recipientNameEntered);
		enterRecipientEmail(recipientMail);
		enterGiftCertiYourName(giftCertiName);
		enterYourEmail(yourEmailAddress);
		clickGiftCertificateTheme();
		enterGiftCertificateMessage(giftMessage);
		enterGiftCertificateAmount(giftAmount);
		clickGiftCertificateCheckBox();
		giftCertificateSubmit();
		validateGiftCertificate();
		clickContinueBtn();
		return new MyAccountPage();
		

	}

}

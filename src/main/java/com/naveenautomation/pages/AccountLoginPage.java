package com.naveenautomation.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class AccountLoginPage extends TestBase {

	public AccountLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "ul.list-unstyled>li:first-of-type>a[href*='account']")
	WebElement myAccountDropDown;

	@FindBy(css = "aside#column-right>div>a:nth-of-type(2)")
	WebElement registerBtn;

	@FindBy(css = "input#input-firstname")
	WebElement firstName;

	@FindBy(css = "input#input-lastname")
	WebElement lastName;

	@FindBy(css = "input#input-email")
	WebElement inputEmail;

	@FindBy(css = "input#input-telephone")
	WebElement inputTelephone;

	@FindBy(css = "input#input-password")
	WebElement inputPassword;

	@FindBy(css = "input#input-confirm")
	WebElement confirmPassword;

	@FindBy(css = "label.radio-inline>input[name='newsletter'][checked='checked']")
	WebElement subscribeBtn;

	@FindBy(css = "input[type='checkbox']")
	WebElement termsAndCOnditions;

	@FindBy(css = "input[type='submit']")
	WebElement continueBtn;

	@FindBy(css = "div#content>p>a")
	WebElement loginPage;

	private void clickMyAccount() {
		myAccountDropDown.click();
	}

	private void clickRegister() {
		registerBtn.click();

	}

	private void enterFirstNameAndLastName(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
	}

	private void enterEmailTelePhone(String email, String phoneNumber) {
		inputEmail.sendKeys(email);
		inputTelephone.sendKeys(phoneNumber);

	}

	private void enterPasswordConfirmPassword(String pwd, String confirmPwd) {
		inputPassword.sendKeys(pwd);
		confirmPassword.sendKeys(confirmPwd);

	}

	private void clickSubscribeTermsAndCondition() {
		subscribeBtn.click();
		termsAndCOnditions.click();

	}

	private void clickcontinueBtn() {
		continueBtn.click();

	}

	private void clickloginPage() {
		loginPage.click();

	}

	public void signingUpFlow(String fName, String lName, String email, String phoneNumber, String pwd,
			String confirmPwd) {
		clickMyAccount();
		clickRegister();
		enterFirstNameAndLastName(fName, lName);
		enterEmailTelePhone(email, phoneNumber);
		enterPasswordConfirmPassword(pwd, confirmPwd);
		clickSubscribeTermsAndCondition();
		clickcontinueBtn();
		clickloginPage();

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
		inputEmail.clear();
		inputEmail.sendKeys(userName);
		passwordInput.clear();
		passwordInput.sendKeys(password);

	}

	private void clickSubmit() {
		submitBtn.submit();

	}

	public void loggingIn(String userName, String password) {
		clickMyAccountLoginBtns();
		enterUsernamePassword(userName, password);
		clickSubmit();

	}

	@FindBy(xpath = "//a[text()='Contact Us']")

	WebElement contactUsBtn;

	@FindBy(css = "input[name='name']")

	WebElement yourName;

	@FindBy(css = "input[name='email']")

	WebElement emailAddress;

	@FindBy(css = "textarea[name='enquiry']")

	WebElement enquiry;

	@FindBy(css = "input[value='Submit']")

	WebElement contactSubmitBtn;

	@FindBy(css = "input[value='Submit']")

	WebElement contactUsConfirmation;

	private void enterNameEmail(String name, String email) {
		contactUsBtn.click();
		yourName.clear();
		yourName.sendKeys(name);
		emailAddress.clear();
		emailAddress.sendKeys(email);

	}

	private void enterEnquiry(String enquiryText) {

		enquiry.sendKeys(enquiryText);

	}

	private void clickContactSubmit() {

		contactSubmitBtn.submit();

	}

	private void validateContactUs() {

		String addToCartText = contactUsConfirmation.getText();

		Assert.assertEquals(addToCartText, "Your enquiry has been successfully sent to the store owner!");

	}

	public void contactUsFlow(String username, String password, String name, String email, String enquiryText) {
		loggingIn(username, password);
		enterNameEmail(name, email);
		enterEnquiry(enquiryText);
		clickContactSubmit();
		validateContactUs();

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

	private void clickGiftCertificate() {
		giftCertificateBtn.click();

	}

	private void enterGiftCertificateDetails(String recipientNameEntered, String recipientMail, String GiftCertiName,
			String yourEmailAddress) {
		recipientName.clear();
		recipientName.sendKeys(recipientNameEntered);
		recipientEmail.clear();
		recipientEmail.sendKeys(recipientMail);
		GiftCertiYourName.clear();
		GiftCertiYourName.sendKeys(GiftCertiName);
		yourEmail.clear();
		yourEmail.sendKeys(yourEmailAddress);

	}

	private void enterMessageAmountCheckBox(String message, String giftAmount) {

		giftCertificateTheme.click();
		giftCertificateMessage.clear();
		giftCertificateMessage.sendKeys(message);
		giftCertificateAmount.sendKeys(giftAmount);
		giftCertificateCheckBox.click();

	}

	private void giftCertificateSubmit() {

		giftCertificateContinueBtn.submit();

	}

	public void validateGiftCertificate() {

		String giftCertificateText = giftCertificateConfirmation.getText();
		Assert.assertEquals(giftCertificateText,
				"Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.");

	}

	public void giftCertificateFlow(String username, String password, String recipientNameEntered, String recipientMail,
			String giftCertiName, String yourEmailAddress, String giftMessage, String giftAmount) {
		loggingIn(username, password);
		clickGiftCertificate();
		enterGiftCertificateDetails(recipientNameEntered, recipientMail, giftCertiName, yourEmailAddress);
		enterMessageAmountCheckBox(giftMessage, giftAmount);
		giftCertificateSubmit();
		validateGiftCertificate();

	}

}

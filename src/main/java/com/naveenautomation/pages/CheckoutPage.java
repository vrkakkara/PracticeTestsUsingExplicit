package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class CheckoutPage extends TestBase{

	
		public CheckoutPage() {
			PageFactory.initElements(driver, this);
		}
		
		/*
		 * @FindBy(css = "input#input-payment-firstname")
		 * 
		 * WebElement firstName;
		 * 
		 * @FindBy(css = "input#input-payment-lastname")
		 * 
		 * WebElement lastName;
		 * 
		 * @FindBy(css = "input#input-payment-company")
		 * 
		 * WebElement companyName;
		 * 
		 * @FindBy(css = "input-payment-address-1")
		 * 
		 * WebElement addressLine1;
		 * 
		 * @FindBy(css = "input-payment-address-2")
		 * 
		 * WebElement addressLine2;
		 * 
		 * @FindBy(css = "input-payment-city")
		 * 
		 * WebElement city;
		 * 
		 * @FindBy(css = "input#input-payment-postcode")
		 * 
		 * WebElement postCode;
		 * 
		 * @FindBy(css = "select#input-payment-country")
		 * 
		 * WebElement countrySelect;
		 * 
		 * @FindBy(css = "select#input-payment-zone")
		 * 
		 * WebElement zoneSelect;
		 * 
		 * @FindBy(css = "input#button-payment-address")
		 * 
		 * WebElement continueBtn;
		 * 
		 * 
		 * private void enterFirstName(String fName) {
		 * 
		 * firstName.clear(); firstName.sendKeys(fName); }
		 * 
		 * private void enterLastName(String lName) {
		 * 
		 * lastName.clear(); lastName.sendKeys(lName); }
		 * 
		 * private void enterCompanyName(String companyName) {
		 * 
		 * this.companyName.clear(); this.companyName.sendKeys(companyName); }
		 * 
		 * private void enteraddressLine1(String addressLine1) {
		 * 
		 * this.addressLine1.clear(); this.addressLine1.sendKeys(addressLine1); }
		 * 
		 * private void enteraddressLine2(String addressLine2) {
		 * 
		 * this.addressLine2.clear(); this.addressLine2.sendKeys(addressLine2); }
		 * 
		 * private void enterCityName(String city) {
		 * 
		 * this.city.clear(); this.city.sendKeys(city); }
		 * 
		 * private void enterPostalCode(String postCode) {
		 * 
		 * this.postCode.clear(); this.postCode.sendKeys(postCode); }
		 * 
		 * 
		 * private void selectCountry() { Select select=new Select(countrySelect);
		 * select.selectByVisibleText("Canada"); }
		 * 
		 * private void selectZone() { Select select=new Select(zoneSelect);
		 * select.selectByVisibleText("Canada"); }
		 */
		
		
		
		@FindBy(css = "input[type='radio'][name='shipping_address'][value='existing']")

		WebElement existingAddressCheckbox;
		
		@FindBy(css = "div#payment-existing select.form-control[name='address_id']")

		WebElement existingAddressDropDown;
		
		@FindBy(css = "input#button-payment-address")

		WebElement BillingDetailsContinueBtn;
		
		@FindBy(css = "input#button-shipping-address")

		WebElement deliveryDetailsContinueBtn;
		
		
		
		@FindBy(css = "input#button-shipping-method")

		WebElement shippingContinueBtn;
		
		@FindBy(css = "input[type='checkbox']")

		WebElement termsAndConditionsCheckBox;
		
		@FindBy(css = "input#button-payment-method")

		WebElement codContinueBtn;
		
		@FindBy(css = "input#button-confirm")

		WebElement confirmOrderBtn;
		
		@FindBy(css = "div#content h1")

		WebElement orderConfirmationText;
		
		@FindBy(css = "div.pull-right>a")

		WebElement orderConfirmationContinueBtn;
		
		
		
		
		private void clickAddressCheckBox() {
			existingAddressCheckbox.click();
		}
		
		
		private void selectExistingAddress() { 
			Select select=new Select(existingAddressDropDown);
		 select.selectByValue("6115"); }
		
		private void clickBillingDetailscontinue() {
			BillingDetailsContinueBtn.click();
		}
		
		private void clickDeliveryDetailscontinue() {
			deliveryDetailsContinueBtn.click();
		}
		
		private void clickShippingContinue() {
			shippingContinueBtn.click();
		}
		
		private void clickTermsAndCondition() {
			termsAndConditionsCheckBox.click();
		}
		
		private void clickCodContinue() {
			codContinueBtn.click();
		}
		private void clickConfirmOrder() {
			confirmOrderBtn.click();
		}
		
		private void validateOrderText() {
			String confirmOrderText=orderConfirmationText.getText();
			Assert.assertEquals(confirmOrderText,
					"Your order has been placed!");
		}
		
		private void clickConfirmOrderContinueBtn() {
			orderConfirmationContinueBtn.click();
		}
		
		
		public MyAccountPage validateOrderPlacement() {
			clickAddressCheckBox();
			selectExistingAddress();
			clickBillingDetailscontinue();
			clickDeliveryDetailscontinue();
			clickShippingContinue();
			clickTermsAndCondition();
			clickCodContinue();
			clickConfirmOrder();
			validateOrderText();
			clickConfirmOrderContinueBtn();
			return new MyAccountPage();
		
		}
}

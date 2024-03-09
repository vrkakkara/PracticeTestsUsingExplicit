package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomation.TestBase.TestBase;

public class ShoppingCartPage extends TestBase{
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	  @FindBy(id = "input-country")
	  
	  WebElement chooseCountry;
	  
	  @FindBy(id = "input-zone")
	  
	  WebElement chooseZone;
	  
	  @FindBy(css = "input[type='text'][name='postcode']")
	  
	  WebElement postCode;
	 

@FindBy(css = "div.pull-right a.btn")

WebElement checkoutBtn;


private void selectCountry() {
	Select select=new Select(chooseCountry);
	select.selectByVisibleText("Canada");
}

private void selectZone() {
	Select select2=new Select(chooseZone);
	select2.selectByVisibleText("Ontario");
}

private void enterPostCode(String postCode) {
    this.postCode.click();
	this.postCode.sendKeys(postCode);
		}

private void clickCheckoutBtn() {
	checkoutBtn.click();
}

public CheckoutPage checkoutFlow(String postCode) {
	selectCountry();
	selectZone();
	enterPostCode(postCode);
	clickCheckoutBtn();
	return new CheckoutPage();
}


}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class WishlistPage extends TestBase{
	
	public WishlistPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div#content p")

	WebElement wishlistBanner;
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement wishlistContinueBtn;
	
	private void validateWishlistMessage() {
		String wishListText=wishlistBanner.getText();
		Assert.assertEquals(wishListText,
				"Your wish list is empty.");
	}
	
	private void clickWishlistContinue() {
		wishlistContinueBtn.click();
	}
	
	public void validateWishlistFlow() {
		validateWishlistMessage();
		clickWishlistContinue();
	}
	

}

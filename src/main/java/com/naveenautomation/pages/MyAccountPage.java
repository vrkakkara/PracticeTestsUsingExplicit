package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
	
public class MyAccountPage extends TestBase {
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Contact Us']")

	WebElement contactUsBtn;
	
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(2) a[href*='voucher']")

	WebElement giftCertificateBtn;
	
	
	
	@FindBy(css = "ul.nav>li:first-of-type>a")
	
	WebElement DesktopIcon;
	
	@FindBy(css = "ul.nav>li:first-of-type a.see-all")

	WebElement showAllDesktopIcon;
	
	@FindBy(css = "#content>div:nth-child(7)>div:nth-child(12)>div>div:nth-child(2)>div.button-group>button:nth-child(1)")

	WebElement addToCartBtn;
	
	@FindBy(css = "span#cart-total")

	WebElement cartBtn;
	
	@FindBy(css = "li>div>p.text-right>a[href*='checkout/cart']>strong")

	WebElement viewCartBtn;
	
	
	//newsletter
	@FindBy(css = "ul.list-unstyled>li:first-of-type>a[href*='newsletter']")

	WebElement newsLetterBtn;
	
	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement newsLetterSuccessBanner;
	
	
	//Downloads
	@FindBy(css = "div.list-group>a:nth-of-type(7)")

	WebElement downloadsBtn;
	
	
	
	//Rewards
	
	@FindBy(css = "div.list-group>a:nth-of-type(9)")

	WebElement rewardpointsBtn;
	
	
	//Change Password
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(2)>a[href*='password']")

	WebElement passwordChangeBtn;
	
	
	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement passwordChangeBanner;
	
	
	//Return requests
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(4)>a[href*='return']")

	WebElement returnRequestBtn;
	
	
	
	//Address Change
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(3)>a[href*='address']")

	WebElement addressChangeBtn;
	
	
	
	//Wishlist
	@FindBy(css = "aside#column-right>div>a:nth-of-type(5)")

	WebElement wishlistBtn;
	
	
	
	//Transactions
	@FindBy(css = "aside#column-right>div>a:nth-of-type(11)")

	WebElement transactionsBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//contactUs
	public ContactUsPage clickContactUsBtn() {
		contactUsBtn.click();
		return new ContactUsPage();
	}

	public GiftCertificatePage clickGiftCertificateBtn() {
		giftCertificateBtn.click();
		return new GiftCertificatePage();
	}
	
	
	
	//order placing
	private void clickDesktopIcon() {
		DesktopIcon.click();
	}
	
	private void clickShowAllDesktopIcon() {
		showAllDesktopIcon.click();
	}
	private void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	private void clickCartBtn() {
		cartBtn.click();
	}
	private void clickViewCartBtn() {
		viewCartBtn.click();
	}
	
	public ShoppingCartPage addToCartFlow() {
		clickDesktopIcon();
		clickShowAllDesktopIcon();
		clickAddToCartBtn();
		clickCartBtn();
		clickViewCartBtn();
		return new ShoppingCartPage();
	}
	
	
	
	//Newsletter
	public NewsLetterPage clicknewsLetterBtn() {
		newsLetterBtn.click();
		return new NewsLetterPage();
	}
	
	public void validateNewsLetterMessage() {
		String newsletterSuccessText=newsLetterSuccessBanner.getText();
		Assert.assertEquals(newsletterSuccessText,
				"Success: Your newsletter subscription has been successfully updated!");
	}
	
	//Downlaods
	
	public DownloadsPage clickDownloadsBtn() {
		downloadsBtn.click();
		return new DownloadsPage();
	}
	
	//Reward points
	
	public RewardPointsPage clickRewardPointsBtn() {
		rewardpointsBtn.click();
		return new RewardPointsPage();
	}
	
	
	//Change Password
	
		public PasswordChangePage clickPaswordChangeBtn() {
			passwordChangeBtn.click();
			return new PasswordChangePage();
		}
		
		public void validatePasswordChangeMessage() {
			String passwordChangeText=passwordChangeBanner.getText();
			Assert.assertEquals(passwordChangeText,
					"Success: Your password has been successfully updated.");
		}
		
	
		//Return request
		
		public ReturnRequestPage clickReturnRequest() {
			returnRequestBtn.click();
			return new ReturnRequestPage();
		}
		
		
		//Address chnage
		
		public AddressBookPage clickAddressChnageBtn() {
			addressChangeBtn.click();
			return new AddressBookPage();
		}
		
	//Wishlist
		
		public WishlistPage clickWishlistBtn() {
			wishlistBtn.click();
			return new WishlistPage();
		}
	
		
		//Transactions
		
				public TransactionsPage clickTransactionsBtn() {
					transactionsBtn.click();
					return new TransactionsPage();
				}
	
	
	
	
}
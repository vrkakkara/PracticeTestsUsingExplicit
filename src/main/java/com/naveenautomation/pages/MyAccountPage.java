package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;
	
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
	
	
	//Add to Wishlist
		@FindBy(css = "button[type='button'][onclick*='42'][data-original-title='Add to Wish List']")

		WebElement addToWishlistBtn;
		
		
		
		@FindBy(css = "a#wishlist-total span.hidden-xs.hidden-sm.hidden-md")

		WebElement WishlistBtnOnTop;
	
	
		
		@FindBy(css = "div.alert.alert-success.alert-dismissible")

		WebElement WishlistConfirmationText;
		
		
		//Order History
				@FindBy(css = "a.list-group-item:nth-of-type(6)")

				WebElement orderHistoryBtn;
				
				
				
		
	
	
	
	
	
	
	
	
	
	

	//contactUs
	public ContactUsPage clickContactUsBtn() {
		Utility.clickElement(contactUsBtn);
		return new ContactUsPage();
	}

	/*
	 * public GiftCertificatePage clickGiftCertificateBtn() {
	 * giftCertificateBtn.click(); return new GiftCertificatePage(); }
	 */
	
	
	//order placing
	private void clickDesktopIcon() {
		Utility.clickElement(DesktopIcon);
	}
	
	private void clickShowAllDesktopIcon() {
		Utility.clickElement(showAllDesktopIcon);
	}
	private void clickAddToCartBtn() {
		Utility.clickElement(addToCartBtn);
	}
	private void clickCartBtn() {
		Utility.clickElement(cartBtn);
	}
	private void clickViewCartBtn() {
		Utility.clickElement(viewCartBtn);
	}
	
	/*
	 * public ShoppingCartPage addToCartFlow() { clickDesktopIcon();
	 * clickShowAllDesktopIcon(); clickAddToCartBtn(); clickCartBtn();
	 * clickViewCartBtn(); return new ShoppingCartPage(); }
	 */
	
	
	
	/*
	 * //Newsletter public NewsLetterPage clicknewsLetterBtn() {
	 * newsLetterBtn.click(); return new NewsLetterPage(); }
	 */
	
	
	
	
	
	/*
	 * public void validateNewsLetterMessage() { String
	 * newsletterSuccessText=newsLetterSuccessBanner.getText();
	 * Assert.assertEquals(newsletterSuccessText,
	 * "Success: Your newsletter subscription has been successfully updated!"); }
	 */
	
	//Downlaods
	
	public DownloadsPage clickDownloadsBtn() {
		Utility.clickElement(downloadsBtn);
		return new DownloadsPage();
	}
	
	//Reward points
	
	/*
	 * public RewardPointsPage clickRewardPointsBtn() { rewardpointsBtn.click();
	 * return new RewardPointsPage(); }
	 */
	
	//Change Password
	
	/*
	 * public PasswordChangePage clickPaswordChangeBtn() {
	 * passwordChangeBtn.click(); return new PasswordChangePage(); }
	 */
		
		public void validatePasswordChangeMessage() {
			String passwordChangeText=Utility.getTextOfElement(passwordChangeBanner);
			Assert.assertEquals(passwordChangeText,
					"Success: Your password has been successfully updated.");
		}
		
	
		//Return request
		
		/*
		 * public ReturnRequestPage clickReturnRequest() { returnRequestBtn.click();
		 * return new ReturnRequestPage(); }
		 */
		
		//Address chnage
		
		public AddressBookPage clickAddressChnageBtn() {
			Utility.clickElement(addressChangeBtn);
			return new AddressBookPage();
		}
		
	//Wishlist
		
	/*
	 * public WishlistPage clickWishlistBtn() { wishlistBtn.click(); return new
	 * WishlistPage(); }
	 */
		
		//Transactions
		
		/*
		 * public TransactionsPage clickTransactionsBtn() { transactionsBtn.click();
		 * return new TransactionsPage(); }
		 */
	
				
//Add to Wishlist
				
				/*
				 * private void clickDesktopIcon() { DesktopIcon.click(); }
				 * 
				 * private void clickShowAllDesktopIcon() { showAllDesktopIcon.click(); }
				 */
	
				/*
				 * private void clickAddWishlistBtn() { addToWishlistBtn.click(); }
				 * 
				 * private void clickWishlistIcon() { WishlistBtnOnTop.click(); } private void
				 * validateWishlistBanner() { String
				 * wishListBAnner=WishlistConfirmationText.getText(); String []
				 * splitSentence=new String[2]; splitSentence=wishListBAnner.split("added");
				 * String wishlistBanner2=splitSentence[2]; String [] itemInWishlist=new
				 * String[2]; itemInWishlist=wishlistBanner2.split("to");
				 * System.out.println("The item added in the wishlist is: "+itemInWishlist[0]);
				 * //Assert.assertEquals(itemInWishlist[0],"Apple Cinema 30" "); } public void
				 * addToWishlistFlow() { clickDesktopIcon(); clickShowAllDesktopIcon();
				 * clickAddWishlistBtn(); clickWishlistIcon(); validateWishlistBanner(); }
				 */
				
				
				
				/*
				 * public OrderHistoryPage clickOrderHistoryBtn() { orderHistoryBtn.click();
				 * return new OrderHistoryPage(); }
				 */
}
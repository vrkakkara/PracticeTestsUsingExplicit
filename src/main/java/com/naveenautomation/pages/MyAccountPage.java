package com.naveenautomation.pages;

import java.util.List;

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

	// newsletter
	@FindBy(css = "ul.list-unstyled>li:first-of-type>a[href*='newsletter']")

	WebElement newsLetterBtn;

	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement newsLetterSuccessBanner;

	// Downloads
	@FindBy(css = "div.list-group>a:nth-of-type(7)")

	WebElement downloadsBtn;

	// Rewards

	@FindBy(css = "div.list-group>a:nth-of-type(9)")

	WebElement rewardpointsBtn;

	// Change Password
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(2)>a[href*='password']")

	WebElement passwordChangeBtn;

	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement passwordChangeBanner;

	// Return requests
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(4)>a[href*='return']")

	WebElement returnRequestBtn;

	// Address Change
	@FindBy(css = "ul.list-unstyled>li:nth-of-type(3)>a[href*='address']")

	WebElement addressChangeBtn;

	// Wishlist
	@FindBy(css = "aside#column-right>div>a:nth-of-type(5)")

	WebElement wishlistBtn;

	// Transactions
	@FindBy(css = "aside#column-right>div>a:nth-of-type(11)")

	WebElement transactionsBtn;

	// Add to Wishlist
	@FindBy(css = "button[type='button'][onclick*='42'][data-original-title='Add to Wish List']")

	WebElement addToWishlistBtn;

	@FindBy(css = "a#wishlist-total span.hidden-xs.hidden-sm.hidden-md")

	WebElement WishlistBtnOnTop;

	@FindBy(css = "div.alert.alert-success.alert-dismissible")

	WebElement WishlistConfirmationText;

	// Order History
	@FindBy(css = "a.list-group-item:nth-of-type(6)")

	WebElement orderHistoryBtn;
	
	//my account left side buttons
	
	@FindBy(xpath = "//aside[@id='column-right']/div/a")

	List<WebElement> sideButtons;
	
	// Account details banner
		@FindBy(css = "div.alert.alert-success.alert-dismissible")

		WebElement accountDetailsSuccessBanner;
	
		
		//Left footer buttons
		
		@FindBy(css = "footer>div.container>div.row>div:nth-of-type(1)>ul>li")

		List<WebElement> leftFooterBtns;	
		
		//Left Second footer buttons
		
		@FindBy(css = "footer>div.container>div.row>div:nth-of-type(2)>ul>li")

		List<WebElement> leftSecondFooterBtns;
		
		//Left Third footer buttons
		@FindBy(css = "footer>div.container>div.row>div:nth-of-type(3)>ul>li")

		List<WebElement> leftThirdFooterBtns;
		
		
		//ContactNumber
		@FindBy(css = "ul.list-inline>li:first-of-type>span")

		WebElement contactNumber;
		
		//Components
		@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(3)>a")

		WebElement componentsBtn;
		
		//Monitpor
		@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(3) li:nth-of-type(2)")

		WebElement monitorBtn;
		
		
		//Search bar
				@FindBy(css = "div#search>input")

				WebElement searchBar;
				
				//Search click
				@FindBy(css = "div#search i.fa.fa-search")

				WebElement searchClickBtn;
		
				//My account
				@FindBy(css = "li.dropdown span.hidden-xs.hidden-sm.hidden-md")

				WebElement myAccountBtn;
				
				//My account
				@FindBy(css = "ul.dropdown-menu.dropdown-menu-right>li:nth-of-type(2)")

				WebElement orderHistoryButn;
		
		
		
		
	
	
	
	
	
	// contactUs
	public ContactUsPage clickContactUsBtn() {
		Utility.clickElement(contactUsBtn);
		return new ContactUsPage();
	}

	public GiftCertificatePage clickGiftCertificateBtn() {
		giftCertificateBtn.click();
		return new GiftCertificatePage();
	}

	// order placing
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

	public ShoppingCartPage addToCartFlow() {
		clickDesktopIcon();
		clickShowAllDesktopIcon();
		clickAddToCartBtn();
		clickCartBtn();
		clickViewCartBtn();
		return new ShoppingCartPage();
	}

	// Newsletter
	public NewsLetterPage clicknewsLetterBtn() {
		newsLetterBtn.click();
		return new NewsLetterPage();
	}

	public void validateNewsLetterMessage() {
		String newsletterSuccessText = newsLetterSuccessBanner.getText();
		Assert.assertEquals(newsletterSuccessText,
				"Success: Your newsletter subscription has been successfully updated!");
	}

	// Downlaods

	public DownloadsPage clickDownloadsBtn() {
		Utility.clickElement(downloadsBtn);
		return new DownloadsPage();
	}

	// Reward points

	public RewardPointsPage clickRewardPointsBtn() {
		rewardpointsBtn.click();
		return new RewardPointsPage();
	}

	// Change Password

	public PasswordChangePage clickPaswordChangeBtn() {
		passwordChangeBtn.click();
		return new PasswordChangePage();
	}

	public void validatePasswordChangeMessage() {
		String passwordChangeText = Utility.getTextOfElement(passwordChangeBanner);
		Assert.assertEquals(passwordChangeText, "Success: Your password has been successfully updated.");
	}

	// Return request

	public ReturnRequestPage clickReturnRequest() {
		returnRequestBtn.click();
		return new ReturnRequestPage();
	}

	// Address chnage

	public AddressBookPage clickAddressChnageBtn() {
		Utility.clickElement(addressChangeBtn);
		return new AddressBookPage();
	}

	// Wishlist

	public WishlistPage clickWishlistBtn() {
		wishlistBtn.click();
		return new WishlistPage();
	}

	// Transactions

	public TransactionsPage clickTransactionsBtn() {
		transactionsBtn.click();
		return new TransactionsPage();
	}

//Add to Wishlist

	// private void clickDesktopIcon() { DesktopIcon.click(); }

	// private void clickShowAllDesktopIcon() { showAllDesktopIcon.click(); }

	private void clickAddWishlistBtn() {
		addToWishlistBtn.click();
	}

	private void clickWishlistIcon() {
		WishlistBtnOnTop.click();
	}

	private void validateWishlistBanner() {
		String wishListBAnner = WishlistConfirmationText.getText();
		String[] splitSentence = new String[2];
		splitSentence = wishListBAnner.split("added");
		String wishlistBanner2 = splitSentence[2];
		String[] itemInWishlist = new String[2];
		itemInWishlist = wishlistBanner2.split("to");
		System.out.println("The item added in the wishlist is: " + itemInWishlist[0]);
	}

	public void addToWishlistFlow() {
		clickDesktopIcon();
		clickShowAllDesktopIcon();
		clickAddWishlistBtn();
		clickWishlistIcon();
		validateWishlistBanner();
	}

	public OrderHistoryPage clickOrderHistoryBtn() {
		orderHistoryBtn.click();
		return new OrderHistoryPage();
	}
	
	//click any button on right side bar
	private void clickAnyBtn(String buttonName) {
		for(WebElement desiredButton:sideButtons) {
			String desiredBtnName=desiredButton.getText();
			if(desiredBtnName.equalsIgnoreCase(buttonName)){
				Utility.clickElement(desiredButton);
				break;
							}
			
		}
			}
	
	//Logout
	public LogoutPage clickLogoutBtn() {
		clickAnyBtn("Logout");
		return new LogoutPage();
	}
	
	//RecurringPaymenmts
		public RecurringPaymentPage clickRecurringPayentBtn() {
			clickAnyBtn("Recurring payments");
			return new RecurringPaymentPage();
		}

		//EditAccountDetails
		public EditAccountPage clickEditAccountBtn() {
			clickAnyBtn("Edit Account");
			return new EditAccountPage();
		}
		
		public void validateEditAccount() {
			String editAccountBanner = Utility.getTextOfElement(accountDetailsSuccessBanner);
			Assert.assertEquals(editAccountBanner, "Success: Your account has been successfully updated.");
		}
		
		//click any button left footer
		private void clickAnyBtnOnFooter(String buttonName, List<WebElement> elementsList ) {
			for(WebElement desiredButton:elementsList) {
				String desiredBtnName=desiredButton.getText();
				if(desiredBtnName.equalsIgnoreCase(buttonName)){
					Utility.clickElement(desiredButton);
					break;
								}
				
			}
				}
		
		//About us
		public AboutUsPage clickAboutus() {
			clickAnyBtnOnFooter("About Us", leftFooterBtns);
			return new AboutUsPage();
		}
		
		//Delivery Information
		public DeliveryInformationPage clickDeliveryInfo() {
			clickAnyBtnOnFooter("Delivery Information", leftFooterBtns);
			return new DeliveryInformationPage();
		}
		
		//Privacy Policy
		public PrivacyPolicyPage clickPrivacyPolicy() {
			clickAnyBtnOnFooter("Privacy Policy", leftFooterBtns);
			return new PrivacyPolicyPage();
		}
		
		
		//Terms & Conditions
				public TermsConditionsPage clickTermsConditions() {
					clickAnyBtnOnFooter("Terms & Conditions", leftFooterBtns);
					return new TermsConditionsPage();
				}
				
				//About us
				public SiteMapsPage clickSiteMap() {
					clickAnyBtnOnFooter("Site Map", leftSecondFooterBtns);
					return new SiteMapsPage();
				}
				
				//Brands
				public BrandsPage clickBrands() {
					clickAnyBtnOnFooter("Brands", leftThirdFooterBtns);
					return new BrandsPage();
				}
				
				//Specials
				public SpecialsPage clickSpecials() {
					clickAnyBtnOnFooter("Specials", leftThirdFooterBtns);
					return new SpecialsPage();
				}
				
				//Specials
				public AffliatePage clickAffliate() {
					clickAnyBtnOnFooter("Affliate", leftThirdFooterBtns);
					return new AffliatePage();
				}
				
				
				public void verifyContactNumber() {

					String contactNumberText = Utility.getTextOfElement(contactNumber);
					Assert.assertEquals(contactNumberText, "123456789");
								
				}
				
				private void clickComponentsBtn() {
					Utility.clickElement(componentsBtn);
					
				}
				private void clickMonitorBtn() {
					Utility.clickElement(monitorBtn);
					
				}
				
		public MonitorsPage clickMonitorFlow() {
		clickComponentsBtn();
		clickMonitorBtn();
		return new MonitorsPage();
		}
		
//Searching Apple
		private void enterSearchApple() {
			Utility.clickElement(searchBar);
			Utility.enterText(searchBar, "Apple");
		}
		
		private void clickSearchBtn() {
			Utility.clickElement(searchClickBtn);
					}
		
		public SearchPageClass clickSearchBtnAppleFlow() {
			enterSearchApple();
			clickSearchBtn();
			return new SearchPageClass();
		}
		
		
		private void enterSearchHTC() {
			Utility.clickElement(searchBar);
			Utility.enterText(searchBar, "HTC");
		}
		
		public SearchPageClass clickSearchBtnHTCFlow() {
			enterSearchHTC();
			clickSearchBtn();
			return new SearchPageClass();
		}
		
		private void enterSearchCanon() {
			Utility.clickElement(searchBar);
			Utility.enterText(searchBar, "Canon");
		}
		
		public SearchPageClass clickSearchBtnCanonFlow() {
			enterSearchCanon();
			clickSearchBtn();
			return new SearchPageClass();
		}
		
		

}
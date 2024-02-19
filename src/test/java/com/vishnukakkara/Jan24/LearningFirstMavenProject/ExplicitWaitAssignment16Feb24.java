package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitAssignment16Feb24 {
	WebDriver driver = null;
	WebDriverWait wait = null;
	Actions action = null;
	
	@Test
	public void signupLoggingin() {
		signUp();
		loggingIn();
				
	}
	@Test
	public void loginAndContactUs(){
		loggingIn();
		contactUs();
		validateContactUs();
	}
	
	
	@Test
	public void loginAndGiftCertificates(){
		loggingIn();
		issueGiftCertificates();
		validateGiftCertificate();
	}
	
	
	@BeforeMethod
	public void gerPageUrl() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);
		

	}
	
	public void signUp() {
		WebElement myAccountDropDown = driver.findElement(By.cssSelector(
				"ul.list-unstyled>li:first-of-type>a[href*='account']"));
		myAccountDropDown.click();
		WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(By
				.cssSelector("aside#column-right>div>a:nth-of-type(2)")));
		registerBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.cssSelector("input#input-firstname"))).sendKeys("Vish");
		driver.findElement(By
				.cssSelector("input#input-lastname")).sendKeys("Raj");
		WebElement email=driver.findElement(By
				.cssSelector("input#input-email"));
		email.clear();
		email.sendKeys("vrk@yahoo.com");
		driver.findElement(By
				.cssSelector("input#input-telephone")).sendKeys("6479131386");
		WebElement password=driver.findElement(By
				.cssSelector("input#input-password"));
		password.clear();
		password.sendKeys("Password@1");
		driver.findElement(By
				.cssSelector("input#input-confirm")).sendKeys("Password@1");
		WebElement subscribeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("label.radio-inline>input[name='newsletter'][checked='checked']")));
		subscribeBtn.click();
		
		WebElement termsAndConditions = wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.cssSelector("input[type='checkbox']")));
		termsAndConditions.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By
						.cssSelector("input[type='submit']"))).submit();
		WebElement loginPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("div#content>p>a")));
		loginPage.click();
		//wait.until(ExpectedConditions.elementToBeClickable(By
				//.cssSelector("div.buttons>div.pull-right>a"))).click();
		
	}
	
	
	
	
	public void loggingIn() {
		WebElement myAccountDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"a.dropdown-toggle[title='My Account']")));
		myAccountDropDown.click();
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("ul.dropdown-menu.dropdown-menu-right li:nth-of-type(2)>a")));
		loginBtn.click();
		WebElement inputEmail = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#input-email")));
		inputEmail.sendKeys("vrk@yahoo.com");
		WebElement inputPassword = driver.findElement(By.cssSelector("input#input-password"));
		inputPassword.sendKeys("Password@1");
		WebElement submitBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		submitBtn.submit();
		
	}
	
	
	public void contactUs() {
		WebElement contactUsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contact Us']")));
		contactUsBtn.click();
		WebElement yourName = driver.findElement(By.cssSelector("input[name='name']"));
		WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement enquiry = driver.findElement(By.cssSelector("textarea[name='enquiry']"));
		yourName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		emailAddress.clear();
		emailAddress.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		enquiry.sendKeys(RandomStringUtils.randomAlphabetic(30));
		WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Submit']")));		
		submitBtn.submit();
	}
	
	public void validateContactUs() {
		WebElement contactUsConfirmation=wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div#content p")));
		
		String addToCartText=contactUsConfirmation.getText();
		System.out.println(addToCartText);
		Assert.assertEquals(addToCartText, "Your enquiry has been successfully sent to the store owner!");
		
	}
	public void issueGiftCertificates() {

		WebElement giftCertificateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ul.list-unstyled>li:nth-of-type(2) a[href*='voucher']")));
		giftCertificateBtn.click();
		WebElement recipientName = driver.findElement(By.cssSelector("input[name='to_name']"));
		WebElement recipientEmail = driver.findElement(By.cssSelector("input[name='to_email']"));
		WebElement yourName = driver.findElement(By.cssSelector("input[name='from_name']"));
		WebElement yourEmail = driver.findElement(By.cssSelector("input[name='from_email']"));
		WebElement giftCertificateTheme = driver.findElement(By.cssSelector("input[name='voucher_theme_id'][value='6']"));
		WebElement message = driver.findElement(By.cssSelector("textarea[name='message'][id='input-message']"));
		WebElement amount = driver.findElement(By.cssSelector("input[name='amount'][id='input-amount']"));
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		WebElement continueBtn = driver.findElement(By.cssSelector("input[type='submit'][value='Continue"));

		
		recipientName.sendKeys(RandomStringUtils.randomAlphabetic(10));
		recipientEmail.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		yourName.clear();
		yourName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		yourEmail.clear();
		yourEmail.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		giftCertificateTheme.click();
		message.sendKeys(RandomStringUtils.randomAlphabetic(10));
		amount.sendKeys(RandomStringUtils.randomNumeric(2));
		checkBox.click();
		continueBtn.submit();

	}
	
	public void validateGiftCertificate() {
		WebElement giftCertificateConfirmation=wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div#content>p")));
		
		String giftCertificateText=giftCertificateConfirmation.getText();
		//System.out.println(addToCartText);
		Assert.assertEquals(giftCertificateText, "Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.");
		
	}
	

}


package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class AssignmentFeb01 {
	WebDriver driver = null;

	@BeforeMethod
	public void getPageUrl() {
		System.setProperty("webdriver.edge.driver", "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");

		driver = new EdgeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}

	@Test

	public void ToAccessContactus() {
		WebElement contactUsBtn = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		contactUsBtn.click();
		WebElement yourName = driver.findElement(By.cssSelector("input[name='name']"));
		WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement enquiry = driver.findElement(By.cssSelector("textarea[name='enquiry']"));
		yourName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		emailAddress.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		enquiry.sendKeys(RandomStringUtils.randomAlphabetic(30));
		WebElement submitBtn = driver.findElement(By.cssSelector("input[value='Submit']"));		
		submitBtn.submit();

	}

	@Test

	public void performReturns() {
		WebElement returnsBtn = driver.findElement(By.cssSelector("a[ href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']"));
		returnsBtn.click();
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement telephone = driver.findElement(By.cssSelector("input[name='telephone']"));
		WebElement orderId = driver.findElement(By.cssSelector("input[name='order_id']"));
		WebElement orderDate = driver.findElement(By.cssSelector("input[name='date_ordered']"));
		WebElement productName = driver.findElement(By.cssSelector("input[name='product']"));
		WebElement productCode = driver.findElement(By.cssSelector("input[name='model']"));
		WebElement quantity = driver.findElement(By.cssSelector("input[name='quantity']"));
		WebElement reasonForReturn = driver.findElement(By.cssSelector("input[name='return_reason_id'][value='3']"));
		WebElement productIsOpen = driver.findElement(By.cssSelector("input[type='radio'][name='opened'][value='1']"));
		WebElement faultyOrNo = driver
				.findElement(By.cssSelector("textarea[name='comment'][placeholder='Faulty or other details']"));
		WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));

		
		firstName.sendKeys(RandomStringUtils.randomAlphabetic(10));
		lastName.sendKeys(RandomStringUtils.randomAlphabetic(5));
		emailAddress.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		telephone.sendKeys(RandomStringUtils.randomNumeric(10));
		orderId.sendKeys(RandomStringUtils.randomNumeric(5));
		orderDate.sendKeys("2024-02-01");
		productName.sendKeys(RandomStringUtils.randomAlphabetic(7));
		productCode.sendKeys(RandomStringUtils.randomNumeric(5));
		quantity.sendKeys(RandomStringUtils.randomNumeric(1));
		reasonForReturn.click();
		productIsOpen.click();
		faultyOrNo.sendKeys(RandomStringUtils.randomAlphabetic(25));
		submitBtn.submit();

	}

	@Test
	public void issueGiftCertificates() {

		WebElement giftCertificateBtn = driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']"));
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
		yourName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		yourEmail.sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		giftCertificateTheme.click();
		message.sendKeys(RandomStringUtils.randomAlphabetic(10));
		amount.sendKeys(RandomStringUtils.randomNumeric(2));
		checkBox.click();
		continueBtn.submit();

	}
}

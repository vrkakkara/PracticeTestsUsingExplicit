package com.vishnukakkara.Jan24.LearningFirstMavenProject;
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

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}

	@Test

	public void contactus() {
		WebElement contactUsBtn = driver.findElement(	By.xpath("body > footer > div > div > div:nth-child(2) > ul > li:nth-child(1) > a"));
		WebElement yourName = driver.findElement(By.cssSelector("input[name='name']"));
		WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement enquiry = driver.findElement(By.cssSelector("textarea[name='enquiry']"));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=information/contact");
		//contactUsBtn.click();
		yourName.sendKeys("Vishnu");
		emailAddress.sendKeys("vsn@gmail.com");
		enquiry.sendKeys("Please pr0vide the comapany telephone number to contact and resolve a issue on product delivery");
				

	}
	
	
	@Test
	
	public void Returns() {
		WebElement returnsBtn = driver.findElement(By.cssSelector("a[ href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']"));
			

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
		WebElement faultyOrNo = driver.findElement(By.cssSelector("textarea[name='comment'][placeholder='Faulty or other details']"));
		WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));		
		
		
		returnsBtn.click();
		firstName.sendKeys("Vishnu");
		lastName.sendKeys("Kakkara");
		emailAddress.sendKeys("vsn@gmail.com");
		telephone.sendKeys("6479131386");
		orderId.sendKeys("123456789");
		orderDate.sendKeys("2024-02-01");
		productName.sendKeys("iphone 15pro");
		productCode.sendKeys("098765");
		quantity.sendKeys("1");
		reasonForReturn.click();
		productIsOpen.click();
		faultyOrNo.sendKeys("Not faulty");
		sleep();
		submitBtn.submit();
						

	}
	@org.testng.annotations.Test
	public void giftCertificates() {
		
				WebElement giftCertificateBtn = driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/voucher']"));	
				
				WebElement recipientName = driver.findElement(By.cssSelector("input[name='to_name']"));		
				WebElement recipientEmail = driver.findElement(By.cssSelector("input[name='to_email']"));	
				WebElement yourName = driver.findElement(By.cssSelector("input[name='from_name']"));	
				WebElement yourEmail = driver.findElement(By.cssSelector("input[name='from_email']"));	
				WebElement giftCertificateTheme = driver.findElement(By.cssSelector("input[name='voucher_theme_id'][value='6']"));	
				WebElement message = driver.findElement(By.cssSelector("textarea[name='message'][id='input-message']"));	
				WebElement amount = driver.findElement(By.cssSelector("input[name='amount'][id='input-amount']"));	
				WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));	
				WebElement continueBtn = driver.findElement(By.cssSelector("input[type='submit'][value='Continue"));	
				
				
				giftCertificateBtn.click();
				recipientName.sendKeys("John Cena");
				recipientEmail.sendKeys("jcena@gmail.com");
				yourName.sendKeys("Vishnu");
				yourEmail.sendKeys("vsn@gmail.com");
				giftCertificateTheme.click();
				message.sendKeys("Merry Christmas");
				amount.sendKeys("50");
				checkBox.click();
				sleep();
				continueBtn.submit();
				
			
		
		
	}
	public void sleep() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

//test comment
}

package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import java.util.concurrent.TimeUnit;

import javax.crypto.Mac;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class Assignment08Feb24 {
	WebDriver driver=null;
	@BeforeMethod
	public void gerPageUrl() {
		System.setProperty("webdriver.edge.driver", "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}
	@Test
	public void purchaseLaptop() {
		loggingIn();
		addingToCart();
		addingAddress();
		inputBillingDetails();
		inputDeliveryDetails();
		inputDeliveryMEthodAndPayment();
		validation();
		
	}
	
	public void loggingIn() {
		WebElement myAccountDropDown = driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'][class='dropdown-toggle']"));
		myAccountDropDown.click();
		WebElement loginBtn = driver.findElement(By.cssSelector("	a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']"));
		loginBtn.click();
		WebElement inputEmail = driver.findElement(By.cssSelector("input#input-email"));
		inputEmail.sendKeys("vk@gmail.com");
		WebElement inputPassword = driver.findElement(By.cssSelector("input#input-password"));
		inputPassword.sendKeys("Password");
		WebElement submitBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		submitBtn.submit();
	}
	
	
	public void addingToCart() {
		WebElement DesktopIcon= driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'][class='dropdown-toggle']"));
		DesktopIcon.click();
		WebElement showAllDesktops= driver.findElement(By.xpath("//a[@class='see-all'][@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20']"));
		showAllDesktops.click();
		WebElement addToCart= driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[12]/div/div[2]/div[2]/button[1]"));
		addToCart.click();
	}
	
	
	public void addingAddress() {
		WebElement shoppingCart= driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
		sleep();
		shoppingCart.click();
		
		WebElement viewCartBtn= driver.findElement(By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart']/strong"));
        viewCartBtn.click();
        sleep();
        			
		WebElement estimateShipping=driver.findElement(By.cssSelector("a[class='accordion-toggle'][href='#collapse-shipping']"));
				estimateShipping.click();
		WebElement chooseCountry= driver.findElement(By.cssSelector("select[class='form-control'][id='input-country']"));
		chooseCountry.click();
		sleep();
		selectionByText(chooseCountry, "Canada");
		sleep();
		WebElement chooseZone= driver.findElement(By.cssSelector("select[class='form-control'][id='input-zone']"));
		chooseZone.click();
		sleep();
		selectionByText(chooseZone, "Ontario");
		sleep();
		WebElement postCode = driver.findElement(By.cssSelector("input[class='form-control'][id='input-postcode']"));
		postCode.sendKeys(RandomStringUtils.randomAlphanumeric(6));
		WebElement checkoutBtn = driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/checkout'][class='btn btn-primary']"));
		checkoutBtn.click();
	}
	
	
	
	public void inputBillingDetails() {
		WebElement newAddressConfirmation = driver.findElement(By.cssSelector("input[type='radio'][name='payment_address'][value='new']"));
		newAddressConfirmation.click();
		WebElement firstName = driver.findElement(By.cssSelector("input[type='text'][name='firstname']"));
		firstName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement lastName = driver.findElement(By.cssSelector("input[type='text'][name='lastname']"));
		lastName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement companyName = driver.findElement(By.cssSelector("input[type='text'][name='company']"));
		companyName.sendKeys(RandomStringUtils.randomAlphabetic(5));
		WebElement address1 = driver.findElement(By.cssSelector("input[type='text'][name='address_1']"));
		address1.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement address2 = driver.findElement(By.cssSelector("input[type='text'][name='address_2']"));
		address2.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement city = driver.findElement(By.cssSelector("input[type='text'][name='city']"));
		city.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement areaCode = driver.findElement(By.cssSelector("input[type='text'][name='postcode']"));
		areaCode.sendKeys(RandomStringUtils.randomAlphanumeric(6));
		WebElement country1 = driver.findElement(By.cssSelector("select[id='input-payment-country'][name='country_id']"));
		country1.click();
		sleep();
		selectionByText(country1, "Canada");
		sleep();
		WebElement zone = driver.findElement(By.cssSelector("select[id='input-payment-zone'][name='zone_id']"));
		zone.click();
		sleep();
		selectionByText(zone, "Ontario");
		sleep();
		WebElement continueBtn = driver.findElement(By.cssSelector("input[type='button'][value='Continue']"));
		continueBtn.click();
	}
		
		
	
	
	public void inputDeliveryDetails() {
	WebElement newAddress = driver.findElement(By.cssSelector("input[type='radio'][value='new'][name='shipping_address']"));
		sleep();
		newAddress .click();
		WebElement firstName1 = driver.findElement(By.cssSelector("input[type='text'][id='input-shipping-firstname']"));
		firstName1.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement lastName1 = driver.findElement(By.cssSelector("input[type='text'][id='input-shipping-lastname']"));
		lastName1.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement address01 = driver.findElement(By.cssSelector("input[type='text'][id='input-shipping-address-1']"));
		address01.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement city01 = driver.findElement(By.cssSelector("input[type='text'][id='input-shipping-city']"));
		city01.sendKeys(RandomStringUtils.randomAlphabetic(6));
		WebElement shippingCountry = driver.findElement(By.cssSelector("select[name='country_id'][id='input-shipping-country']"));
		sleep();
		shippingCountry.click();
		
		selectionByText(shippingCountry, "Canada");
		WebElement shippingZone = driver.findElement(By.cssSelector("select[name='zone_id'][id='input-shipping-zone']"));
		shippingZone.click();
		sleep();
		selectionByText(shippingZone, "Ontario");
			
		WebElement continueBtn2 = driver.findElement(By.cssSelector("input[type='button'][value='Continue'][id='button-shipping-address']"));
		continueBtn2.click();
	}
	
	
	
	
	
	public void inputDeliveryMEthodAndPayment() {
		WebElement flatShipping = driver.findElement(By.cssSelector("input[type='radio'][name='shipping_method'][value='flat.flat']"));
		flatShipping.click();
		sleep();
		WebElement continueBtn3 = driver.findElement(By.cssSelector("input[type='button'][value='Continue'][id='button-payment-address']"));
		sleep();
		continueBtn3.click();
		
		WebElement cod = driver.findElement(By.cssSelector("input[type='radio'][name='payment_method'][value='cod']"));
		sleep();
		cod.click();
		WebElement termsAndCondition = driver.findElement(By.cssSelector("input[name='agree'][type='checkbox']"));
		termsAndCondition.click();
		WebElement continue4 = driver.findElement(By.cssSelector("input[type='button'][value='Continue'][id='button-payment-address']"));
		continue4.click();
	
		WebElement confirmOrder = driver.findElement(By.cssSelector("input[id='button-confirm']"));
		confirmOrder.click();
		
	}
	
	
	
	
	public void validation() {
		WebElement orderPlacedConfirmation=driver.findElement(By.cssSelector("h1"));
		String confirmation=orderPlacedConfirmation.getText();
		
		Assert.assertEquals(confirmation, "Your order has been placed!");
			}
	
	
	
	
	
	public void selectionByText(WebElement element,String fieldToSelect) {
		Select select=new Select(element);
		select.selectByVisibleText(fieldToSelect);
	}
	
	
	
	public void selectionByValue(WebElement element,String fieldToSelect) {
		Select select=new Select(element);
		select.selectByValue(fieldToSelect);
		
		}
	
	
	
	public void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
			
}

package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import java.util.concurrent.TimeUnit;

import javax.crypto.Mac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class Assignment08Feb24 {
	WebDriver driver=null;
	@BeforeMethod
	public void gerPageUrl() {
		System.setProperty("webdriver.edge.driver", "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}
	@Test
	public void performLogin() {
		
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
		WebElement DesktopIcon= driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'][class='dropdown-toggle']"));
		DesktopIcon.click();
		WebElement showAllDesktops= driver.findElement(By.xpath("//a[@class='see-all'][@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20']"));
		showAllDesktops.click();
		WebElement addToCart= driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[12]/div/div[2]/div[2]/button[1]"));
		addToCart.click();
		WebElement cartBtn= driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
		cartBtn.click();
		WebElement viewCart= driver.findElement(By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart']/strong"));
		viewCart.click();
		WebElement chooseCountry= driver.findElement(By.id("input-country"));
		Select select=new Select(chooseCountry);
		select.selectByVisibleText("Canada");
		WebElement chooseZone= driver.findElement(By.id("input-zone"));
		Select select2=new Select(chooseZone);
		select2.selectByVisibleText("Ontario");
		WebElement postCode = driver.findElement(By.cssSelector("input[type='text'][name='postcode']"));
		postCode.sendKeys("M3A1Y1");
		WebElement checkoutBtn = driver.findElement(By.cssSelector("a[href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/checkout'][class='btn btn-primary']"));
		checkoutBtn.submit();
		
		
			}
			/*
			 * @Test public void addToCart() { WebElement DesktopIcon=
			 * driver.findElement(By.cssSelector(
			 * "a[href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'][class='dropdown-toggle']"
			 * )); DesktopIcon.click(); WebElement showAllDesktops=
			 * driver.findElement(By.xpath(
			 * "//a[@class='see-all'][@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20']"
			 * )); showAllDesktops.click(); WebElement addToCart=
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"content\"]/div[4]/div[12]/div/div[2]/div[2]/button[1]"));
			 * addToCart.click(); WebElement checkOut=
			 * driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a/span"));
			 * checkOut.click();
			 * 
			 * 
			 * }
			 */
}

package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wishlist {
	WebDriver driver = null;
	WebDriverWait wait = null;
	Actions action = null;

	@BeforeMethod
	public void gerPageUrl() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.edge.driver", "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);
		
		
	}
	@Test
	public void addingProductToWishlistAndCart() {
		
		loggingIn();
		addingToWishlist();
		addingToCart();
		validate();
	}
	public void loggingIn() {
		WebElement myAccountDropDown = driver.findElement(By.cssSelector(
				"a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/account'][class='dropdown-toggle']"));
		myAccountDropDown.click();
		WebElement loginBtn = driver.findElement(By
				.cssSelector("	a[href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']"));
		loginBtn.click();
		WebElement inputEmail = driver.findElement(By.cssSelector("input#input-email"));
		inputEmail.sendKeys("vk@gmail.com");
		WebElement inputPassword = driver.findElement(By.cssSelector("input#input-password"));
		inputPassword.sendKeys("Password");
		WebElement submitBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		submitBtn.submit();
	}
	
	public void addingToWishlist() {
		driver.findElement(By.cssSelector("ul.nav li:nth-of-type(6) a")).click();
		WebElement addToWishlistBtn=wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div.button-group button:nth-of-type(2)[onclick*='40']")));
		addToWishlistBtn.click();
		
	}
	
	
	public void addingToCart() {
		WebElement wishListBtn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.col-sm-3 ul.list-unstyled li:nth-of-type(3) a[href*='wishlist']")));
		wishListBtn.click();
		WebElement addToCart=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-toggle='tooltip']")));
		addToCart.click();
		
	}
	public void validate() {
		WebElement addToCartConfirmation=wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div.alert.alert-success")));
		//WebElement addToCartConfirmation=driver.findElement(By.cssSelector("div.alert.alert-success"));
		String addToCartText=addToCartConfirmation.getText();
		System.out.println(addToCartText);
		Assert.assertEquals(addToCartText, "Success: You have added iPhone to your shopping cart!");
	}
	

}

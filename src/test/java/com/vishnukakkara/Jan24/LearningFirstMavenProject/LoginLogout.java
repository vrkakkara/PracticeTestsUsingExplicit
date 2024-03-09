package com.vishnukakkara.Jan24.LearningFirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogout {
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
	public void loginLogout() {
		loggingIn();
		logout();
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

	
	public void logout() {
		
		
		WebElement logoutBtn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='list-group'] a:last-of-type")));
		logoutBtn.click();
		
	}
	public void validate() {
		WebElement logoutConfirmation=driver.findElement(By.cssSelector("div[id='content'] p:first-of-type"));
		String logoutText=logoutConfirmation.getText();
		System.out.println(logoutText);
		Assert.assertEquals(logoutText, "You have been logged off your account. It is now safe to leave the computer.");
	}
	
	

}

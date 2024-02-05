package com.vishnukakkara.Jan24.LearningFirstMavenProject;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumBasics {
	WebDriver driver = null;

	/*
	 * @BeforeMethod public void loadWebPage() {
	 * System.setProperty("webdriver.edge.driver",
	 * "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");
	 * 
	 * WebDriver driver = new EdgeDriver();
	 * 
	 * driver.get("http://www.amazon.ca"); }
	 */
	/*
	 * public void closeWebPage() {
	 * 
	 * driver = new EdgeDriver();
	 * 
	 * driver.close(); }
	 */

	@BeforeMethod
	public void getPageUrl() {
		System.setProperty("webdriver.edge.driver", "C:\\vsn\\Pivot\\Edge\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
	@Test
	
	public void sendKeysForInput() {
		//By CSS selector
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		//By ID
		WebElement email = driver.findElement(By.cssSelector("input#input-email"));
		
		//
		WebElement telephone = driver.findElement(By.cssSelector("input#input-telephone"));
		//
		WebElement password = driver.findElement(By.cssSelector("input#input-password"));
		WebElement confirmPassword = driver.findElement(By.cssSelector("input#input-confirm"));
		
		
		
		
		WebElement subscribeBtn = driver.findElement(By.cssSelector("input[name='newsletter'][value='1']"));
		
		WebElement privacyPolicyBtn = driver.findElement(By.cssSelector("input[name='agree']"));
		WebElement continueBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
		
				
		
		
		firstName.sendKeys("Vishnu");
		lastName.sendKeys("Kakkara");
		email.sendKeys("vsn@gmail.com");
		telephone.sendKeys("6479131386");
		password.sendKeys("Password@1");
		confirmPassword.sendKeys("Password@1");
		subscribeBtn.click();
		privacyPolicyBtn.click();
		continueBtn.click();
		

	}

	

}

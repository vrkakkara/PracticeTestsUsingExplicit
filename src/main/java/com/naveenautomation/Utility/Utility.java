package com.naveenautomation.Utility;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomation.TestBase.TestBase;

public class Utility extends TestBase {
	
	public static void takeFailedTestScreenShot(String testCaseName) {
		// Get the current date and Time
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		// Save the screen shot in a file
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Save the screenshot
		try {
			FileUtils.copyFile(screenShotFile,
					new File("./FailedScreenShot\\" + "_" + testCaseName + "_" + timeStamp + ".jpeg"));
		} catch (IOException e) {
			System.out.println("Unable to save or take screen shot of failed test " + testCaseName);

		}

	}

	public static String generateRandomName() {
		return RandomStringUtils.randomAlphabetic(5);
	}
	
	public static String generateRandomemail() {
		return ("abc"+RandomStringUtils.randomAlphabetic(3)+"@gmail.com");
	}
	public static String generateRandomPhoneNumber() {
		return RandomStringUtils.randomNumeric(10);
	}

	public static Date generateRandomDate() {
		return new Date();
	}


	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {

		}
	}
	//methods for providing explicit wait
		
	public static WebElement waitForElementToBeVisible (WebElement element,int waitTime) {
		return new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebElement waitForElementToBeClickable(WebElement element,int waitTime) {
		return new WebDriverWait(driver, waitTime).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static boolean waitForElementToBeSelectable(WebElement element,int waitTime) {
		return new WebDriverWait(driver, waitTime).until(ExpectedConditions.elementSelectionStateToBe(element,false));
	}
	
	
	public static void enterText(WebElement element, String text) {
		waitForElementToBeVisible(element, 10).sendKeys(text);
			}
	public static void clickElement(WebElement element) {
		waitForElementToBeClickable(element, 10).click();
			}
	public static void selectDropdownByVisibleText(WebElement element, String visibleText) {
		Select select=new Select(element);
		if(waitForElementToBeSelectable(element, 10)) {
		select.selectByVisibleText(visibleText);
			}}
		public static void selectDropdownByValue(WebElement element, String value) {
			Select select=new Select(element);
			if(waitForElementToBeSelectable(element, 10)) {
			select.selectByValue(value);
				}
		}
		public static void submitClickElement(WebElement element) {
			waitForElementToBeClickable(element, 10).submit();
							}
		public static void clearField(WebElement element) {
			waitForElementToBeVisible(element, 10).clear();
				}
		public static String getTextOfElement(WebElement element) {
			return waitForElementToBeVisible(element, 10).getText();
				}
}
	



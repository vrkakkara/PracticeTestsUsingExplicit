package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class TransactionsPage extends TestBase{
	
	public TransactionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "td.text-center[colspan='5']")

	WebElement transactionBanner;
	
	
	
	
	
	

}

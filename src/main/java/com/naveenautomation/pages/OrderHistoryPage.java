package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class OrderHistoryPage extends TestBase{
	
	
	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}

		

	@FindBy(css = "table.table.table-striped tr>td:nth-of-type(1)")

	WebElement orderID;
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement orderIDContinueBtn;
	
	
	
	
	private void getOrderID() {

		String orderIdText = orderID.getText();
		System.out.println("The order ID for your previous order is: "+orderIdText);
	}
	
	private void clickContinueBtn() {

		orderIDContinueBtn.click();

	}
	
	public void fetchOrderIdFlow() {
		getOrderID();
		clickContinueBtn();
	}
	
	

}

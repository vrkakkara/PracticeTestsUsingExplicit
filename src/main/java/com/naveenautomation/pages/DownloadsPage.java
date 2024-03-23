package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class DownloadsPage extends TestBase{
	
	public DownloadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div#content p")

	WebElement noDownloadsConfirmation;
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement downloadsContinueBtn;
	
	
	public void validateDownloadsConfirmation() {
		String downloadsText=Utility.getTextOfElement(noDownloadsConfirmation);
		Assert.assertEquals(downloadsText,
				"You have not made any previous downloadableeeeee orders!");
	}
	
	private void clickDownloadsContinueBtn() {
		Utility.clickElement(downloadsContinueBtn);
	}
	
	public MyAccountPage downloadsFlow() {
		validateDownloadsConfirmation();
		clickDownloadsContinueBtn();
		return new MyAccountPage();
	}

}

package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class DownloadsPage extends TestBase{
	
	public DownloadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div#content p")

	WebElement noDownloadsConfirmation;
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement downloadsContinueBtn;
	
	
	public void validateDownloadsConfirmation() {
		String downloadsText=noDownloadsConfirmation.getText();
		Assert.assertEquals(downloadsText,
				"You have not made any previous downloadable orders!");
	}
	
	private void clickDownloadsContinueBtn() {
		downloadsContinueBtn.click();
	}
	
	public MyAccountPage downloadsFlow() {
		validateDownloadsConfirmation();
		clickDownloadsContinueBtn();
		return new MyAccountPage();
	}

}

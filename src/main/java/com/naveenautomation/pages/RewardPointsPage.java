package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomation.TestBase.TestBase;

public class RewardPointsPage extends TestBase{

	
	public RewardPointsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.col-sm-9#content>p")

	WebElement rewardPointsBanner;
	
	@FindBy(css = "div.pull-right>a.btn.btn-primary")

	WebElement rewardsContinueBtn;
	
	public void validateRewardPointsConfirmation() {
		String rewardsText=rewardPointsBanner.getText();
		
		//split a sentence
		String [] totalPoints=new String[2];
		totalPoints=rewardsText.split(":");
		System.out.println("The total reward points is: "+totalPoints[1]);
		Assert.assertEquals(rewardsText,
				"Your total number of reward points is: 0.");
	}
	

}

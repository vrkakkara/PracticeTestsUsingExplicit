package com.naveenautomation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Utility.Utility;

public class CustomListener extends TestBase implements ITestListener{
	public void onTestStart(ITestResult result){
		  
		logger.info("Test Starts : " + result.getMethod().getMethodName());
	  }

	
	  public void onTestSuccess(ITestResult result) {
		  logger.info("Test Passed : " + result.getMethod().getMethodName());
		  
	  }

	 
	  public void onTestFailure(ITestResult result){
		 
		  logger.info("Test Failed and Taking Screenshot : " + result.getMethod().getMethodName());
			Utility.takeFailedTestScreenShot(result.getMethod().getMethodName());
		  
	  }

	
	  public void onTestSkipped(ITestResult result){
		  logger.info("Test Skipped : " + result.getMethod().getMethodName());
		  
	  }

	
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result){
		  
	  }

	 
	  public void onStart(ITestContext context){
		  
	  }

	 
	  public void onFinish(ITestContext context){
		  
	  }

	

	
	

}

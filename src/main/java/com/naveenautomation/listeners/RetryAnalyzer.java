package com.naveenautomation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naveenautomation.TestBase.TestBase;

public class RetryAnalyzer extends TestBase implements IRetryAnalyzer {
	
	
	int count=0;
	int maxCount=2;
	

	@Override
	public boolean retry(ITestResult result) {
		if (count < maxCount) {
			logger.info("Test failed, Retrying for " + count + " ,Test Name : " + result.getMethod().getMethodName());
			count++;
			return true;
			}
		
		return false;
	}
	
	

}

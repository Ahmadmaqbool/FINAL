package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenersTest implements ITestListener{

	public void onTestStart(ITestResult result) {
      System.out.println("********** Test Started : "+result.getName());		
	}

	public void onTestSuccess(ITestResult result) {
      System.out.println("********** Test is successful : "+result.getName());		
	}

	public void onTestFailure(ITestResult result) {
		  System.out.println("********** Test is Fail : "+result.getName());			
	}

	public void onTestSkipped(ITestResult result) {
		  System.out.println("********** Test is skipped : "+result.getName());			
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		  System.out.println("********** Test is completed : "+context.getName());			
	}

}

package com.amazon.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends BaseTest implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= rep.startTest(result.getName().toUpperCase());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Utilities.getScreenSheet();
		test.log(LogStatus.PASS, result.getName().toUpperCase());
		String testName = result.getName();
		test.log(LogStatus.PASS, test.addBase64ScreenShot(testName));
		rep.endTest(test);
		rep.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//
			Utilities.getScreenSheet();
			test.log(LogStatus.FAIL, result.getName().toUpperCase());
			test.log(LogStatus.FAIL, result.getThrowable());
			String failedTestName = result.getName();
			System.out.println("Failed test name:"+failedTestName);
			test.log(LogStatus.FAIL, test.addScreenCapture(ExtentManager.currentdate+failedTestName));
			rep.endTest(test);
			rep.flush();
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

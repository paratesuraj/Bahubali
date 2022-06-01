package Com.sauceDemo.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener
{
	public void onStart(ITestResult result)
	{
		System.out.println("Test Execution is started");
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("Test Execution is finish");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is failed");
	}

}

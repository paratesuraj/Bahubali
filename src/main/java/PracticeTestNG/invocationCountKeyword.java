package PracticeTestNG;

import org.testng.annotations.Test;

public class invocationCountKeyword 
{
	//invocationCount keyword use to execute case multiple time 
	
	
	@Test(invocationCount = 1)          //-->1
	public void testA()
	{
		System.out.println("Test-A");
	}

	
	@Test(invocationCount = 2)         //-->2  print 2 time 
	public void testB()
	{
		System.out.println("Test-B");
	}
	
	@Test(priority =1, invocationCount = 0)       //-->Zero case will not be executed
	public void testC()
	{
		System.out.println("Test-C");
	}
	
	@Test(invocationCount = 3)        //-->3  print 3time 
	public void testD()
	{
		System.out.println("Test-D");
	}
	
	@Test (invocationCount = -1)      //-->negative case will not be executed
	public void testE()
	{
		System.out.println("Test-E");
	}
}

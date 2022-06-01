package PracticeTestNG;

import org.testng.annotations.Test;

public class enabledKeyword 
{
	@Test(enabled = false)             //--> False value will not be printed
	public void testA()
	{
		System.out.println("Test-A");
	}
   
	@Test                          //-->By default True --> then it will be printed
	public void testB()
	{
		System.out.println("Test-B");
	}
	
	@Test(enabled = false)
	public void testC()
	{
		System.out.println("Test-C");
	}
	
	@Test                          //-->By default True --> then it will be printed
	public void testD()
	{
		System.out.println("Test-D");
	}
	
	@Test(enabled = false)
	public void testE()
	{
		System.out.println("Test-E");
	}
	
}

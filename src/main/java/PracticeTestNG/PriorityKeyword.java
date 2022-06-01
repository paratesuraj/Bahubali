package PracticeTestNG;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
	@Test(priority = 1)             //-->4
	public void testA()
	{
		System.out.println("Test-A");
	}
	
	@Test(priority = -1)             //-->2
	public void testB()
	{
		System.out.println("Test-B");
	}
	
	@Test(priority = -2)                //-->1
	public void testC()
	{
		System.out.println("Test-C");
	}
	
	@Test(priority = 0)               //-->3
	public void testD()
	{
		System.out.println("Test-D");
	}
	
	@Test(priority = 2)                //-->5
	public void testE()
	{
		System.out.println("Test-E");
	}

}

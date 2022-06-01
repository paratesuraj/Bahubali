package PracticeTestNG;

import org.testng.annotations.Test;

public class timeOutKeyword 
{
	@Test 
	public void testA()
	{
		System.out.println("Test- A");
	}
	
	@Test 
	public void testB()
	{
		System.out.println("Test- B");
	}
	
	@Test (timeOut = 1000)
	public void testC() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test- C");
	}
	
	@Test 
	public void testD()
	{
		System.out.println("Test- D");
	}
	
	@Test (timeOut = 1000)
	public void testE() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test- E");
	}

}

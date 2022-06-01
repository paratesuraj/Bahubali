package PracticeTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceTestNG 
{
	// In TestNG instead of main method we are writing @Test annotation
	
	@Test                      
	public void method1()
	{
		System.out.println("Suraj Parate");
	}

	@BeforeMethod
	public void method2()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void method3()
	{
		System.out.println("After Method");
	}
	
}

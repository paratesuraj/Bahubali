package PracticeTestNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod_Keyword 
{
//	@Test
//	public void loginTest()
//	{
//		System.out.println("Login Test Case");
//		Assert.assertTrue(false);;
//	}
//	
//	@Test (dependsOnMethods= {"loginTest"})
//	public void productAdd() 
//	{
//		System.out.println("Single Product add");
//		
//	}
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Login Test Case");
		Assert.assertTrue(false);;
	}
	
	@Test (dependsOnMethods= {"loginTest"}, priority=1)
	public void productAdd() 
	{
		System.out.println("Single Product add");
		
	}

}

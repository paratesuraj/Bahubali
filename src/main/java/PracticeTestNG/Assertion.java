package PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion 
{
	//-->Hard Assert
	
	@Test
	public void loginTest()
	{
		//--> if first condition is fail then will not check second condition will avoid second condition
		
		//-->Title Validation
		String expectedTitle=" Labs";
		String actualTitle="Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//-->URL Validation
		String expectedurl="www.swagLab.com";
		String actualurl="www.swagLab.com";
		
		Assert.assertEquals(actualurl, expectedurl);
						
	}
	
	@Test
	public void HomePageTest()
	{
		Assert.assertTrue(true);
	}

}

package PracticeTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion2 
{
	//--> Soft Assert
	
	@Test
	public void loginTest()
	{
		//--> for soft assertion we need to create object
		//--> if first condition is fail then also will check second condition 
		
		//-->Title Validation             
		String expectedTitle=" Labs";
		String actualTitle="Swag Labs";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		//-->URL Validation
		String expectedurl="www.swagLab.com";
		String actualurl="www.swagLab.com";
		
		soft.assertEquals(actualurl, expectedurl);
						
	}

}

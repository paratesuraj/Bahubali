package PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Com.sauceDemo.Utility.Listner.class)
public class SampleClass 
{
	@Test
	public void VerifyLoginURL()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void VerifyLoginTitle()
	{
		Assert.assertTrue(false);
	}

}

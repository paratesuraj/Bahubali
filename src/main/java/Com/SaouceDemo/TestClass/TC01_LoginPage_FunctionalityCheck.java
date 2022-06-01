	package Com.SaouceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SaouceDemo.POMClass.LoginPagePomClass;
import Com.SaouceDemo.POMClass.ScreenShotPomClass;


public class TC01_LoginPage_FunctionalityCheck extends TestBaseClass
{
	// we are going to execute this class
	
	    @Test(priority=3)
	    public void loginFunctinality()
	 {
	    log.info("Verify the test case");
	    String expectedTital = "Swag Labs";
	    String actualTital = driver.getTitle();
	    
	    //--> Hard Assert  --> This validation works in TestNG
	    
	    Assert.assertEquals(actualTital, expectedTital);
	    
	    
	    //--> This validation not work in TestNg
	    
//	    if (expectedTital.equals(actualTital))
//	    {
//	    	System.out.println("Test case is passed");
//	    }
//	    else
//	    {
//	    	System.out.println("test case is failed");
//	    }
	    
	  }
	    
	   
	}



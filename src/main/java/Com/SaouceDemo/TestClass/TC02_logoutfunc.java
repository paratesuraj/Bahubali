package Com.SaouceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SaouceDemo.POMClass.HomePagePomClass;
import Com.SaouceDemo.POMClass.LoginPagePomClass;


public class TC02_logoutfunc extends TestBaseClass
{
	    //logout
	@Test(priority=4)
	public void logoutFuncatinality()
	{
	    HomePagePomClass hp = new HomePagePomClass(driver);
	    
	    hp.clickMenubutton();
	    log.info("Click on menubutton");
	    hp.clickOnLogOutButton();
	    log.info("click on logoutbutton");
	    
	    String expectedURL= "https://www.saucedemo.com/";
	    String actualURL= driver.getCurrentUrl();
	    
	    //--> Hard Asertion
	    
	    Assert.assertEquals(actualURL, expectedURL);
	}
	

}

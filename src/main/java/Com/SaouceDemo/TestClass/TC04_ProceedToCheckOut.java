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


public class TC04_ProceedToCheckOut extends TestBaseClass
{
	@Test(priority=5)
	public void PersonalInfoAdd()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.singleBagAdd();
        log.info("Single product added to cart");
	    hp.clickOnCart();
	    log.info("Click on cart Button");
	    

	    String ExpectedTitle ="1";
	    String ActualTitle=hp.getTextfromcartbutton();
	    
	    //--> Hard assert
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    
	    hp.clickMenubutton();
	    log.info("Click on menubutton");
	    hp.clickOnLogOutButton();
	    log.info("click on logoutbutton");
	}
	   
}

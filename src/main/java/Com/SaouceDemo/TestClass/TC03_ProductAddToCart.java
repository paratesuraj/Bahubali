package Com.SaouceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.SaouceDemo.POMClass.HomePagePomClass;
import Com.SaouceDemo.POMClass.LoginPagePomClass;
import Com.SaouceDemo.POMClass.ScreenShotPomClass;

public class TC03_ProductAddToCart extends TestBaseClass
{	    
	    //-->HomePage add product to cart
	@Test(priority=2)
	public void productaddToCart()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.multiplebagAddToCart();
	    log.info("Multiple bag add to cart");
	    hp.singleBagAdd();
	    
	    String ExpectedTitle ="6";
	    String ActualTitle=driver.getCurrentUrl();
	    
	    //--> soft assert --> 2nd method for verification purpose 
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(ActualTitle, ExpectedTitle);
	    
	    soft.assertAll();
	    		
	    hp.clickMenubutton();
	    log.info("Click on menubutton");
	    hp.clickOnLogOutButton();
	   log.info("click on logoutbutton");   
	}
	
}

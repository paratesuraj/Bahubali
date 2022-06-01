package Com.SaouceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SaouceDemo.POMClass.CartPage_POMClass;
import Com.SaouceDemo.POMClass.HomePagePomClass;
import Com.SaouceDemo.POMClass.LoginPagePomClass;
import Com.SaouceDemo.POMClass.Personal_info_page;


public class TC005_addPersonalInfo extends TestBaseClass
{
	@Test(priority=1)
	public void personalInfoAdd()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.singleBagAdd();
	    log.info("Single product added to cart");
	    hp.clickOnCart();
	    log.info("Click on cart Button");
	
	    CartPage_POMClass cp= new CartPage_POMClass(driver);
	    cp.clickOnCheckout();
	    
	    Personal_info_page pp= new Personal_info_page(driver);
	    pp.clickOnfirstname();
	    log.info("First name added");
	    pp.clickOnLastname();
	    log.info("Last name added");
	    pp.clickOnContinueButton();
	    log.info("Click on ContinueButton");
	    
	    String ExpectedTitle ="Swag Labs";
	    String ActualTitle=driver.getTitle();
	    
	    //--> Hard Assert
	    
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    
	    hp.clickMenubutton();
	    log.info("Click on menubutton");
	    hp.clickOnLogOutButton();
	    log.info("click on logoutbutton");
	}
}

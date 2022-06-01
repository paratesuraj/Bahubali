package Com.SaouceDemo.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.SaouceDemo.POMClass.CartPage_POMClass;
import Com.SaouceDemo.POMClass.HomePagePomClass;
import Com.SaouceDemo.POMClass.Personal_info_page;


public class AllTC extends TestBaseClass
{
    @Test(priority=3)
    public void loginFunctinality()
 {
    System.out.println("Verify the test case");
    String expectedTital = "Swag Labs";
    String actualTital = driver.getTitle();
    
    //--> Hard Assert  --> This validation works in TestNG
    
    Assert.assertEquals(actualTital, expectedTital);
 }
    //logout
	@Test(priority=4)
	public void logoutFuncatinality()
	{
	    HomePagePomClass hp = new HomePagePomClass(driver);
	    
	    hp.clickMenubutton();
	    System.out.println("Click on menubutton");
	    hp.clickOnLogOutButton();
	    System.out.println("click on logoutbutton");
	    
	    String expectedURL= "https://www.saucedemo.com/";
	    String actualURL= driver.getCurrentUrl();
	    
	    //--> Hard Asertion
	    
	    Assert.assertEquals(actualURL, expectedURL);
	}
	
    //-->HomePage add multiple product to cart
	@Test(priority=2)
	public void productaddToCart()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.multiplebagAddToCart();
	    System.out.println("Multiple bag add to cart");
	    hp.singleBagAdd();
	    
	    String ExpectedTitle ="6";
	    String ActualTitle=driver.getCurrentUrl();
	    
	    //--> soft assert --> 2nd method for verification purpose 
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(ActualTitle, ExpectedTitle);
	    
	    soft.assertAll();
	    		
	    hp.clickMenubutton();
	    System.out.println("Click on menubutton");
	    hp.clickOnLogOutButton();
	    System.out.println("click on logoutbutton");   
	}
	
	//--> Single product add to cart
	@Test(priority=5)
	public void PersonalInfoAdd()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.singleBagAdd();
	    System.out.println("Single product added to cart");
	    hp.clickOnCart();
	    System.out.println("Click on cart Button");
	    

	    String ExpectedTitle ="1";
	    String ActualTitle=hp.getTextfromcartbutton();
	    
	    //--> Hard assert
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    
	    hp.clickMenubutton();
	    System.out.println("Click on menubutton");
	    hp.clickOnLogOutButton();
	    System.out.println("click on logoutbutton");
	}
	
	//--> personal info 
	@Test(priority=1)
	public void personalInfoAdd()
	{
	    HomePagePomClass hp= new HomePagePomClass(driver);
	    hp.singleBagAdd();
	    System.out.println("Single product added to cart");
	    hp.clickOnCart();
	    
	    System.out.println("Click on cart Button");
	
	    CartPage_POMClass cp= new CartPage_POMClass(driver);
	    cp.clickOnCheckout();
	    
	    Personal_info_page pp= new Personal_info_page(driver);
	    pp.clickOnfirstname();
	    System.out.println("First name added");
	    pp.clickOnLastname();
	    System.out.println("Last name added");
	    pp.clickOnContinueButton();
	    System.out.println("Click on ContinueButton");
	    
	    String ExpectedTitle ="Swag Labs";
	    String ActualTitle=driver.getTitle();
	    
	    //--> Hard Assert
	    
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    
	    hp.clickMenubutton();
	    System.out.println("Click on menubutton");
	    hp.clickOnLogOutButton();
	    System.out.println("click on logoutbutton");
	}

}

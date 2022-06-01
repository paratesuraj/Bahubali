package Com.SaouceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage_POMClass 
{
    private WebDriver driver;
	
	@FindBy (xpath="//button[@id='continue-shopping']")
	private WebElement continueShopping;
	
	public void clickOnContinueShopping()
	{
		continueShopping.click();
	}
	
	@FindBy (xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	public void clickOnCheckout()
	{
		checkout.click();
	}
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement remove;
	
	public void clickOnRemove()
	{
		remove.click();
	}
	
	//--> Constructor declare
	
			public CartPage_POMClass(WebDriver driver)
			{
				   //global    local
				this.driver = driver;
				
				//selenium class
				PageFactory.initElements(driver, this);
			}



}

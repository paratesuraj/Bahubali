package Com.SaouceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass 
{
	private WebDriver driver;
	
	@FindBy (xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addToCart;
	
	public void clickOnAddToCart()
	{
		addToCart.click();
	}

	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement Cart;
	
	public void clickOnCart()
	{
		Cart.click();
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuebutton;
	
	public void clickMenubutton()
	{
		menuebutton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	
	public void clickOnLogOutButton()
	{
		logoutbutton.click();
	}
	
	
	
	//--> Add multiple product to cart
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>multipleproductAddToCart;
	
	public void multiplebagAddToCart() 
	{
        for (int i=0; i<multipleproductAddToCart.size(); i++)
	     {
        	multipleproductAddToCart.get(i).click();
	     }
	}
	
	  //--> Add Single bag to cart
	
		@FindBy(xpath="//button[text()='Add to cart']")
		private WebElement singlebagAddToCart;
		
		public void singleBagAdd() 
		{
			singlebagAddToCart.click();
		}
		
		
		//--> cart button
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		private WebElement clickoncart;
		
		public String getTextfromcartbutton() 
		{
			String totalProducts = clickoncart.getText();
			return totalProducts;

		}
		
	
	
	//--> Constructor declare
	
		public HomePagePomClass(WebDriver driver)
		{
			   //global    local
			this.driver = driver;
			
			//selenium class
			PageFactory.initElements(driver, this);
		}

}

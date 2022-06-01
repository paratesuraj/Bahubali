package Com.SaouceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_info_page 
{
private WebDriver driver;
	
	@FindBy (xpath="//input[@id='first-name']")
	private WebElement fname;
	
	public void clickOnfirstname()
	{
		fname.sendKeys("Suraj");
	}

	@FindBy (xpath="//input[@id='last-name']")
	private WebElement lname;
	
	public void clickOnLastname()
	{
		lname.sendKeys("Parate");
	}
	
	@FindBy (xpath="//input[@id='postal-code']")
	private WebElement postalCode;
	
	public void clickOnpostalCode()
	{
		postalCode.sendKeys("444555");
	}
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	@FindBy (xpath="//button[@id='cancel']")
	private WebElement cancelButton;
	
	public void clickOnCancelButton()
	{
		cancelButton.click();
	}
	
	//--> Constructor declare
	
		public Personal_info_page(WebDriver driver)
		{
			   //global    local
			this.driver = driver;
			
			//selenium class
			PageFactory.initElements(driver, this);
		}
		
	
	
	
}

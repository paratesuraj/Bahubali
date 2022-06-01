package Com.SaouceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPagePomClass 
{
	//Step 1- WebDriver driver (global)
	//Stpe 2- element find --> @FindBy
	//Step 3- Method--> element action
	//Step 4- Constructor --> this and PageFactory
	
	
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")      //--> Username
	private WebElement username;
	
	public void sendusername()               
	{
		username.sendKeys("standard_user");
		
	}
	
	
	@FindBy(xpath="//input[@id='password']")     //--> password
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
		
	}
	
	@FindBy(xpath="//input[@id='login-button']")   //--> loginbutton
	private WebElement login;
	
	public void clickLoginButton()
	{
		login.click();
		
	}
	
	//--> Constructor declare
	
	public LoginPagePomClass(WebDriver driver)
	{
		   //global    local
		this.driver = driver;
		
		//selenium class
		PageFactory.initElements(driver, this);
	}
	
	
}

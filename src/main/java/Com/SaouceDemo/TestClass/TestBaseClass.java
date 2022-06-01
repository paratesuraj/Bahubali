package Com.SaouceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.SaouceDemo.POMClass.LoginPagePomClass;
import Com.SaouceDemo.POMClass.ScreenShotPomClass;

public class TestBaseClass 
{
    WebDriver driver;
    Logger log = Logger.getLogger("DemoSaucev1");
	
    @Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{
    	if(browserName.equals("chrome")) 
    	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver =  new ChromeDriver();
    	}
    	else 
    	{
    		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
    		
    	driver=  new FirefoxDriver();
    	}
    	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		log.info("Browser is open");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.saucedemo.com/");
	    log.info("URL open");
	    
	    //--> Login Page test 
	    
	    LoginPagePomClass lp= new LoginPagePomClass(driver);
	    
	    lp.sendusername();        //-->username
	    log.info("enter the username");
	    lp.sendpassword();       //-->password
	    log.info("enter the password");
	    lp.clickLoginButton();   //-->Login
	    log.info("click on loginbutton");
	} 
	
	 @AfterMethod
	    public void tearDown() throws IOException
	    {
	    ScreenShotPomClass.takeScreenShot(driver);
	    driver.quit();
	    log.info("End of program");
	    }
	

}

package Com.SaouceDemo.POMClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPomClass 
{
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		Date d = new Date ();
		DateFormat d1= new SimpleDateFormat("MM-dd-yy && HH-ss-mm");
		String date=d1.format(d);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File ("./screenshot/GoogleScreenshot"+date+".jpg");
		FileHandler.copy(source, dest);
		System.out.println("ScreenShot is taken");
		
		
	}

}

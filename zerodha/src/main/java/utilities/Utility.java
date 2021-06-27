package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	public static void takesScreenshot(WebDriver driver,int testID) throws IOException
	{
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest =new File ("test-output"+File.separator+"testScreenshpts"+"Test_"+testID+".jpg");
	FileHandler.copy(source, dest);
	
	
	
	
	
	
	}
	

}

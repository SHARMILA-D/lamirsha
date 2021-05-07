package Seleniumexamples;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotExmple {
 static WebDriver driver;
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.phptravels.net/home");
		

	       //Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	      
	            FileUtils.copyFile(screenshot, new File("C:\\Users\\ARUN\\eclipse-workspace\\Demo1\\homePageScreenshot.png"));
	        

	       	}
}

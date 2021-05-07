package Seleniumexamples;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser {
	 static WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	
	public static void setup(String browsername)
	{
	if(browsername.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver-v0.28.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
			else if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
				//WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
	}
			
	@Test
	public static void Testmeth()
	{
	driver.get("https://www.phptravels.net/home");
			
    }
	@AfterTest
	public static  void teardoem()
	{
		driver.close();
		
	}
				
			}
			


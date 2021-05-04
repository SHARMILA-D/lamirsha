package flightdetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DatePicker {
	public static   WebDriver driver;
	@BeforeTest
	public  void setup()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.phptravels.net/home");
	
	 driver.manage().window().maximize();
	 FlightBooking obj=new FlightBooking();
	 obj.booking(driver);
	
	}

}

package flightdetails;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightBooking {
	public static WebDriver driver;
	@BeforeMethod
	public  void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\webdriver_1\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/home");

		driver.manage().window().maximize();
		/* FlightBooking obj=new FlightBooking();
	 obj.booking(driver);*/

	}

	@Test
	public static void booking(WebDriver driver)
	{
		String month="Septemper 2020";
		String day="15";
		WebElement flightlink=driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/div/div/div/nav/ul/li[2]/a"));
		Actions builder=new Actions(driver);
		Action bb=builder.moveToElement(flightlink).click().build();
		bb.perform();
		WebElement button=driver.findElement(By.xpath("//input[@name='triptype' and @id='flightSearchRadio-2']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try
		{
			WebElement from=driver.findElement(By.xpath("//div[@class='select2-container form-control' and @id='s2id_location_from']"));
			driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
			((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='bangalore'",from);
		}
		catch(Exception e)
		{
			System.out.println("success");
		}
		/*List<WebElement> fromlist=driver.findElements(By.xpath("//*[@id=\"select2-drop\"]/ul"));
			System.out.println(fromlist.size()+"\n");
			for(int i=0;i<fromlist.size();i++)
			{
				WebElement element=fromlist.get(i);
				System.out.println(element.getAttribute("innerHTML"));*/
		WebElement datefield=driver.findElement(By.id("FlightsDateStart"));
		datefield.click();
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[2]")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/nav/div[3]")).click();
			}
			driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[7]/div/div/div[2]/div[20][contains(text())]"));
		}
		// ghu();
	}
	@AfterMethod
	public static void ghu()
	{
		driver.quit();
	}
}



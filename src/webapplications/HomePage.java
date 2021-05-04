package webapplications;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage  {
	public static WebDriver driver;

	public static void startpage() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdriver_1\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		//WebDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.get("https://9739949409:preethi25@www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		LoginDet ld = new LoginDet();

		ld.logindetails(driver);
		
	}

}

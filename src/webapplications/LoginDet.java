package webapplications;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.injector.Injector.Builder;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginDet  {
	public static WebDriver driver;

	public void logindetails(WebDriver driver) {
		// try
		// {
		WebElement newacc = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/a"));
		newacc.click();
		WebElement email = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		email.sendKeys("9739949409");
		WebElement continue1 = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		continue1.click();
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("preethi25");
		WebElement loginbtn = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		loginbtn.click();
		
	FlightBooking obj3=new FlightBooking();
			obj3.bookingPortal(driver);
	}
	}
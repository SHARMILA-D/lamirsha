package webapplications;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {
	public static WebDriver driver ;
	public static void bookingPortal(WebDriver driver)
	{
		WebElement flight=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[9]/a"));
		Actions builder= new Actions(driver);
		Action mousehover=builder.moveToElement(flight).click().build();
		mousehover.perform();
	WebElement radiobtn1=driver.findElement(By.xpath("//label[@class='_8J-bZE _1Icwrf']"));
	radiobtn1.click();        
	WebElement fromfield=driver.findElement(By.xpath("//input[@name='0-departcity']"));
	fromfield.click();
		/*fromfield.sendKeys("ban");
		WebElement list=driver.findElement(By.name("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div/div[2]"));
	Actions field = new Actions(driver);
	Action city=field.moveToElement(list).keyDown(Keys.CONTROL).build();
	city.perform();*/
	WebElement fromlist=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div/div[2]/div/div[2]/div[2]"));
	fromlist.click();
	/*WebElement tofield=driver.findElement(By.xpath("//input[@name='0-arrivalcity']"));
	tofield.click();*/
	/*WebElement Tolist=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div/div[2]/div/div[1]"));
	Tolist.click();*/
	List<WebElement> set =driver.findElements(By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div/div[2]"));
	System.out.println(set.size()+"\n");
	
	/*WebElement fromdate=driver.findElement(By.name("0-datefrom"));
	fromdate.click();
	String month="july 2020";
	String day="29";
	while(true)
	{
		String text=driver.findElement(By.cssSelector("._3F0tlh")).getText();
		if(text.equals(month))
		{
			break;
		}
		else
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[2]/thead/tr[1]/th[3]/div/button"));
		
	}
	driver.quit();
	/*Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	/*List<WebElement> set =driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[1]/div[2]/div/div[1]"));
	Actions build1=new Actions(driver);
	Action bb=build1.moveToElement(fromlist).click().build();
	bb.perform();
	//fromfield.sendKeys("bangalore");
			/*Select fromobj=new Select(fromfield);
	fromobj.selectByVisibleText("Bangalore");
	WebElement from=driver.findElement(By.cssSelector(".//input[@class='_16qL6K HDWLFe _2YVEL1 _1qpQfA _366U7Q']"));
	from.clear();
	/*List<WebElement> radio = driver.findElements(By.xpath("//input[@name='tripTypeList'and @type='radio'] "));
	for(int i=1;i<radio.size();i++)
	{
		WebElement local_radio=radio.get(i);
		System.out.println(i);
		String value=local_radio.getAttribute("id");
		System.out.println("value from radio buttons are======>"+value);
		
		if(value.equalsIgnoreCase("ROUND_TRIP"))
		{
			
			 local_radio.click();
			 boolean button=driver.findElement(By.xpath("//input[@name='tripTypeList']")).isSelected();
			 System.out.println(button);
			 System.out.println(value);
		}
	}
	/*WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	search.click();
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]"));
    // WebElement ele1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]"));
     Actions builder =new Actions(driver);
		Action mousehover=builder.moveToElement(ele).clickAndHold().build();
		mousehover.perform();*/
	//flip();
	//category();
	return;
}

private void getAttribute(String string) {
	// TODO Auto-generated method stub
	
}

/*public static void flip() 
{//div[@class='_3pNZKl']/div[3]
	try
	{
	WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	search.click();
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
		
	}
}

public static void category()
{
	
		//	ele.click();

			WebElement ele=driver.findElement(By.xpath("//div[@class='_3pNZKl']/div[3]"));
           // WebElement ele1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]"));
            Actions builder =new Actions(driver);
			Action mousehover=builder.moveToElement(ele).clickAndHold().build();
			mousehover.perform();
}*/

/*
 * catch(NullPointerException e) { e.printStackTrace(); }
 */

// WebElement
// mobileNum=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
// mobileNum.sendKeys("9739949409");

}




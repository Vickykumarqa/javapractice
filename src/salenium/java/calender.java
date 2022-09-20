package salenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://shetty_selenium//driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();	
		// for selection of month
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		// for chosing the date
		
	// List<WebElement>	day =driver.findElements(By.className("day"));
	 
	//Grab common attribute//Put into list and iterate
	 
	   int count = driver.findElements(By.className("day")).size();
	 
		for(int i=0; i<count; i++)
		{
		String	text =driver.findElements(By.className("day")).get(i).getText();
		
		if(text.equalsIgnoreCase("22"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
			}
			
		}
	}

}

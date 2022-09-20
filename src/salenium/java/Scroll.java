package salenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String args[]) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	 List<WebElement> value= driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
	 int sum=0;
	 for(int i=0;i<value.size();i++)
	 {
		 
		 sum = sum + Integer.parseInt(value.get(i).getText());
	 }
	
	 System.out.println(sum);
	System.out.println(driver.findElement(By.cssSelector("div.totalAmount")).getText());
	int total = Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(sum, total);
}

	}

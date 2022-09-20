package salenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		
		// to count the columan
		
	 	List<WebElement> value=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		System.out.println("column count is "+value.size());
		
		// To count the Row
		
		List<WebElement>row=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
		
		System.out.println("row count is "+row.size());
		
		// Extract content from 2nd row
		System.out.print("2nd row content is====>");
		
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).getText());
		
		driver.close();
		
	}

}

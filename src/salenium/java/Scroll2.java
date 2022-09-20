package salenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,600)");
		
		List<WebElement> value=driver.findElements(By.cssSelector("table[class='table-display'] tbody tr td:nth-child(3)"));
		
		int sum=0;
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i).getText());
		sum= sum+Integer.parseInt(value.get(i).getText());
		
		}
		System.out.println("total value is= "+sum);
		
		driver.close();
		
	}

}

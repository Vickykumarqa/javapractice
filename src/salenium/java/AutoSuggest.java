package salenium.java;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSuggest {
	
	public static void main(String args []) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
       Thread.sleep(1000);

 
       List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
       
         
	     for(WebElement option:options)
	     {
	    	if( option.getText().equalsIgnoreCase("india")) {
	    		
	    		option.click();
	    		
	    		break;
	    	}
	     }
	
	}
}
		
		
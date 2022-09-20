package salenium.java;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTheLink {
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E://shetty_selenium//driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// limiting webdriver scope  Only for footer link
		
	 WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
	 
	 // limiting the webDriver Scope only in column
	 
	 WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
	 System.out.println(columndriver.findElements(By.tagName("a")).size());
	 
	 // click each of link available in column
	 
	 for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	 {
		 
	
		String clickonlinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab); 
		Thread.sleep(2000);
	 }// open all the tab
	 
	 // get title on each tab
	     Set<String> abc= driver.getWindowHandles();
	     Iterator<String> it=abc.iterator();
	 
	  while(it.hasNext()) {
		  
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getTitle());
	  }
	 
		
	}

}

package salenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
    Actions a = new Actions(driver);
    WebElement move= driver.findElement(By.cssSelector("div[class='nav-line-1-container']"));
    
   a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    
    a.moveToElement(move).contextClick().build().perform();
    
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hello");
		
	}

}

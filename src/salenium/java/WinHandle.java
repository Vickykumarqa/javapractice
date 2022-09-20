package salenium.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandle {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set<String>	windows=driver.getWindowHandles();// parent tab, child tab, subChild
	     Iterator<String> it=windows.iterator();
	    String parentid=it.next();
	    String childid= it.next();
		
		driver.switchTo().window(childid);
		//Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.cssSelector("div h3 span")).getText());// cssSelector using parent child tagname
		
		//driver.findElement(By.cssSelector("div h3 span")).getText();
		String password=driver.findElement(By.cssSelector("div h3 span")).getText().split(",")[0].split("on")[1].trim();
		
		//System.out.println(password);
		
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("input.form-control")).sendKeys(password);
		/*Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentid=it.next();
		String childid= it.next();
		driver.switchTo().window(childid);*/
		
	}

}

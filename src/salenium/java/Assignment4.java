package salenium.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows =driver.getWindowHandles();
		 Iterator<String>  it=windows.iterator();
		 String parenttab=it.next();
		 String childtab= it.next();
		 driver.switchTo().window(childtab);
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		driver.switchTo().window(parenttab);
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		driver.quit();
		
	}

}

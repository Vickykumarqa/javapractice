package salenium.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {              //E:\Shetty_selenium\Driver


		public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();


		driver.get("http://the-internet.herokuapp.com/");

            Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple Windows")).click();

	      Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href*='windows']")).click();


		Set<String> abc=driver.getWindowHandles();


		Iterator<String> it=abc.iterator();


		String parentWindow=it.next();


		driver.switchTo().window(it.next());


		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
	      Thread.sleep(2000);
		driver.switchTo().window(parentWindow);

	      Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());



		}

		}







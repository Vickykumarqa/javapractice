package salenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox {
	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	// to click the check by using css selector by passing partial value
	
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());// for checking clicking or not
	
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	// to count the checkboxes
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	}
	
}

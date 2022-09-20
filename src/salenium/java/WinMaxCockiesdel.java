package salenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinMaxCockiesdel {
	
	public static void main(String args []) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\Chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		driver.get("https://www.google.com/");
	}

}

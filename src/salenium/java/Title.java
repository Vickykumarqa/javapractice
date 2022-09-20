package salenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {
	public static void main(String[]args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		// to invoke firefox driver
		
	    //System.setProperty("webdriver.gecko.driver","E:\\Shetty_selenium\\Driver\\geckodriver.exe");
	    //WebDriver driver= new FirefoxDriver();
		
		
		// For invoking msedgedriver
		
		
		System.setProperty("webdriver.edge.driver","E:\\Shetty_selenium\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    Thread.sleep(2000);
		driver.close(); // for closing current page only
	  // driver.quit(); //  this will close all the windows associated  with automation
	}

}


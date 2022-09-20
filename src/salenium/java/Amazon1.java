package salenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon1 {
	public static void main(String arg[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	 String[]	names={"Carrot","Cucumber"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();// xpath usint text attribute.
		
	List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));  // css selector using tagname.class name
	
		//System.out.println(product.size());
		
		for(int i=0;i<product.size();i++) {
			
		System.out.println(product.get(i).getText());
		
	 String	name =product.get(i).getText();
	 
	if( name.contains("Cucumber")) {
		
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
	 break;
		
	}
		
			
		}
	} 

}

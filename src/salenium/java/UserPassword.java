package salenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserPassword {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("vicky");  // by css locator using id method 2
		
		//driver.findElement(By.id("inputUsername")).sendKeys("vicky");   // located by using id locator
		
		driver.findElement(By.name("inputPassword")).sendKeys("password");  // located by using name
		//driver.findElement(By.cssSelector(input[placeholder='Password']))
		
		//driver.findElement(By.className("signInBtn")).click();
		
		driver.findElement(By.cssSelector("button.signInBtn")).click(); // located by the css selector using method 1
		
		                                                          // 1.syntax - tagname.classname or .classname whnen only unique class name is avaible
		                                                          // 2.syntax- tagname#id when id will be given
		                                                          // 3.syntax- tagname[attribute='value']
        Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());   // css selector p.error
		
		driver.findElement(By.linkText("Forgot your password?")).click();  // link text locator using when anchor tag is available <a
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vicky"); // located by using xpath single attribute
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kumarqwerty89@gmail.com"); //located by using x path
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7870977177");    // located by css slector 
		                                                                                                   //syntax htmltagname [attribute type='attribute value']
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();  
		// by using x path index locator when no choice to use unique attribute
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("8793647794");  // by using css locator index 
		
		driver.findElement(By.xpath("//form/input[3]")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9801415818");  // by using xpath parent to child tagname with index
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();   // by using css selector .tagname syntax
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());  // using css selector parenttag name space child name
		
		
		
		Thread.sleep(3000);
		
		//driver.close();
	}

}

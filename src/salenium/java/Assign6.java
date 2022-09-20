package salenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {
	public static void main(String args[])  {
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.findElement(By.xpath("//input[@value='option2']")).click();
		
	    String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		// for selecting the dropdown
		WebElement drop=driver.findElement(By.id("dropdown-class-example"));
		Select s =new Select(drop);
		
	    s.selectByVisibleText(opt);
	    
	    driver.findElement(By.name("enter-name")).sendKeys(opt);
	    
	    driver.findElement(By.cssSelector("input[onclick='displayAlert()']")).click();
	    

	     String text=  driver.switchTo().alert().getText();

	     if(text.contains(opt))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");
	     
	     driver.switchTo().alert().accept();
	     
	     driver.close();
		
		
	}
	

}

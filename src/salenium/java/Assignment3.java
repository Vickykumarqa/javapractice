package salenium.java;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	
	public static void main(String[]args) throws Exception {
		
		String[] mobile= {"iphone", "Samsung"," Nokia","Blackberry"};
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//div/label[2]/span[@class='checkmark']")).click();
	
	
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".modal-body")));
		// to accept alert
		
		System.out.println(driver.findElement(By.cssSelector(".modal-body")).getText());
		driver.findElement(By.cssSelector(".modal-open")).click();
		
		// for static dropdown selection
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".form-control")));
		
	    WebElement	dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
	 	
		Select sdrop= new Select(dropdown);
		
		//sdrop.selectByIndex(2);
		//sdrop.selectByValue("teach");
		sdrop.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	// Apply explicit wait condition
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4.card-title")));
		
		addMob(driver,mobile);
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		driver.findElement(By.id("country")).sendKeys("ind");
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='suggestions']/ul"));
		
		 for(WebElement option:options)
	     {
	    	if( option.getText().equalsIgnoreCase("India")) {
	    		
	    		option.click();
	    		
	    		break;
	    	}
	     }
		 
		 driver.findElement(By.cssSelector("label[for='checkbox2']")).click();
		 driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	    	
		
		driver.quit();
		
	}
		
		
		
		
		
	   
	 public static void addMob(WebDriver driver,String[] mobile) {
		 
		   int j=0;
			List<WebElement> item =driver.findElements(By.cssSelector("h4.card-title"));
			
			for(int i=0;i<item.size();i++) {
				j++;
				
				System.out.println(driver.findElements(By.cssSelector("h4.card-title")).get(i).getText());
				
			     String[] mobname= item.get(i).getText().split(" ");
			     System.out.println(mobname[0]);
			     
			     // converting array into arryslist
			     
			      List moblist  =Arrays.asList(mobile);
			      
			      if(moblist.contains(mobname[0])) {
			    	  
			    	  driver.findElements(By.xpath("//div/button[@class='btn btn-info']")).get(i).click();
			    	   
			    	  if(j==item.size())
			    		  break;
			    	  
			      }
			     
			}
			
			
	 
		   
	   }
}
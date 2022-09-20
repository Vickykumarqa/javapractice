package salenium.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;

public class DynamicDrop {
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='PAT']")).click();    // xpath //a[@value='PAT']
		
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();   // dynamic x path with index // (a[@value='HYD'])[2]
		
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']    xpath for parent child class
		
	     driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click(); 
	     
		// to click the calender current date  blank space remove by the .
	     
	     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	     
	     // validation of ui element enable or disabled
	     
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
	    	
	    	System.out.println("its enabled");
	    	Assert.assertTrue(true);
	    }
	     
	    else {
	    	Assert.assertTrue(false);
	    }
	
	}
	

}

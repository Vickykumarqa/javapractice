package salenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2e {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Chennai")).click();// by partial using link text
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Hyderabad")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
				
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		WebElement sdrop=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(sdrop);
		dropdown.selectByVisibleText("USD");
		dropdown.selectByIndex(1);
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		driver.close();
	}
	

}

package salenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class StaticDropdown {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		// dropdown with select-tag  --- Static
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(staticdropdown);
		
		dropdown.selectByIndex(1);
	    System.out.println(dropdown.getFirstSelectedOption().getText());	
		
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption());
		//driver.close();
	    
		
	}

}

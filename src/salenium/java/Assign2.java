package salenium.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;



public class Assign2 {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("vicky kumar");
		driver.findElement(By.name("email")).sendKeys("kumarqwerty89@gmail.com");
		driver.findElement(By.cssSelector(".form-control")).sendKeys("vicky");
		driver.findElement(By.id("exampleCheck1")).click();
		
		//  to select static dropdown
		WebElement sdrop=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(sdrop);
		dropdown.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("11/11/2001");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("*.alert-success")).getText());
	
		driver.close();
		
		
		
		
		
	}

}

package salenium.java;

import java.time.Duration;
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

public class Amazon2 {
	
	public static void main(String args[]) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver, 5);
		// implicit wait
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // it is used globally
		
		String[] items = { "Almonds", "Cucumber", "Mango", "Cashews", "Apple", "Walnuts" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		//Thread.sleep(3000);
		// Amazon2 a = new Amazon2(); //1st method using conventional way
		// a.addItems(driver, items);

		addItems(driver, items); // 2nd method convert into static and without creating object we call the method

		// new Amazon2().addItems(driver, items); // 3rd way to create an object no need
		// to convert into static

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		// explicit wait
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
	
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();	
		
		// explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	  WebElement dropdown =  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]"));
		
		Select drop = new Select(dropdown);
		drop.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void addItems(WebDriver driver, String[] items) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			j++;

			// System.out.println(products.get(i).getText());

			// Cucumber - 1 kg into the Cucumber

			String[] name = products.get(i).getText().split("-"); // Cucumber + 1 kg

			String formmatedname = name[0].trim(); // Cucumber =Cucumber

			System.out.println(formmatedname);

			// converting array into arraylist to extract the name

			List itemlist = Arrays.asList(items);

			if (itemlist.contains(formmatedname)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == products.size())
					break;

			}

			// driver.findElement(By.xpath("//img[@alt='Cucumber - 1 Kg']")); // fail to
			// click cumcumber
			// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}

	}
  
}

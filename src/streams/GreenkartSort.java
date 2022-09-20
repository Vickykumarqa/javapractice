package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenkartSort {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th")).click();
		
		//capture all webelement into list
		
		List<WebElement> itemList=driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webElement into new (original) lists.
		
		List<String> originalList = itemList.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		// sort on the original list---> sorted List
		
		List<String> sortedList =originalList.stream().sorted().collect(Collectors.toList());
		
		/*System.out.println(sortedList);
		System.out.println(originalList);*/
		
		// compare original list vs sorted list
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		
		//scan the column name with getText() ->(then) Beans-> print the price of Beans
		do {
			List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
			price =list.stream().filter(s->s.getText().contains("Rice"))
					.map(s->getpriceveg(s)).collect(Collectors.toList());
			
			price.forEach(a->System.out.println(a));
			
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
		
	}

	private static String getpriceveg(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

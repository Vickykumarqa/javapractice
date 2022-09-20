package salenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HttpCert {

	public static void main(String args[]) {
		
		ChromeOptions opt= new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		FirefoxOptions opt1= new FirefoxOptions();
		
		System.setProperty("webdriver.chrome.driver","E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver","E:\\Shetty_selenium\\Driver\\geckodriver.exe");
		
		WebDriver driver= new ChromeDriver(opt);
		
		WebDriver driver1= new FirefoxDriver(opt1);
		
		driver.get("https://expired.badssl.com/");
		driver1.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver1.getTitle());
	}
}

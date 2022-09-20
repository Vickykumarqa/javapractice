package salenium.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shetty_selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
         System.out.println(url);
         
         //  To get the status code
         
        /*  HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
          conn.setRequestMethod("HEAD");
          conn.connect();
          int rescode =conn.getResponseCode();
          System.out.println(rescode); */
          
          
      List<WebElement> links  = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
      
      for(WebElement link:links) {
    	  
    	  String url1=link.getAttribute("herf");
    	  
    	 HttpURLConnection conn1= (HttpURLConnection) new URL(url1).openConnection();
    	 conn1.setRequestMethod("HEAD");
    	 conn1.connect();
    	 int rcode=conn1.getResponseCode();
    	 System.out.println(rcode);
    	 if(rcode>400) {
    		 
    		 System.out.println("the link with text"+link.getText()+"broken code is"+rcode);
    		 
    		 Assert.assertTrue(false);
    		 }
      }
      
    
      }
      private static Object getReturnCode(WebElement link) {

  		return null;

	}
	}

		



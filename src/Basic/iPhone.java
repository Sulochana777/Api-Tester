package Basic;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iPhone {
	
	     static WebDriver driver;
	     
	     private static void browser_launch() {

	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	     }
	      private  static void url_launch() {
	    	  driver.get("https://www.flipkart.com");
	    	  driver.manage().window().maximize();
	    	  
	    	  
	    	  
	    	  WebElement iphone = driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone')])[2]"));
	    	  iphone.click();
	    	  
	    	  
	    	  
	    	  

		}
	      public static void main(String[] args) {
	    	  browser_launch();
	    	  url_launch();
			
		}
	}



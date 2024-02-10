package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		


		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    
	    driver.navigate().to("https://www.instagram.com/");
	    driver.navigate().back();
	    driver.navigate().to("https://www.amazon.in/");
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.get("https://www.flipkart.com/");
	    
	    driver.close();
	    
	  	
		
	  
	
	
}
}

package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
	
	
		
		static WebDriver driver;
		
		private static void browser_launch() {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		
		}
		
		private static void url_launch() {
			driver.get("https://demo.automationtesting.in/Alerts.html");
	        driver.manage().window().maximize();
		}
		
		private static void simple_alert() {
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			driver.switchTo().alert().accept();

		}
		
		public static void main(String[] args) {
			browser_launch();
			url_launch();
			simple_alert();
			
			
		}
		
	
	
	
	

}

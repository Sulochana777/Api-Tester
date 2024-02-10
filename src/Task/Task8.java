package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
	
	
		static WebDriver driver;
		
		private  static void browserlaunch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
	
		}
		
		private static void url_launch() {
			driver.get("https://netbanking.kotak.com/");
			driver.manage().window().maximize();
		

		}

		
		  private static void login() {
			WebElement username= driver.findElement(By.id("userName"));
			username.sendKeys("sulosana8126@gmail.com");
			
			
			

		
		}
		  public static void main(String[] args) {
			  browserlaunch();
			  url_launch();
			  login();
			  
			
		}
}


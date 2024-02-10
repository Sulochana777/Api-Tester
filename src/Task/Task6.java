package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
	
        static WebDriver driver;
        
        
        private static void browserlaunch() {

        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    		
		}
        
        
		
		private static void geturl() throws InterruptedException {
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			
			

		}
        
		
		private static void login_page() {
			
			WebElement username= driver.findElement(By.name("username"));
			username.sendKeys("sulosana8126@gmail.com");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("8907788");
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			browserlaunch();
			geturl();
			login_page();
			
			
			
			
		}

}

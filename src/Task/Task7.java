package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	
	
        static WebDriver driver;
        
        
        private static void browserlaunch() {

        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
    		driver = new ChromeDriver();
    		
    		
		}
        
        
		
		private static void geturl() throws InterruptedException {
			driver.get("https://readylink.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			
			

		}
        
		
		private static void login_page() {
			driver.findElement(By.className(""))
			
	
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			browserlaunch();
			geturl();
			login_page();
			
		
			
			
			
			
		}

}

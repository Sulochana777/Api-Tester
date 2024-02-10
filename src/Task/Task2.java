package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(6000);
	
	driver.get("https://www.netflix.com/");
	driver.navigate().back();
	driver.navigate().forward();
	
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.close();
	
	
	
}

}

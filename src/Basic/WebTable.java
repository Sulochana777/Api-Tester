package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	static WebDriver driver;
	
	private static void browser_launch() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	
	}
	
	private static void url_launch() {
		driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
	}
	
	

}

package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	
	static WebDriver dirver;
	
	
static WebDriver driver;
	
	private static void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		

	}
	
	private  static void url_launch() {
		driver.get("https://open.spotify.com/");
		driver.manage().window().maximize();
		

	}
	
    private static void login_page() {
		
	  WebElement login = driver.findElement(By.className("ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set"));
	  login.click();
	
}
    
    public static void main(String[] args) {
    	browser_launch();
    	url_launch();
    	login_page();
	}

	
	

}

package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		
	      WebDriver driver = new ChromeDriver ();
	      
	      driver.navigate().to("https://www.jiomart.com/");
	      driver.manage().window().maximize();
	      
	      String title = driver.getTitle();
	      System.out.println(title);
	      driver.get("https://ticketnew.com/movies");
	      
	      driver.getCurrentUrl();
	      Thread.sleep(3000);
	      
	      driver.get("https://in.bookmyshow.com/");
	      driver.get("https://www.myntra.com/");
	      driver.navigate().back();
	      
	      Thread.sleep(2000);
	      
	      driver.getCurrentUrl();
	      driver.navigate().to("https://www.dmartindia.com/");
	      driver.navigate().back();
	      
	      
	      
	}
	
	

}

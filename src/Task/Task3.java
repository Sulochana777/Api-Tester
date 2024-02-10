package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver ();
	  driver.navigate().to("https://www.hotstar.com/");
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.myntra.com/");
	  driver.navigate().back();
	  Thread.sleep(3000);
	  
	  driver.navigate().to("https://www.dmartindia.com/");
	  driver.navigate().back();
	  driver.navigate().forward();
	  
	  Thread.sleep(2000);
	  
	  driver.get("https://ticketnew.com/movies");
	  
	  driver.get("https://in.bookmyshow.com/");
	  
	  driver.navigate().back();
	  driver.navigate().back();
	  driver.navigate().forward();
	  
	  
	  
	  
	  
	  
	
}

}

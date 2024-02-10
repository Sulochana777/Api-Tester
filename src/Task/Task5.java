package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.indiaglitz.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.swiggy.com/");
		driver.getCurrentUrl();
		
		driver.navigate().to("https://www.zomato.com");
		
		
		
	}
}

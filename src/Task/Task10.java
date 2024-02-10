package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	
	static WebDriver driver;
	
	private static void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		

	}
	
	private  static void url_launch() {
		driver.get("https://digitalselfcare.actcorp.in/");
		driver.manage().window().maximize();
		

	}
	
	private static void login_page() {
		
		WebElement ref = driver.findElement(By.className("btn btn-info btn-sm newbtn"));
		ref.click();
		
		WebElement logintype = driver.findElement(By.id("logintype"));
		logintype.sendKeys("sulosna8126@gmail.com");
		
		WebElement customername = driver.findElement(By.name("Customername"));
		customername.sendKeys("9876544");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}
	
	public static void main(String[] args) {
		browser_launch();
		url_launch();
		login_page();
		
		
	}

}

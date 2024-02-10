package Task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebok_Screenshot {
	
	static WebDriver driver;
	
	private static void browser_launch() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	
	}
	
	private static void url_launch() {
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
	}
	
	private static void login_page() throws InterruptedException {

	driver.findElement(By.id("email")).sendKeys("sulosana789@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("6789900");
	
	
	WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	
	Thread.sleep(3000);
	}
	
	private static void screenshot() throws IOException {
		
		TakesScreenshot f= (TakesScreenshot) driver;
		File from = f.getScreenshotAs(OutputType.FILE);
		File to = new File ("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\screenshot\\facebook.png");
		FileUtils.copyFile(from, to);
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		browser_launch();
		url_launch();
		login_page();
		screenshot();
		
		
	}
	

}

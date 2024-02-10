|package Basic;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class webelement {
	
	
	static WebDriver driver; // static variable------>
	private static void browerlaunch() {

   System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		}
	
	private static void url_launch() throws InterruptedException {
		driver.get("https://wwww.facebook.com/");
		driver.manage().window().maximize();
		
	Thread.sleep(7000);
	
		
		//setsize
	Dimension  d = new Dimension(750, 500);
	driver.manage().window().setSize(d);
	
	//setposition
Point p = new Point (500, 250);
driver.manage().window().setPosition(p);

	
	
		

	}
	private static void login_page() {
		WebElement email = driver.findElement(By.id("email")); //----we can change the ref name manually if you want 
		email.sendKeys("sulosana8126@gmail.com");
		
		WebElement pass= driver.findElement(By.name("pass"));
		pass.sendKeys("1234456");
		
		WebElement login = driver.findElement(By.className("selected"));
		login.click();
		
		
		
		
		

		
		
		
		
}
	
public static void main(String[] args) throws InterruptedException {
	browerlaunch();
	url_launch();
	login_page();
	

	
		

		
	}

}

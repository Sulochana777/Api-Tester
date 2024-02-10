package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	
	static WebDriver driver;
	
	private static void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver= new ChromeDriver()	;	

	}
	
	
	private static void url_launch() {
        driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        
	}
	
	private static void login_page1() {
       driver.findElement(By.id("username")).sendKeys("sulo1996");
       driver.findElement(By.name("password")).sendKeys("Sulo@123");
       driver.findElement(By.name("login")).click();
	}
	
	
	private static void login_page2() throws InterruptedException {
        WebElement location = driver.findElement(By.id("location"));
        Select s = new Select(location);
        s.selectByVisibleText("London");
        
        WebElement hotels = driver.findElement(By.id("hotels"));
        Select s1 = new Select (hotels);
        s1.selectByIndex(3);
        
        WebElement roomtype = driver.findElement(By.name("room_type"));
        Select s2 = new Select (roomtype);
        s2.selectByValue("Deluxe");
        
        WebElement roomno = driver.findElement(By.id("room_nos"));
        Select s3 = new Select (roomno);
        s3.selectByIndex(7);
        
        Thread.sleep(2000);
        
        WebElement checkindate = driver.findElement(By.xpath("(//input[@type='text']) [2]"));
        checkindate.clear();
        checkindate.sendKeys("1/2/2024");
        
        WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
        checkoutdate.clear();
        checkoutdate.sendKeys("3/2/2024");
       
        WebElement adultroom = driver.findElement(By.id("adult_room"));
        Select s4 = new Select (adultroom);
        s4.selectByVisibleText("4 - Four");
        
        WebElement child = driver.findElement(By.id("child_room"));
        Select s5 = new Select (child);
        s5.selectByIndex(2);
        
        driver.findElement(By.id("Submit")).click();
        
        Thread.sleep(3000);
  
          
	}
	
	
	    private static void login_page3() throws InterruptedException {
	    	
           driver.findElement(By.id("radiobutton_0")).click();
           
           driver.findElement(By.name("continue")).click();
           
           Thread.sleep(1000);
           
		}
	   
	    private static void book_now() throws InterruptedException {
	    	
	      driver.findElement(By.name("first_name")).sendKeys("Sulochana");
	      
	      driver.findElement(By.name("last_name")).sendKeys("Sundaravadivelu");
	      
	      driver.findElement(By.name("address")).sendKeys("No 14, KAS Nagar, Karungalpalayam, Erode - 3");
	      
	      driver.findElement(By.id("cc_num")).sendKeys("4576 8908 7865 3456");
	      
	      Thread.sleep(2000);
	      
	      WebElement cctype = driver.findElement(By.name("cc_type"));
	      Select s6 = new Select (cctype);
	      s6.selectByIndex(3);
	      
	      WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
	      Select s7 = new Select (expirymonth);
	      s7.selectByVisibleText("April");
	      
	      WebElement expiryyear = driver.findElement(By.name("cc_exp_year"));
	      Select s8 = new Select (expiryyear);
	      s8.selectByVisibleText("2026");
	      
	      driver.findElement(By.name("cc_cvv")).sendKeys("345");
	      
	      driver.findElement(By.id("book_now")).click();
	      
	      Thread.sleep(10000);
	      
	      //driver.findElement(By.xpath("(//input[@type='button']) [2]")).click();
	      
	      driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
	      	
          Thread.sleep(3000);
		}
	
	public static void main(String[] args) throws InterruptedException {
		browser_launch();
		url_launch();
		login_page1();
		login_page2();
		login_page3();
		book_now();
	}

}

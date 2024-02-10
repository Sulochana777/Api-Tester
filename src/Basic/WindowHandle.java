package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	static WebDriver driver;
	static String windowHandle;
	
 private static void browser_launch() {
	 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
	}
 
 private static void url_launch() {
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	 driver.manage().window().maximize();
	 
   
}
    private static void first_Window() {
	  windowHandle = driver.getWindowHandle();
	  System.out.println(windowHandle);
	  driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

}
    // using set
    //private static void All_Window() {
    	//Set<String> windowHandles = driver.getWindowHandles();
    	//System.out.println(windowHandles);
    	//for (String x : windowHandles) {  //--- using for each to compare the 2 id numnbers 
    		
    		//if (!x.equals(windowHandle)) {  // -- using if condition for equals
				//driver.switchTo().window(x);
				//driver.manage().window().maximize();
			//}
    		
	
     //	using list
    
    List<String> all
    		
    
    		
    		
		}

	}
 
 

 
 public static void main(String[] args) {
	browser_launch();
	url_launch();
	first_Window();
	All_Window();
}





}





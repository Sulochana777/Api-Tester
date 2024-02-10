package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	static WebDriver driver;
	static Integer minprice;

	private static void browser_launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	private static void url_launch() {

		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();

	}

	private static void totalNumberOfProducts() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		int size = allProducts.size();
		System.out.println("Total number of Products =" + size);

		for (WebElement product : allProducts) {
			System.out.println(product.getText());

		}

	}

	private static void lowestPriceAmongAllProducts() {
		List<Integer> priceList = new ArrayList();

		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));

		for (WebElement price : allPrices) {
			String priceText = price.getText();
			System.out.println(priceText); // Rs.649
			Integer priceInt = Integer.valueOf(priceText.replace("Rs. ", ""));
			priceList.add(priceInt);

		}

		minprice = Collections.min(priceList);
		System.out.println("Lowest price is: " + minprice);

	}

	private static void Lowestprice_productname() {
		WebElement productName = driver.findElement(By.xpath("//span[@class='product-discountedPrice' and text() ="
				+ minprice + "]//ancestor::div[@class='product-productMetaInfo']/h3"));
		System.out.println("ProductName of Lowest Price:  " + productName.getText());

	}

	public static void main(String[] args) {
		browser_launch();
		url_launch();
		totalNumberOfProducts();
		lowestPriceAmongAllProducts();
		Lowestprice_productname();

	}
}

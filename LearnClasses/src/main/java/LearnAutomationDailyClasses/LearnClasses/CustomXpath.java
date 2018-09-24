package LearnAutomationDailyClasses.LearnClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		//Dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.ebay.com/");
		
//********************************************************************************************************
		//http://learn-automation.com/how-to-write-dynamic-xpath-in-selenium/
		//Read out the above link of Mukesh you will genius about the Xpath
		
//*********************************************************************************************************		
		
		//General Xpath methods
		//Note: 
		// 1. Alwasy Xpath start with "//".
		// 2. After "//" we need to pick the HTML tag for that particular field.
		// 3. Then write tag name and make[].
		// 4. if we are not using any defined method then we need to use "=" sign.
		
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Mobile");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobile");
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobile");

		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Mobile");

		driver.findElement(By.xpath("//li[@class='saved']")).click();
		
		
		

		
		// Contains Method
		
			//Note: 
				// 1. Alwasy Xpath start with "//".
				// 2. After "//" we need to pick the HTML tag for that particular field.
				// 3. Then write tag name and make[].
				// 4. While using any method either it's contain or any other we will not use = sign.
		
		
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Mobile");

		//With the contains method we can use all the properties same as above.
		//We can use more methods inside the contains method like "text()". see below example.
		
		//driver.findElement(By.xpath("//a[contains(text(),'Collectibles & Art')]")).click();
		
		
		
		
		
		//Dynamic ID handler xpath methods ***Most Important***.

		//strarts-with
		
//Note:
		//1. Generally these methods used when the id changes at runtime for the particular element, like when we refreshs the page
		//   it changes. So we makes the pattern in such type of cases.
		
		// Ex.  ids are...
		
		// test_123               refresh the page it changes as the next one
		// test_345				again refresh the page it changes as the next one
		// test_556
		
		//driver.findElement(By.xpath("//a[starts-with(@id,'test_')]")).click();
		
		
		//ends-with
		
		// Ex.  ids are...
		
				// 123_test_t               refresh the page it changes as the next one
				// 345_test_t			again refresh the page it changes as the next one
				// 556_test_t
				
		//driver.findElement(By.xpath("//a[ends-with(@id,'_test_t')]")).click();
		
		
		
		
		
		
		
		
	}

}

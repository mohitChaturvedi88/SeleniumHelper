package LearnAutomationDailyClasses.LearnClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		//Dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// Start application
				driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

				// Click on timer button to start
				driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

				// Create object of WebDriverWait class and it will wait max of 20 seconds.
				// By default it will accepts in Seconds
				WebDriverWait wait = new WebDriverWait(driver, 20);

				// Here we will wait until element is not visible, if element is visible then it will return web element
				// or else it will throw exception
				WebElement element = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

				// if element found then we will use- In this example I just called isDisplayed method
				boolean status = element.isDisplayed();

				// if else condition
				if (status) { 
					System.out.println("===== WebDriver is visible======");
				} else {
					System.out.println("===== WebDriver is not visible======");
				}

			driver.quit();
	}
	
}

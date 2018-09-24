package LearnAutomationDailyClasses.LearnClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Other {


	public static void main(String[] args) {
		
			 
			System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); 
			
			driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
			driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
			
			boolean status = element.isDisplayed();
			
			if(status) {
				System.out.println(element.getText());
				
			}else 
				System.out.println("Element not visible");
			
	}

}

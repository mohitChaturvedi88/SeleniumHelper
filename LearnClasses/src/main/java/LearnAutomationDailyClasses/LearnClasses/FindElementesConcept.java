package LearnAutomationDailyClasses.LearnClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementesConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		//Dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://amazon.in/");
		
		//**********
		//Q.1 Print all the links count available on the page.
		//Q.2 Print all the link's text showing on the same page.
		//**********
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//Size of linklist.
		
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			String linktext = linklist.get(i).getText();
			
			System.out.println(linktext);
			
		}

	}

}

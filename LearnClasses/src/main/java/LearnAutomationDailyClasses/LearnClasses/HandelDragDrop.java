package LearnAutomationDailyClasses.LearnClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelDragDrop {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); 
			
			//Dynamic waits
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			driver.get("https://www.geniuspay.se/");
			//driver.get("http://jqueryui.com/droppable/");
			//driver.navigate().to("http://jqueryui.com/droppable/");;
			
			driver.switchTo().frame(0);
			Actions action = new Actions(driver);
			
			action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
			action.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

			
		}

}

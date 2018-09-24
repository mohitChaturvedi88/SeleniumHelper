package LearnAutomationDailyClasses.LearnClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelMouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driver.get("http://www.spicejet.com/");
		
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.findElement(By.linkText("Seat + Meal Combo")).click();*/
		
			Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		
		Thread.sleep(500);
	 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceCash/SpiceClub Members')]"))).build().perform();
	 Thread.sleep(500);
	driver.findElement(By.linkText("Member Login")).click();
	 Thread.sleep(3000);
	 driver.quit();
	
	}

}

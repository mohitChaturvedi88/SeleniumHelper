package LearnAutomationDailyClasses.LearnClasses;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	

	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
			
			driver.findElement(By.name("username")).sendKeys("MohitCh");
			driver.findElement(By.name("password")).sendKeys("mohitjichrome");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).submit();
			
			driver.switchTo().frame("mainpanel");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			
			driver.quit();
		}

	

}



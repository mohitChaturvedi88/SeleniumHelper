package LearnAutomationDailyClasses.LearnClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TakeScreenShotConcept {

	 @Test
	public void CaptureScreenshot() {
		System.setProperty("webdriver.gecko.driver","D:/Automation/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		//Dynamic waits
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("Mohit is taking Screenshot");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		System.out.println("this is my path" +ts);
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		 
		System.out.println("this is my path" +source);
		
		try {
			FileUtils.copyFile(source, new File("./Screenshots/"+System.currentTimeMillis()+".png"));
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("********************Scrrenshot taken******************************");
		
		driver.quit();
	
	}
}

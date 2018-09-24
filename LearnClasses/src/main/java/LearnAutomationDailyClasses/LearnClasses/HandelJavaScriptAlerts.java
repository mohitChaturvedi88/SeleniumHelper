package LearnAutomationDailyClasses.LearnClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelJavaScriptAlerts {

	

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","D:/Automation/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			driver. get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.name("proceed")).click();
			
			Thread.sleep(5000);
			
			Alert alert = driver.switchTo().alert();
			String alerttext = alert.getText();
			
			if(alerttext.equals("Please enter a valid user name")) {
				System.out.println("Correct Message");
			}else {
				System.out.println("Wrong Message");
			}
			
			alert.accept();
				
			Thread.sleep(3000);
			driver.quit();
		}


}

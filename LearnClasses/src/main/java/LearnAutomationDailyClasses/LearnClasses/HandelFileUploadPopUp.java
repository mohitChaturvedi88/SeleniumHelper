package LearnAutomationDailyClasses.LearnClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("D:\\MyData\\Songs\\Atif Aslam Hit Songs-320Kbps songs");
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Mohit\\Downloads\\1530718084558_Mohit+Chaturvedi+Payslip+June+18");

		Thread.sleep(5000);
		
		driver.quit();
		

	}

}

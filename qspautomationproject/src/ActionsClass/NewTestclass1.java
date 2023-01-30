package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestclass1 {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/Selenium%20playlist/HTML/A.html"); 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Maruti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your last name']")).sendKeys("Kolavale");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hare krishna");
		Thread.sleep(2000);
	
	}
}

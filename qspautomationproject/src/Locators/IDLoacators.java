package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLoacators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/webpage.html");
	Thread.sleep(3000);
	driver.findElement(By.id("i1")).sendKeys("admin");
	driver.findElement(By.id("i2")).sendKeys("manager");
	Thread.sleep(3000);
	driver.close();
	

	}

}

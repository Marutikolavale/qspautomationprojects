package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeSurch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.id("search")).sendKeys("marathi dj song");
	driver.findElement(By.id("search-icon-legacy")).click();
	}
}

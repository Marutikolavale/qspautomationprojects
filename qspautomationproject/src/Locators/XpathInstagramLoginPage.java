 package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInstagramLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@ name =username]")).sendKeys("Marutikolavale");
	driver.findElement(By.xpath("//input[@name=password]")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@class='\"sqdOP  L3NKy   y3zKF     \"]'")).click();
	}

}

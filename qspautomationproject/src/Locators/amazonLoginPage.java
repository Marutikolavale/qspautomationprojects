package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-orders")).click();
		driver.findElement(By.id("ap_email")).sendKeys("+917028853617");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Pass@123");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenevo Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}

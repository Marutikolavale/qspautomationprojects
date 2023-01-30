package Assingment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(4000);
		WebElement drag = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions c=new Actions(driver);
		c.moveToElement(drag).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body[contains(@ class,'p')]")).click();
		driver.quit();
	}

}

package Assingment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement drag = driver.findElement(By.xpath("//span[@data-p='offers,m']"));
		Actions b=new Actions(driver);
		b.moveToElement(drag).perform();
		driver.findElement(By.xpath("//span[text()='Additional 50% Off on your 1st Installment on GMS']")).click();
	//	driver.findElements();
	}

}

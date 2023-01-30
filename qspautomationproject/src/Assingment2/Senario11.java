package Assingment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		WebElement drag = driver.findElement(By.xpath("//span[@data-p='offers,m']"));
		Actions a=new Actions(driver);
		a.moveToElement(drag).perform();
		driver.findElement(By.xpath("//span[text()='Flat 15% off on MRP']")).click();
		Thread.sleep(4000);
		WebElement drag1 = driver.findElement(By.xpath("//span[@data-p='offers,m']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(drag1).perform();
		driver.findElement(By.xpath("//span[text()='10% Making Charges Off on Plain Gold Jewellery']")).click();
		List<WebElement> list = driver.findElements(By.id("grid-view-result"));
		for(WebElement d:list)
		{
			String f=d.getText();
			System.out.println(f);
		}
driver.quit();
	}

}

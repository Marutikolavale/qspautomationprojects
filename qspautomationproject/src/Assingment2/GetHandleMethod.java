package Assingment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		String pareantHandle=driver.getWindowHandle();
		Set<String> allHandle = driver.getWindowHandles();
for(String wh:allHandle)
{
	if(!pareantHandle.equals(wh))
	{
	driver.switchTo().window(wh);
	}
	else
	{
		
	}
	}
driver.findElement(By.xpath("//a[.='128 GB']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();

driver.quit();
	}

}

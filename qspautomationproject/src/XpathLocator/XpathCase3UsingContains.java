package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3UsingContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'phone ')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(3000);
		WebElement targetMouseHover = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act=new Actions(driver);
		act.moveToElement(targetMouseHover).perform();
	}

}

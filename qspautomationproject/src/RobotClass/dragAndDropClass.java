package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		WebElement src = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		act.doubleClick(src).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(3000);
		WebElement terget = driver.findElement(By.xpath("//input[@type='search']"));
		act.moveToElement(terget).perform();
robot.keyPress(KeyEvent.VK_V);		
robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		driver.quit();

	}

}

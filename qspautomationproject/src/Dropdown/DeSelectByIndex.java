package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwonelement =driver.findElement(By.id("menu"));
		Select sel=new Select(dropdwonelement);
		sel.selectByIndex(5);
		Thread.sleep(400);
		sel.deselectByIndex(5);
		Thread.sleep(4000);
		driver.quit();
	}

}

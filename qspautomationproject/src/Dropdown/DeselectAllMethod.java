package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAllMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		Thread.sleep(3000);
		WebElement dropdownelement=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		for(int i=2;i<=8;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		sel.deselectAll();
		Thread.sleep(4000);
		driver.quit();
	}

}

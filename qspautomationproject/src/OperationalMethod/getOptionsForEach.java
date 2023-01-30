package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptionsForEach {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement drop = driver.findElement(By.id("menu"));
		Select sel = new Select(drop);
	List<WebElement> options = sel.getOptions();
		for(WebElement option: options)
		{
			String value = option.getText();
			System.out.println(value);
		}
		driver.quit();
	}
}

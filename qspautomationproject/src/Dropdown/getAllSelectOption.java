package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver  =	new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwon = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdwon);
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement> allops = sel.getAllSelectedOptions();
		for(WebElement we: allops)
		{
			String text = we.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}

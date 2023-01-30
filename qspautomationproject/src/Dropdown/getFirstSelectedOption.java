package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		WebElement Firstopt = sel.getFirstSelectedOption();
		String text = Firstopt.getText();
		System.out.println(text);
	}

}

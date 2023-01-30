package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwonelement =driver.findElement(By.id("menu"));
		Select sel =new Select(dropdwonelement);
		List<WebElement> Options = sel.getOptions();
		for(int i=0;i<Options.size();i++)
		{
			WebElement Option= Options.get(i);
			String value=Option.getText();
			System.out.println(value);
		}

		driver.quit();
	}

}

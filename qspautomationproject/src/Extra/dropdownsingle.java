package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsingle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(2000);
		WebElement webelement = driver.findElement(By.id("input-country"));
		Select dropdown=new Select(webelement);
		//dropdown.selectByVisibleText("India");
		//dropdown.selectByValue("96");
		dropdown.selectByIndex(99);
		if(dropdown.isMultiple())
		{
		System.out.println("true");
		}
		else
		{
			System.out.println("false");	
		}
		Thread.sleep(5000);
		driver.quit();
		
	}

}

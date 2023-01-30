package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver .manage().window().maximize();
	driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/singledropdown.html");
	Thread.sleep(4000);
	WebElement dropdownelent=driver.findElement(By.id("menu"));
	Select sel=new Select(dropdownelent);
	sel.selectByValue("v10");
	Thread.sleep(2000);
	driver.quit();
	

	}

}

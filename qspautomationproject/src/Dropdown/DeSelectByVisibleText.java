package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/Selenium%20playlist/HTML/multipledropdwon.html");
		WebElement dropdownelement=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		sel.selectByVisibleText("Paratha");
		Thread.sleep(4000);
		sel.deselectByVisibleText("Paratha");
		Thread.sleep(4000);
		driver.quit();

	}

}

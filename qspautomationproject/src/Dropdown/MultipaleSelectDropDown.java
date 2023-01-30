package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipaleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
	WebElement dropdownelement=driver.findElement(By.id("menu"));
	Select sel =new Select(dropdownelement);
	for(int i=0;i<=8;i++) 
	{
		sel.selectByIndex(i);
		Thread.sleep(2000);
	}
	
	
	}

}

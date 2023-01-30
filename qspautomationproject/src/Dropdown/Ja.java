package Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ja {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("Users/mbkol/OneDrive/Desktop/Selenium%20playlist/HTML/multipledropdwon.html");
	}
}

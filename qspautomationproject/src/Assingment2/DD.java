package Assingment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://laptop-3uoig6jh/login.do");
	}

}


package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
	}


}

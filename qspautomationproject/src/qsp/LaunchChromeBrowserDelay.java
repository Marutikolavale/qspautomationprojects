package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowserDelay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();//open the Chrome browser
	driver.get("http://www.instagram.com");//lunch the web app
		Thread.sleep(10000);// provide delay 10  sec
		driver.close();
		}	
	}

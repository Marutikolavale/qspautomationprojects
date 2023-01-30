package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	new ChromeDriver();//open the Chrome browser
	}	
}

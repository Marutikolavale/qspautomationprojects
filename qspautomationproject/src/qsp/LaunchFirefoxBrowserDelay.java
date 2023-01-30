package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowserDelay {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("http://www.instagram.com");
Thread.sleep(10000);
 driver.close();
	}

}

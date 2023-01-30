package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.quit();

	}

}

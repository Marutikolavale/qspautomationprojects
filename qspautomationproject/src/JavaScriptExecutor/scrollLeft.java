package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollLeft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(2000);
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(-10000,0)");
		Thread.sleep(2000);
		driver.quit();
	}

}

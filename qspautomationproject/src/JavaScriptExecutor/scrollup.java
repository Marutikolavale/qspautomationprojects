package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}

}

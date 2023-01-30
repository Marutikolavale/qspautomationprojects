package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Stopwatch watch=null;
		try {
			watch=Stopwatch.createStarted();
		driver.findElement(By.linkText("START SELLING")).click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+"  second");
		}
		driver.quit();
	}

}

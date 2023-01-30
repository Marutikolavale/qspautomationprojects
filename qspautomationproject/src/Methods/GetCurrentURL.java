package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 Thread.sleep(5000);
		 String CurrentUrl = driver.getCurrentUrl();
		 System.out.println(CurrentUrl);
		 driver.quit();
	}

}

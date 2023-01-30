package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/checkbox.html");
		String  SourceCodeOfTheWebPage = driver.getPageSource();
		 System.out.println(SourceCodeOfTheWebPage);
		 Thread.sleep(5000);
		 driver.close();
	}

}

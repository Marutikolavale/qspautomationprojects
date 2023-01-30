package Extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLInkAndCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement> webelement = driver.findElements(By.tagName("a"));
		System.out.println("totol link on the webpage:"+webelement.size());
		driver.quit();
		for(WebElement H:webelement)
		{
			System.out.println(H.getText());
			Thread.sleep(1000);
		}
	}

}

package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
Dimension targetSize= new Dimension(450,250);
driver.manage().window().setSize(targetSize);

	}
}

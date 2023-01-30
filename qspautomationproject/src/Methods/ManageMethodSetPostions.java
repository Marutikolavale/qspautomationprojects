package Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPostions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Point targetPosition =new Point(50,25);
	driver.manage().window().setPosition(targetPosition);
	driver.get("https://google.com");
	}
}

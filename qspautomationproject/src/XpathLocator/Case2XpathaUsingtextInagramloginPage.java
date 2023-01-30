package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2XpathaUsingtextInagramloginPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	driver.findElement(By.xpath("//input[text()='Phone number, username, or email'")).sendKeys("Marutikolavale");
	}

}

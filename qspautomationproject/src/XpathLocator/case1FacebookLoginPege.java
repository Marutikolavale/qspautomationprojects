package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1FacebookLoginPege {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7028853617");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9011439195");
driver.findElement(By.xpath("//button[@ id='loginbutton']")).click();
	}

}

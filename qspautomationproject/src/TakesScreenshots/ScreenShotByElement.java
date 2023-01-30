package TakesScreenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotByElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement imgAddress = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		File scr=imgAddress.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/F6.png");
		Files.copy(scr, dest);
		driver.quit();

	}

}

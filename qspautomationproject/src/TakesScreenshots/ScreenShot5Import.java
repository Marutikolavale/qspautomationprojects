package TakesScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot5Import {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/E5.png");
		Files.copy(scr, dest);
		driver.quit();

	}

}

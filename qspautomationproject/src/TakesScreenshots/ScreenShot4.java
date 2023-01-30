package TakesScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShot4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File scr=efw.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/D4.png");
		Files.copy(scr, dest);
		driver.quit();

	}

}

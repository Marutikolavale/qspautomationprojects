package pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest  implements IAutoConstant{
	static WebDriver driver;
	
	public void setUp() throws IOException 
	{
		Flib flib=new Flib();
		String Url = flib.readPropertyFile("./data/config.properties", "Url");
		String BrowserValue = flib.readPropertyFile("./data/config.properties","Browser");

		if(BrowserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
		else if(BrowserValue.equalsIgnoreCase("fierFox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
		else
		{
			System.out.println("Enter crroct Choice");
		}


	}
	public void tearDown()
	{
		driver.quit();
	}
}

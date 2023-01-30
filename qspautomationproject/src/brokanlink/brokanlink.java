package brokanlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokanlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(null);	
	List <WebElement> linklist=driver.findElements(null);
	int resCode=200;
	
	for(WebElement w:linklist)
	{
        String Url =w.getAttribute("");
        try
        {
        	URL link= new URL(Url);
       HttpURLConnection huc= (HttpURLConnection) link.openConnection();
       huc.setRequestMethod("");
       huc.connect();
       huc.getRequestMethod();
        }
        catch(Exception e)
        {
        	
        }
	}
	}

}

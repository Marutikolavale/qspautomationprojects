package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
WebElement Dropdown = driver.findElement(By.id("menu"));
	
Select sel=new Select(Dropdown);
for(int i=0;i<=8;i++)
{
sel.selectByIndex(i);
Thread.sleep(1000);
	}
	}
}

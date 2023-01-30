package Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
WebElement dropdown = driver.findElement(By.id("menu"));
Select sel=new Select(dropdown);
sel.selectByIndex(1);
Thread.sleep(3000);
sel.deselectByIndex(1);
	}

}

package EliminateDuplicates;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSet1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwonelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdwonelement);
		//get a list of the element 
		List<WebElement> options = sel.getOptions();
		//declared a set to eliminate the duplicate
		HashSet<String>s = new HashSet<String>();
		//Read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			//add the text to set so that duplicate won't be accepted
			s.add(text);
		}
		//Read the set
		for(String se:s)
		{
			System.out.println(se);
		}
		driver.quit();
	}

}

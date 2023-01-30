package EliminateDuplicates;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwonelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdwonelement);
		//get the list of element
		List<WebElement> options = sel.getOptions();
		//declared  a set to eliminate the duplicate
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		//Read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement	ops=options.get(i);
			String text = ops.getText();
			//add the test to the set so that duplicates wont be accepted
			s.add(text);
		}
		for(String we:s)
		{
			System.out.println(we);
		}
		driver.quit();
	}

}

package EliminateDuplicates;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSet1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/mbkol/OneDrive/Desktop/HTML/multipledropdwon.html");
		WebElement dropdwon = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdwon);
		//get the element
		List<WebElement> options = sel.getOptions();
		//declireaed the set too so that eliminate the duplicate 
		TreeSet<String> s =new TreeSet<String>();
		//Read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			//add the text of the set so duplicates won't be accepted
			//Order will be alphabetically maintained
			s.add(text);
		}
		//Read the list for the set
		for(String we:s)
		{
			System.out.println(we);
		}
		driver.quit();
	}

}

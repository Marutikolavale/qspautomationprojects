package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTime {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser your choice");
		String browser=sc.nextLine();

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
		}
		else
		{
			System.out.println("Enter vaild input");
		}
	}
}

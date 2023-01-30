package Windowspopups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3uoig6jh/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("sizer")).click();
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Actions act=new Actions(driver);
		{
			WebElement traget = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
			act.doubleClick(traget).perform();

			File abs=new File("./autoitscripts/AAAA.exe");
			Thread.sleep(2000);
			String B = abs.getAbsolutePath();
			Runtime.getRuntime().exec(B);
			Thread.sleep(4000);
			Runtime.getRuntime().exec(B);
		}
		driver.quit();
	}

}

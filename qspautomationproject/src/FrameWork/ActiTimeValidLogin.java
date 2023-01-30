package FrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-3uoig6jh/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		//acccessing the generic reusable non static method by creating objact
		Flib flib=new Flib();
		//read the username
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreads", 1, 0);
		//read the password
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","Validcreads", 1, 1);
		//login operation
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		//driver.quit();
	}

}

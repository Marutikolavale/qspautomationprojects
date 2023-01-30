package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="//img[contains(@src,'timer')]")	private WebElement login;
	@FindBy(id="licenseLink") private WebElement licenseLink;


	//initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	//utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}

	//generic reusable method
	//for validcondtion
	public void actiTimevalidLogin(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();

	}
	//invalid Condition
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();

	}
}


//operation method
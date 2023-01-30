package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration

	@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutLink;
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement CreateNewtasks;
	@FindBy(xpath="//div[text()='Settings']")private WebElement Settings;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeBtn;
	//initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public WebElement getCreateNewtasks() {
		return CreateNewtasks;
	}
	public WebElement getSettings() {
		return Settings;
	}
	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}

	//operational method
	public void clickLogout()
	{
		LogoutLink.click();
	}
	public void ClickSaveLeaveTimeBtn()
	{
		saveLeaveTimeBtn.click();
	}























}

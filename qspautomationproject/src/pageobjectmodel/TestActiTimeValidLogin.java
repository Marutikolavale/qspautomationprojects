 package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends Basetest {

	public static void main(String[] args) throws IOException, InterruptedException {
		Basetest bt = new Basetest();
		bt.setUp();
		Thread.sleep(3000);
		Flib flib=new Flib();
		String validUsername1 = flib.readPropertyFile("./data/config.properties","username");
		String validPassword1 = flib.readPropertyFile("./data/config.properties","password");

		
		LoginPage lp=new LoginPage(driver);
		lp.actiTimevalidLogin(validUsername1, validPassword1);
		Thread.sleep(3000);
		bt.tearDown();
	}

}

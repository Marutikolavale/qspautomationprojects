package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeInvalidLogin extends Basetest {

	public static void main(String[] args) throws IOException, InterruptedException {

		Basetest bt = new Basetest();
		bt.setUp();
		Thread.sleep(3000);
		Flib flib=new Flib();
		LoginPage lp=new LoginPage(driver);
		//get the row count for loop
		int rc = flib.getRowCount(EXCEL_PATH,"Invalidcreads");
		for(int i=0;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"Invalidcreads",i,0);
			String invalidPasswrod = flib.readExcelData(EXCEL_PATH,"Invalidcreads",i,1);
			//perfrom invalid lgoin
			lp.actiTimeInvalidLogin(invalidUsername, invalidPasswrod);
		}
		bt.tearDown();
	}
}

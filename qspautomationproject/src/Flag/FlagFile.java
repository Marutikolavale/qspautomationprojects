package Flag;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class FlagFile {
	@Test(groups="FT")
	public void FT1()
	{
		Reporter.log("FT1",true);
	}
	@Test(groups="IT")
	public void IT1()
	{
		Reporter.log("IT1",true);
	}
	@Test(groups="ST")
	public void ST1()
	{
		Reporter.log("ST1",true);
	}
	//--------------------------------------------------------------------
	@Test(groups="FT")
	public void FT2()
	{
		Reporter.log("FT2",true);
	}
	@Test(groups="IT")
	public void IT2()
	{
		Reporter.log("IT2",true);
	}
	@Test(groups="ST")
	public void ST2()
	{
		Reporter.log("ST2",true);
	}
	//------------------------------------------------
	@Test(groups="FT")
	public void FT3()
	{
		Reporter.log("FT3",true);
	}
	@Test(groups="IT")
	public void IT3()
	{
		Reporter.log("IT3",true);
	}
	@Test(groups="ST")
	public void ST3()
	{
		Reporter.log("ST3",true);
	}
	//---------------------------------------------------
	@Test(groups="FT")
	public void FT4()
	{
		Reporter.log("FT4",true);
	}
	@Test(groups="IT")
	public void IT4()
	{
		Reporter.log("IT4",true);
	}
	@Test(groups="ST")
	public void ST4()
	{
		Reporter.log("ST4",true);
	}
	//---------------------------------
	@Test(groups="FT")
	public void FT5()
	{
		Reporter.log("FT5",true);
	}
	@Test(groups="IT")
	public void IT5()
	{
		Reporter.log("IT5",true);
	}
	@Test(groups="ST")
	public void ST5()
	{
		Reporter.log("ST5",true);
	}
	//--------------------------------------------
	@Test(groups="FT")
	public void FT6()
	{
		Reporter.log("FT6",true);
	}
	@Test(groups="IT")
	public void IT6()
	{
		Reporter.log("IT6",true);
	}
	@Test(groups="ST")
	public void ST6()
	{
		Reporter.log("ST6",true);
	}

}

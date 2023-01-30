package TestNGpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
@Test
@Parameters({"i","j"})
	public void add(int a,int b)
	{
		System.out.println("add:"+(a+b));
	}
@Test
@Parameters({"i","j"})
	public void sub(int a,int b)
	{
		System.out.println("sub:"+(a-b));
	}
@Test
@Parameters({"i","j"})
	public void mul(int a,int b)
	{
		System.out.println("mul:"+(a*b));
	}
}

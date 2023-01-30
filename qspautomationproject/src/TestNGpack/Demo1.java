package TestNGpack;

import org. testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void Method1() {
		Reporter.log("method1",true);
	}

	@Test
	public void Method2() {
		int a=0;
		System.out.println(9/a);
		Reporter.log("Method2",true);
	}

	@Test
	public void Method3() {
		Reporter.log("Method3",true);
	}

	@Test
	public void Method4() {
		Reporter.log("Method4",true);
	}
	@Test
	public void Method5() {
		Reporter.log("Method5",true);
	}


}

package TestNGBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterBasics2 {

	@Test
	public void login()
	{
		Reporter.log("Enter user name");
		Reporter.log("Enter pwd");
		Reporter.log("Click login button");
		Assert.assertEquals("Ram", "sita");//  fail		
	}
	

	@Test
	public void createOrder()
	{
		Reporter.log("Enter Product name");
		Reporter.log("Enter qty");
		Reporter.log("Add to cart");
		Reporter.log("Pay through Credit card");		
	}
	

}

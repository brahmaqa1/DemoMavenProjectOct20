package TestNGBasics;

import org.testng.annotations.Test;

public class testAnnonWithGroups2 
{
	//  priority 
	//  testng will run test methods based on group name 
	
	@Test(groups = "MobileTest")
	public void MobileTest()
	{
		System.out.println("calling MobileTest -2");
	}


	@Test(groups = "smoke")
	public void SmokeTest()
	{
		System.out.println("calling SmokeTest -2");
	}

	@Test(groups =  "regression")
	public void RegressionTest()
	{
		System.out.println("calling RegressionTest -2 from testAnnonWithGroups2 class ");
	}
	

}

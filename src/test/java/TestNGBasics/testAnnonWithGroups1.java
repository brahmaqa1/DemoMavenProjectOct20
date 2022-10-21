package TestNGBasics;

import org.testng.annotations.Test;

public class testAnnonWithGroups1 
{
	//  priority 
	//  testng will run test methods based on group name 
	
	@Test(groups = "MobileTest")
	public void MobileTest()
	{
		System.out.println("calling MobileTest");
	}


	@Test(groups = "smoke")
	public void SmokeTest()
	{
		System.out.println("calling SmokeTest from testAnnonWithGroups1 class");
	}

	@Test(groups =  "regression")
	public void RegressionTest()
	{
		System.out.println("calling RegressionTest");
	}
	
	@Test(groups = "MobileTest" )
	public void MobileTest2()
	{
		System.out.println("testAnnonWithGroups1 -calling MobileTest -2");
	}

}

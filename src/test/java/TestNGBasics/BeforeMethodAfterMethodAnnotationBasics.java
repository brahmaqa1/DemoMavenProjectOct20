package TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodAnnotationBasics {

	@BeforeMethod // gets excuted every time (multiple time)  before executing @Test method
	public void preCond()
	{
		System.out.println("@BeforeMethod gets excuted every time (multiple time)  before executing @Test method");
	}
	
	@Test
	public void testA()
	{
		System.out.println("Executing testA -");
	}

	@Test
	public void testB()
	{
		System.out.println("Executing testB-");
	}

	// HW add testC()  -- check the o/p:
	

	@AfterMethod  //  gets executed multiple times    after executing each @Test method
	public  void postcond() //  can write any order
	{
		System.out.println("@@AfterMethod  gets executed multiple times    after executing each @Test method");			
	}


}

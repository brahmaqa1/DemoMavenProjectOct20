package TestNGBasics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {

	//		public static void main(String[] args) {
	//			
	//			//   selenium code
	//			System.out.println("testing");
	//		}
	//	
	
	
	public void login()
	{
		//.............Selenium code 
		System.out.println("login");
	}

	@Test   // - Test Method
	public void testA()
	{
		System.out.println("calling testA ");
		// login : enter user, pwd, lcik login  -- only once
		//    other steps -- create order 
		//  logout 
		
		// TC2 :
		// login : enter user, pwd, lcik login 
				//    other steps -- delete order 
				//  logout 
			login();
		
	}
	
	
	
	// rt clikc on code > Run as 'testNG test' > 

}

//[RemoteTestNG] detected TestNG version 7.0.0
//calling testA 
//PASSED: testA
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
//
//
//===============================================
//Default suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================


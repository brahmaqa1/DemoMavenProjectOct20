package TestNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterBasics {

	@Test
	public void login()
	{
				System.out.println("Enter user name");
				System.out.println("Enter password");
				System.out.println("Click Login button");
				System.out.println("Home page is displayed sucesfully");
		// TestNG reports:
		//		2  types of reports  .
		// testNG will generate reports in "test-output" folder in project by default
		//  1. emailable-report.html
		// 2.index.html 

		//  Now if we want to send any user defined msgs in Test reports 
		// Reporter is predefined class in TestNg
		//  which has some method i.e log()  -  can be used send the given msg in Testng Reports (emailab;e report, index.html)
		Reporter.log("Enter user name");
		Reporter.log("Enter pwd");
		Reporter.log("Click login button");
		
		// Open all reports, check logged msgs 
		
				//or 
//		Reporter rep =  new Reporter();		
//		rep.log("Enter user name");
//		rep.log("Enter password");
//		rep.log("Click Login button");
//		rep.log("Home page is displayed sucesfully");

	}

}

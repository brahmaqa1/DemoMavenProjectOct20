package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC1 
{
	
	@Test
	public void testA()
	{
		// poi - jar , Selenium jar
		// Extent reports --  jar file 
		// import into project
//		add depe -
////	
//		<!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
//			<dependency>
//			    <groupId>com.relevantcodes</groupId>
//			    <artifactId>extentreports</artifactId>
//			    <version>2.41.2</version>
//			</dependency>
		//  to generate html  reports  in pie chart
		//  total test s passed / failed
		//  total execution time
		// start // end 
		//  who executes test///
		//  Pass- gree
		// Fail- red
		// pass given msgs in html reports
		ExtentReports exReports = new ExtentReports("C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\DemoMavenProject\\MyExtentReports\\MyhtmlExtentReports.html");
		ExtentTest exTest=  exReports.startTest("TC1: testA");
		          
		exTest.log(LogStatus.PASS, "1.Enter user name");
		//  send given status and msg  to html report
		// selenium code
		
		exTest.log(LogStatus.PASS, "2.Enter password");
		
		exTest.log(LogStatus.PASS, "3.clikc login btn");
		
		// send Fail status and some msg
		exTest.log(LogStatus.FAIL, "Login is failed");
		          
		System.out.println("ends");
		
		exTest.log(LogStatus.INFO, " info msg");
		//  HW :  Explore diff status - fatal , Error.
		
		
		
		//  tell html -- where we have to end report
		
		exReports.endTest(exTest);
		
		exReports.flush();// if we dont write, it does not genrate reports..
		
		
		//   after using flush(),,  it will not log any msgs if we try to log
		exTest.log(LogStatus.PASS, "check this stmt is coming html report");
		
		//**************** TC2 
		
		//  log TC2 steps 
		ExtentTest exTest2=  exReports.startTest("TC2: Create Employee");
		// logs
		exTest2.log(LogStatus.PASS, "TC2: Step1: ");
		exTest2.log(LogStatus.PASS, "TC2: Step2: ");
		
		exReports.endTest(exTest2);
		exReports.flush();
		
		
		// TC3 ----repeat all steps 
		
	}

}

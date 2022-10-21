package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC2 
{
	public ExtentReports exReports;
	public ExtentTest exTest;
	@BeforeTest	
	public void setup()
	{
		 exReports = new ExtentReports(".\\MyExtentReports\\MyhtmlExtentReports2.html");
		 exTest=  exReports.startTest("TC1: testA");
	}
		
	@Test
	public void testA()
	{
		
//		ExtentReports exReports = new ExtentReports("D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\SasiMavenProject\\MyExtentReports\\MyhtmlExtentReports.html");
//		ExtentTest exTest=  exReports.startTest("TC1: testA");
		          
		exTest.log(LogStatus.PASS, "1.Enter user name");		
		exTest.log(LogStatus.PASS, "2.Enter password");		
		exTest.log(LogStatus.PASS, "3.clikc login btn");		
		// send Fail status and some msg
		exTest.log(LogStatus.FAIL, "Login is failed");
		          
		System.out.println("test  A ends");
		
		exTest.log(LogStatus.INFO, " info msg");
		//  HW :  Explore diff status - fatal , Error.
	
//		
//		exReports.endTest(exTest);		
//		exReports.flush();// if we dont write, it does not genrate reports..
//		
		
	}
	
	
	@AfterTest
	public void endTest()
	{
		exReports.endTest(exTest);		
		exReports.flush();
	}

}

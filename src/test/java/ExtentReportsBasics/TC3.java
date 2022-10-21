package ExtentReportsBasics;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC3 
{
	public ExtentReports exReports;
	public ExtentTest exTest;
	@BeforeTest	
	public void setup()
//	public void setup(Method m)
	{
//		System.out.println("Calling TestMethodname= " + m.getName());
		 exReports = new ExtentReports(".\\MyExtentReports\\MyhtmlExtentReports3.html");
		 exTest=  exReports.startTest("TC2: testA");
	}
		
	@Test
	public void testB()
	{
		
//		ExtentReports exReports = new ExtentReports("D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\SasiMavenProject\\MyExtentReports\\MyhtmlExtentReports.html");
//		ExtentTest exTest=  exReports.startTest("TC1: testA");
		          
		exTest.log(LogStatus.PASS, "1.Enter user name");		
		exTest.log(LogStatus.PASS, "2.Enter password");		
		exTest.log(LogStatus.PASS, "3.clikc login btn");		
		// send Fail status and some msg
		exTest.log(LogStatus.FAIL, "Login is failed");
		          
		System.out.println("TC 3 ends");
		
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

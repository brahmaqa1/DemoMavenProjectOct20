package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ListenersTest implements ITestListener
{
	//  genreate report file name only once
	public ExtentReports exReports;
	public  static ExtentTest exTest;
	 
	public void onStart(ITestContext context) {
		System.out.println("on Start");
		// TODO Auto-generated method stub
		
	
		//Mon Jan 03 16:12:46 IST 2022.html
		Date d= new Date();		
		 System.out.println("da="+  d.toString().replace(":", "_").replace(" ", "_"));
		 // Mon Jan 03 1_12_46 IST 2022.html
		 //Mon_Jan_03_1_12_46_IST_2022.html
//			String fileName= ".\\MyExtentReports\\MyhtmlExtentReports" +d.toString().replace(":", "_").replace(" ", "_")+ ".html";
//			MyhtmlExtentReportsMon_Jan_03_16_16_19_IST_2022.html
		 String fileName = "MyhtmlExtentReports.html";
			System.out.println("Report File path= "+fileName);	
				exReports = new ExtentReports(fileName);
		 // gets executed only once  - so  res file willl be genearetd only once
//	
	}
	
	
	public void onTestStart(ITestResult result) {
		//   gets exuted
//		 exTest=  exReports.startTest("TC1: testA");
//		 get test case name
		 String TCName= result.getName();
		 exTest=  exReports.startTest(TCName);		 
		 System.out.println("startTest:  " +TCName );
	}
	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		exReports.endTest(exTest);		
		exReports.flush();
	
	}
	
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
}

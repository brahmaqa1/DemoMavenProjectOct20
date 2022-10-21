package Log4jBasics;

//import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class OptimsedLog4jTC2  extends TestBase
{

	@Test
	public void testA()
	{
		// TODO Auto-generated method stub
		
//		//		Logger  log =Logger.getLogger("devpinoyLogger");//  added in test base class		
//		TestBase tb= new TestBase();
////		tb.   /// ????
//		tb.log.info("testin thru obj creeation");
//		tb.log.info("check append");
//		
		log.info("*************** TC2: **************");
		log.info("TC2: check append");
//		log.info("Tc1: Enter user name");
		log.info("2.Enter pwd");		
		log.debug("3.Click login btn");		
		log.error("4.passing error");			
		System.out.println("ends");
	
	}

}

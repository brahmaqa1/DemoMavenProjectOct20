package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class OptimsedLog4jTC1 extends TestBase
{
	@Test
	public void testA()
	{
//		
//		Logger  log =Logger.getLogger("devpinoyLogger");//  added in test base class		
		//create object for testbase
		
		// way1:   access  log obj  from TestBase-class through Object creation
//		TestBase tb= new TestBase();
////		tb.   /// ????
//		tb.log.info("testin thru obj creeation");
//		tb.log.info("check append");
		
		
		//  way2 :  get log var ffrom TestBase-class through Inheritance
		log.info("*************** TC1: **************");
		log.info("Tc1: Enter user name");
		log.info("2.Enter pwd");		
		log.debug("3.Click login btn");		
//		log.error("4.passing error");			
		System.out.println("ends");
	
	}

}

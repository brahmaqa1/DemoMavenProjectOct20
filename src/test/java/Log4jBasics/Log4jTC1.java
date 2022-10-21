package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTC1 {

	@Test
	public void testA()
	{
		// TODO Auto-generated method stub
		
//		Logger log=Logger.getLogger("devpinoyLogger");
		Logger  log =Logger.getLogger("devpinoyLogger");		
	//  can w use diff name other than devpinoyLogger..
//		Logger  log =Logger.getLogger("Brahma"); //  not getting manual.logs file
		
		log.info("check append");
		log.info("Tc1: Enter user name");
		log.info("2.Enter pwd");		
		log.debug("3.Click login btn");		
		log.error("4.passing error");			
		System.out.println("ends");
	
	}

}

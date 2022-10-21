package Test2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages2.LoginPage;



public class LoginPageTestTC1 {
	
	@Test
	public void loginPageTest()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();

		// open given url ib browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
		// added come commny by tester-2 
		LoginPage lp = new LoginPage(driver);
		lp.enter_userName("Admin");
		lp.enter_Password("admin123");		
		lp.click_LoginBtn();
	}

}

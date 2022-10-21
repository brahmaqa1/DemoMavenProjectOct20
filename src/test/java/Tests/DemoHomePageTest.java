package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;

public class DemoHomePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();

		// open given url ib browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20L));
		
		LoginPage lp = new LoginPage(driver);
		lp.enter_userName("Admin");
		lp.enter_Password("admin123");		
		lp.click_LoginBtn();
		
		
		HomePage hp =  new HomePage(driver);
		hp.HomePage_Displayed();
		hp.navigate_Admin();
		

	}

}

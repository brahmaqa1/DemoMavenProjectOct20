package OranngeHRMSPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		// create obj for chromedriver class
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open given url in browser
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		WebDriverWait  wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(@class,'userdropdown')]")));
				
		if(driver.findElement(By.xpath("//p[contains(@class,'userdropdown')]")).isDisplayed())
		{
			System.out.println("Login is succesfull");
		}
		else
		{
			System.out.println("Fail.Login is  not succesfull");
		}
		
		
		
		

	}

}

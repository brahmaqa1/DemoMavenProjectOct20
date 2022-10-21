package OrangrHRMsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResetUserTC8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();

		// open given url ib browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);


		//		Username : Admin
		//		Password : admin123
		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		// click Login button
		driver.findElement(By.xpath("//button")).click();

		boolean  res= 		driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed();

		if(res == true)
		{
			System.out.println("Home page is displayed succesfully");
		}

		else
		{
			System.out.println("Home page is not displayed ");
		}


		// TC2 :  create employee
		System.out.println("click Admin button");
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(5000);

		//label[text()='Username']/../following-sibling::div/input
		String username = "Admin";
		System.out.println("Enter User name");
		driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div/input")).sendKeys(username);
		
		System.out.println("Click Reset button");
		driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
		
		System.out.println("verify values are reset by default ");
		
		String valFromUserName = driver.findElement(By.xpath("//label[text()='Username']/../following-sibling::div/input")).getText();
		
		if(valFromUserName.equals(""))
		{
			System.out.println("Pass.Username textbox valus is empty. valFromUserName=" +valFromUserName);
		}
		else
		{
			System.out.println("Username textbox value is not empty.valFromUserName =" +valFromUserName);
		}
		
		Thread.sleep(9000);
		// get selected Value from USer Role
		//label[text()='User Role']/../following-sibling::div//div//div[@class='oxd-select-text-input']
		String selectedValFromUSerRole = driver.findElement(By.xpath("//label[text()='User Role']/../following-sibling::div//div//div[@class='oxd-select-text-input']")).getText();
		System.out.println("selectedValFromUSerRole =" +selectedValFromUSerRole);
			
		
		
		String valFromEmployeeName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).getAttribute("value");
		System.out.println("valFromEmployeeName =" +valFromEmployeeName);
			
		String Status = driver.findElement(By.xpath("//label[text()='Status']/../following-sibling::div//div//div[@class='oxd-select-text-input']")).getText();
		System.out.println("Status =" +Status);
		System.out.println("ends");

	}

}

package OrangrHRMsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateEmployeeTC2 {

	@Test
	public void createEmployeeTC2() throws InterruptedException 
//	public static void main(String[] args) throws InterruptedException 
	{
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

		// Click add button
		System.out.println("Click add button");
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button[@type='button']")).click();

		boolean res2 = driver.findElement(By.xpath("//h6[text()='Add User']")).isDisplayed();

		if(res2)
		{
			System.out.println("Add user page is displayed");
		}
		else
		{
			System.out.println("Add user page is not  displayed");
		}


		//
		System.out.println("click Dropdown");
		driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div")).click();

		System.out.println(" Select 'Admin ' in litsbox");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='ESS']")).click();

		System.out.println("Select Status");
		///   //label[text()='Status']/parent::div/following-sibling::div   - ok
		driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div")).click();
		//label[text()='Status']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='Enabled']

		driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='Enabled']")).click();

		System.out.println("Sleect Employee Name");
		//label[text()='Employee Name']/parent::div/following-sibling::div//input
		driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input")).sendKeys("Orange");
		Thread.sleep(6000);
		//	driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input/../following-sibling::div[@role='listbox']//*[text()='Orange Test']")).click();

		//		driver.findElement(By.xpath("//*[text()='Orange  Test']")).click();
		int cnt=		driver.findElements(By.xpath("//div[@role='listbox']//*[text()='Orange  Test']")).size();

		System.out.println("cnt- " +  cnt);
		driver.findElements(By.xpath("//div[@role='listbox']//*[text()='Orange  Test']")).get(0).click();

		System.out.println("Select Username");
		//label[text()='Username']/parent::div/following-sibling::div//input

		String userName = "Rama2a1";
		driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div//input")).sendKeys(userName);

		System.out.println("Enter password");
		//label[text()='Password']/parent::div/following-sibling::div//input
		driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div//input")).sendKeys("Rama@123321");

		System.out.println("Enter Confirm Password");
		//label[text()='Confirm Password']/parent::div/following-sibling::div//input
		driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div//input")).sendKeys("Rama@123321");


		System.out.println("Click  Save button");
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();//  nok

		WebElement  SaveBtn= driver.findElement(By.xpath("//button[@type='submit']"));
		//		WebElement  SaveBtn= driver.findElement(By.xpath("//button[text()='Save']"));
		System.out.println("SaveBtn =" + SaveBtn.isDisplayed());
		Actions act  = new Actions(driver);
		//		act.moveToElement(SaveBtn).click().perform(); // nok

		//		act.moveToElement(SaveBtn).doubleClick().perform();// nok

		JavascriptExecutor  js =  (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].click();", SaveBtn); // nok
		//		act.moveToElement(SaveBtn).sendKeys(Keys.ENTER).perform();
		//		act.keyDown(Keys.ENTER).build().perform();// nok
		Thread.sleep(5000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();// ok
		System.out.println("");		
		//  //div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='Rama10']

		String myxpath = "//div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" + userName+ "']";
		boolean   userDisplayed =	 driver.findElement(By.xpath(myxpath)).isDisplayed();
		// scroll to user


		//act.scrollToElement(driver.findElement(By.xpath(myxpath))).perform();

		System.out.println("userDisplayed= " +userDisplayed);
		if(userDisplayed)
		{
			System.out.println("User name =" + userName + " created ");
		}
		else
		{
			System.out.println("User name =" + userName + "is not created ");
		}



		System.out.println("ends");

	}

}

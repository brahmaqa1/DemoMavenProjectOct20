package OrangrHRMsPractise;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.math3.complex.ComplexField;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utitlities.ExcelUtilities;

public class CreateMultipleUsersTC12 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
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

		
		// Read data from excel file 
		String xlPath = ".\\TestData.xlsx";
		String SheetName = "CreateUsers";
		
		ExcelUtilities xlUtil = new ExcelUtilities();
		List<String>	userRoleList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "UserRole");
		System.out.println("userRoleList= " +userRoleList);
		
		
		
		List<String>	EmployeeNameList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "EmployeeName");
		System.out.println("EmployeeNameList= " +EmployeeNameList);
		
		List<String>	StatusList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "Status");
		System.out.println("StatusList= " +StatusList);
		
		List<String>	userNameList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "Username");
		System.out.println("userNameList= " +userNameList);
		
		List<String>	PasswordList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "Password");
		System.out.println("PasswordList= " +PasswordList);
		
		List<String>	ConfirmPasswordList =	xlUtil.readAllRowsDataFromExcel(xlPath, SheetName, "ConfirmPassword");
		System.out.println("ConfirmPasswordList= " +ConfirmPasswordList);
				
		for(int i=0;i<= userNameList.size()-1;i++)
		{
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

			System.out.println(" Select User Role+" + userRoleList.get(i));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='User Role']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='"+userRoleList.get(i)+ "']")).click();
			
			System.out.println("Select Status=" + StatusList.get(i));
			///   //label[text()='Status']/parent::div/following-sibling::div   - ok
			driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div")).click();
			//label[text()='Status']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='Enabled']

			driver.findElement(By.xpath("//label[text()='Status']/parent::div/following-sibling::div//div[@role='listbox']//*[text()='"+ StatusList.get(i)+ "']")).click();

			System.out.println("Select Employee Name=" + EmployeeNameList.get(i));
			//label[text()='Employee Name']/parent::div/following-sibling::div//input
			driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input")).sendKeys("Orange");
			Thread.sleep(3000);
			//	driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input/../following-sibling::div[@role='listbox']//*[text()='Orange Test']")).click();

			//		driver.findElement(By.xpath("//*[text()='Orange  Test']")).click();
			int cnt=		driver.findElements(By.xpath("//div[@role='listbox']//*[text()='"+EmployeeNameList.get(i)+ "']")).size();

			System.out.println("cnt- " +  cnt);
			driver.findElements(By.xpath("//div[@role='listbox']//*[text()='"+ EmployeeNameList.get(i)+ "']")).get(0).click();

			System.out.println("Enter Username ="+userNameList.get(i));
			//label[text()='Username']/parent::div/following-sibling::div//input

//			String userName = "Rama2";
			driver.findElement(By.xpath("//label[text()='Username']/parent::div/following-sibling::div//input")).sendKeys(userNameList.get(i));

			System.out.println("Enter password=" + PasswordList.get(i));
			//label[text()='Password']/parent::div/following-sibling::div//input
			driver.findElement(By.xpath("//label[text()='Password']/parent::div/following-sibling::div//input")).sendKeys(PasswordList.get(i));

			System.out.println("Enter Confirm Password=" + ConfirmPasswordList.get(i));
			//label[text()='Confirm Password']/parent::div/following-sibling::div//input
			driver.findElement(By.xpath("//label[text()='Confirm Password']/parent::div/following-sibling::div//input")).sendKeys(ConfirmPasswordList.get(i));


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
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();// ok
			System.out.println("");		
			//  //div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='Rama10']

			String myxpath = "//div[@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" + userNameList.get(i)+ "']";
			boolean   userDisplayed =	 driver.findElement(By.xpath(myxpath)).isDisplayed();
			// scroll to user


			//act.scrollToElement(driver.findElement(By.xpath(myxpath))).perform();

			System.out.println("userDisplayed= " +userDisplayed);
			if(userDisplayed)
			{
				System.out.println("User name =" + userNameList.get(i) + " created ");
			}
			else
			{
				System.out.println("User name =" + userNameList.get(i) + "is not created ");
			}


			
		}
			
	

		System.out.println("ends");

	}

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	// 1. Declare elements
	public WebElement userName_Txtbox;
	public WebElement password_Txtbox;
	public WebElement login_Btn;

	// 2 constr
	public  LoginPage(WebDriver driver)
	{
		userName_Txtbox = driver.findElement(By.name("username"));
		password_Txtbox = driver.findElement(By.name("password"));
		login_Btn = driver.findElement(By.xpath("//button"));
	}

	// 3 Utilisation
	public void enter_userName(String val)
	{
		userName_Txtbox.sendKeys(val);
	}

	public void enter_Password(String val)
	{
		password_Txtbox.sendKeys(val);
	}

	public void click_LoginBtn()
	{
		login_Btn.click();
	}

	//	driver.findElement(By.name("username")).sendKeys("Admin");
	//
	//	driver.findElement(By.name("password")).sendKeys("admin123");
	//
	//	// click Login button
	//	driver.findElement(By.xpath("//button")).click();
	//
	//	boolean  res= 		driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed();
	//
	//	if(res == true)
	//	{
	//		System.out.println("Home page is displayed succesfully");
	//	}
	//
	//	else
	//	{
	//		System.out.println("Home page is not displayed ");
	//	}


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

	//1 
	public WebElement profile_Image;
	public WebElement admin_Menu;
	

	//2
	public HomePage(WebDriver driver)
	{
		profile_Image = driver.findElement(By.xpath("//img[@alt='profile picture']"));
		admin_Menu = driver.findElement(By.xpath("//span[text()='Admin']"));
	}

	//3 
	public boolean HomePage_Displayed()
	{
		boolean  res= 	profile_Image.isDisplayed();
		if(res == true)
		{
			System.out.println("Home page is displayed succesfully");
		}
		else
		{
			System.out.println("Home page is not displayed ");
		}
		return res;
	}

	public void navigate_Admin() throws InterruptedException
	{
		System.out.println("click Admin button");
		admin_Menu.click();
		Thread.sleep(5000);
	}
	




}

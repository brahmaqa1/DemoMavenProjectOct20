package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

	//1 
	@FindBy(xpath = "//img[@alt='profile picture']")
	public WebElement profile_Image;
	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement admin_Menu;
	

	//2
	public HomePage(WebDriver driver)
	{
//		profile_Image = driver.findElement(By.xpath("//img[@alt='profile picture']"));
//		admin_Menu = driver.findElement(By.xpath("//span[text()='Admin']"));
		PageFactory.initElements(driver, this);		
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

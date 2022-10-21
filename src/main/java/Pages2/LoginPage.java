package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// 1. Declare elements
	
	@FindBy(name= "username")
	public WebElement userName_Txtbox;
	
	@FindBy(name="password")
	public WebElement password_Txtbox;
	
	@FindBy(xpath = "//button")
	public WebElement login_Btn;

	// 2 constr
	public  LoginPage(WebDriver driver)
	{
//		userName_Txtbox = driver.findElement(By.name("username"));
//		password_Txtbox = driver.findElement(By.name("password"));
//		login_Btn = driver.findElement(By.xpath("//button"));
		PageFactory.initElements(driver, this);
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

	

}

package OranngeHRMSPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class createNewUser {

	public static void main(String[] args) throws InterruptedException {
		WebUtilities u = new WebUtilities();
		WebDriver driver= 	u.openBrowser();

		// click Admin //*[text()='Admin']
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//form//input[contains(@class,'active')]")).sendKeys("Raju");
//
//		WebElement	ArrowButton =driver.findElement(By.xpath("//form//*[text()='User Role']/parent::div/following-sibling::div//i"));
//		ArrowButton.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//form//*[text()='User Role']/parent::div/following-sibling::div//i/ancestor::div[contains(@class,'focus')]/following-sibling::div[@role='listbox']//*[text()='ESS']")).click();

		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		WebElement  userroledropdownEle = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
		userroledropdownEle.click();
		Thread.sleep(3000);
		

		
		driver.findElement(By.xpath("//*[contains(text(), 'User Role')]/parent::div/following-sibling::div//div[@role='listbox']//*[text()='ESS']")).click();
		
		System.out.println("ends here");
		
	}

}

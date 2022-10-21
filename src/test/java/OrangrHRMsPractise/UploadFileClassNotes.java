package OrangrHRMsPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UploadFileClassNotes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		 WebDriver  driver = new ChromeDriver();
//		
//		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("incognito");
//	    DesiredCapabilities cap = DesiredCapabilities.chrome();
//	    cap.setCapability(ChromeOptions.CAPABILITY, options);
//	  WebDriver  driver = new ChromeDriver(options);
		
//		  WebDriver driver=null;
//          System.setProperty("webdriver.chrome.driver","./src//lib//chromedriver");
//          DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//          ChromeOptions options = new ChromeOptions();
//          options.addArguments("test-type");
//          options.addArgument("--start-maximized");
//          options.addArguments("--disable-web-security");
//          options.addArguments("--allow-running-insecure-content");
//          capabilities.setCapability("chrome.binary","./src//lib//chromedriver");
//          capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//          driver = new ChromeDriver(capabilities);
		//---------------------
	  
	  // Edge 
//		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
//		
//		 WebDriver  driver = new EdgeDriver();
		

		// open given url ib browser
		String url =  "https://www.google.com/intl/en-GB/gmail/about/";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		
//		
		driver.findElement(By.id("identifierId")).sendKeys("brahma.trainer@gmail.com");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		//
		driver.findElement(By.name("Passwd")).sendKeys("brahma@123321");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		
		

	}

}

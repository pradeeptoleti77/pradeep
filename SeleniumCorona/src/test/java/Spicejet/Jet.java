package Spicejet;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Jet 
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void startProcess() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  driver.get("https://www.spicejet.com/");
	  }

	  @Test
	  public void spiceJet()
	  {
		  boolean val = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled();
		  System.out.println(val);
		  
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='MAA']")).click();
	  }
	  
	  
	  @AfterMethod
	  public void endProcess()
	  {
		  
	  }

}

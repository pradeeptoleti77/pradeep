package Alerts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class JavaAlerts 
{
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod()
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
		  driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		  
	  }
	  @Test
	  public void f() throws Exception 
	  {
		  driver.findElement(By.name("cusid")).sendKeys("hxmcndd");
		  driver.findElement(By.name("submit")).click();
		  
		  Thread.sleep(5000);
		  Alert a1 = driver.switchTo().alert();
		  System.out.println(a1.getText());
		  
		  String alertText = "Do you really want to delete this Customer?";
		  Assert.assertEquals(a1.getText(), alertText);
		  
		  a1.accept();
		  Thread.sleep(2000);
		  System.out.println(a1.getText());
		  a1.accept();
	  }
	
	  @AfterMethod
	  public void afterMethod()
	  {
		  
	  }

}

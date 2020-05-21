package pageobjectmodel;

import org.testng.annotations.Test;

import com.global.covid19.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class CustomerRegisterationTest extends BaseTest
{
	
  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  init();
	  System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
	  
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }
  
  @Test
  public void f() throws Exception 
  {
	  CustomerRegisterationPage c=new CustomerRegisterationPage(driver);
	  c.customerDetails();
		/*
		 * driver.findElement(By.linkText("Sign in")).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("email_create")).sendKeys("kjndsfds@gmail.com");
		 * driver.findElement(By.id("SubmitCreate")).click();
		 * //driver.findElement(By.id("id_gender1")).click(); 
		 * Thread.sleep(2000);
		 * //Select s=new Select(driver.findElement(By.id("days")));
		 * //s.selectByIndex(7); 
		 * driver.findElement(By.id("id_gender1")).click();
		 * driver.findElement(By.id("days")).sendKeys("7");
		 */
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}

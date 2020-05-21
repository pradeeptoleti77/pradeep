package pageobjectmodel;

import org.testng.annotations.Test;

import com.global.covid19.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest extends BaseTest
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
	}
	
	  @Test
	  public void f() throws Exception 
	  {
		  LoginPage p=new LoginPage(driver);
		  p.customerLogin();
		 
		  
		  String expectedResult = "Authentication failed.";
		  Assert.assertEquals(p.verifyText(), expectedResult	);
		/*
		 * driver.findElement(By.linkText("Sign in")).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("pradeeptoleti77@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("kjkbjckjcbxmn");
		 * driver.findElement(By.id("SubmitLogin")).click();
		 * 
		 * String text =
		 * driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"
		 * )).getText(); System.out.println(text);
		 */
	  }
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
		 // driver.quit();
	  }

}

package Alerts;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class FileUpload 
{
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().deleteAllCookies();
		  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   driver.get("https://transfer.pcloud.com/");
	  }
	  @Test
	  public void cloud() throws IOException, InterruptedException  
	  {
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("div.content.desktop:nth-child(14) div.app_inner div.box:nth-child(2) form.fullsupport div.form_wrap:nth-child(1) div.left_box:nth-child(4) div.left_box_in div.top-holder:nth-child(5) div.add_files_btn a.add-files.anim_underline.do.btn span.link_text > span:nth-child(1)")).click();
		  
		  Thread.sleep(3000);
		  Runtime.getRuntime().exec("C:\\Users\\prade\\Desktop\\fileupload.exe");
	  }
  
}

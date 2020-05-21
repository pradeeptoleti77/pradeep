package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.global.covid19.BaseTest;

public class FramesDemo extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		  
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 int size = driver.findElements(By.tagName("frame")).size();
		 System.out.println("size of frames: "+size);
		 //driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		  driver.switchTo().frame(0);
		  driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Selenium")).click();
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		  driver.findElement(By.linkText("DefaultSelenium")).click();
		  driver.switchTo().defaultContent();
	}

}

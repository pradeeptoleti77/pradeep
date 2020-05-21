package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.global.covid19.BaseTest;

public class WindowsHandle extends BaseTest
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		  String parentTitle = driver.getTitle();
		  System.out.println("ParentTitle:" +parentTitle);
		  
		  String parentWindowId = driver.getWindowHandle();
		  System.out.println("ParentWindowId:" +parentWindowId);
		  
		  driver.findElement(By.xpath("//a[@title='Apply Now']")).click();
		  
		  Set<String> multiWindows = driver.getWindowHandles();
		  Iterator<String> itr = multiWindows.iterator();
		  
		  while(itr.hasNext())
		  {
			  String currentWindowId = itr.next();
			  System.out.println("Window Ids: "+currentWindowId);
			  if(!currentWindowId.equals(parentWindowId))
			  {
				  driver.switchTo().window(currentWindowId);
			  }
		  }
		  
		 String childTitle = driver.getTitle();
		 System.out.println(childTitle);
		 driver.findElement(By.id("cities")).sendKeys("Baroda");
		 driver.close();
		 
		 driver.switchTo().window(parentWindowId);
		 String title = driver.getTitle();
		 System.out.println("afterclosing the child window: "+title);
		 
	}

}

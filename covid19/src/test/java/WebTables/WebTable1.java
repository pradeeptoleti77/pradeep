package WebTables;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.global.covid19.BaseTest;

public class WebTable1 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  
		  for(int i=0;i<=3;i++)
		   {
			   ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
			   Thread.sleep(2000);
		   }
		  
		  List<WebElement> tab_collection = driver.findElements(By.xpath("//table[@id='customers']"));
		  
		  for(WebElement tab_element:tab_collection)
		  {
			 List<WebElement> td_collection = tab_element.findElements(By.tagName("td"));
			 {
				 for(WebElement td_element:td_collection)
				 {
					 //if(td_element.getText().contains("Helen Bennett"))
						 System.out.println(td_element.getText());
				 }
			 }
			  
		  }
		  	driver.quit();
	}

}

package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShowMoreAssign 
{
	public static void main(String[] args) throws Exception 
	{
			WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://money.rediff.com/indices");
		  driver.findElement(By.xpath("//a[contains(text(),'Show More >>')]")).click();
		  
		  Thread.sleep(4000);
		  
		  List<WebElement> elements = driver.findElements(By.xpath("//table[@id='dataTable']//tbody//tr//td[1]"));
		  for(WebElement td_elements:elements)
		  {
			 
			 String val = td_elements.getText();
			 System.out.println(val);
		  }
		  
		  driver.quit();
	}
}

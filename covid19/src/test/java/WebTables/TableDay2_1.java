package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDay2_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.get("https://money.rediff.com/gainers");
		  
		  List<WebElement> part = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[4]//td"));
		  for(WebElement td_part:part)
		  {
			  System.out.println(td_part.getText());
		  }
		  
		 WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Fermenta Biotech')]//parent::*//following-sibling::td"));
		 System.out.println(text.getText());
		 driver.quit();
	}

}

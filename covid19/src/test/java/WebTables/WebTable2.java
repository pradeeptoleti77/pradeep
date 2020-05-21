package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebTable2 
{
	 public static WebDriver driver;
	 public static WebDriverWait wait;

	public static void main(String[] args) throws Exception  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  wait= new WebDriverWait(driver,60);
		  
		  driver.get("https://www.tripadvisor.in/");
		 
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,'Flights')]"))).click();
		 
		  //checkin
		  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-datetype='DEPARTURE'] span[class='picker-label target']"))).click();
		  String date1="4-Jul 2020";
		  String[] splitter1=date1.split("-");
		  String checkInDay=splitter1[0];
		  String checkInMonth=splitter1[1];
		  
		  selectDate(checkInDay,checkInMonth);
		  
		  //checkout
		  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-datetype='RETURN'] span[class='picker-label target']"))).click();
		  String date2="7-Aug 2020";
		  String[] splitter2=date2.split("-");
		  String checkOutDay=splitter2[0];
		  String checkOutMonth=splitter2[1];
		  
		  selectDate(checkOutDay,checkOutMonth);
		 	  
	}

		public static void selectDate(String Day, String Month) throws Exception
		{
				
			wait=new WebDriverWait(driver, 60);
			
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='rsdc-months']/span/span[1]"));
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().equals(Month))
				{
					List<WebElement> data = driver.findElements(By.xpath("//div[@class='rsdc-months']/span["+(i+1) +"]/span"));
					
					for(WebElement d:data)
					{
						if(d.getText().equals(Day))
						{
							d.click();
							return;
						}
					}
				}
							
			}
		

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='rsdc-next rsdc-nav ui_icon single-chevron-right-circle']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='rsdc-next rsdc-nav ui_icon single-chevron-right-circle']"))).click();
			
			Thread.sleep(2000);
			selectDate(Day, Month);
		
		}	
}



package Actions;

import org.testng.annotations.Test;

import com.global.covid19.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class MixedActionsTest extends BaseTest
{
	//WebDriver driver;
	Actions a;
	
	@BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  init();
		  //test=report.startTest("MixedActionsTest");
	  }

	  @Test(priority = 0,enabled = false)
	  public void moveToElement() throws Exception 
	  {
		  driver.get("https://www.snapdeal.com/");
		  a=new Actions(driver);
		  Thread.sleep(3000);
		  a.moveToElement(driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"))).perform();
		  driver.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click();
	  }
	  
	  @Test(priority = 1,groups = {"regression"})
	  public void dragAndDrop() throws InterruptedException  
	  {
		  driver.get("http://jqueryui.com/droppable/");
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  
		  a=new Actions(driver);
		  WebElement drag = driver.findElement(By.id("draggable"));
		  WebElement drop = driver.findElement(By.id("droppable"));
		  //a.dragAndDrop(drag, drop).build().perform();
		  a.clickAndHold(drag).moveToElement(drop).build().perform();
		  Thread.sleep(3000);
		  
	  }
	  
	  @Test(priority = 2,enabled = false)
	  public void resizable() throws InterruptedException  
	  {
		  driver.get("http://jqueryui.com/resizable/");
		  
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']"));
		  
		  a=new Actions(driver);
		  //a.moveToElement(resize, 100, 200).perform();
		  a.clickAndHold(resize).moveByOffset(100, 200).release(resize).build().perform();
		  Thread.sleep(3000);
		 
	  }
	  
	  @Test(priority = 3,enabled = false)
	  public void rightClick() throws InterruptedException  
	  {
		  driver.get("http://jqueryui.com/");
		  
		  WebElement click = driver.findElement(By.linkText("Draggable"));
		  a=new Actions(driver);
		  a.contextClick(click).perform();
	  }
	  
	  @Test(priority = 4,enabled = false)
	  public void slider() throws InterruptedException  
	  {
		  driver.get("http://jqueryui.com/slider/");
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		  a=new Actions(driver);
		 //a.dragAndDropBy(slide, 100, 0).build().perform();
		  a.clickAndHold(slide).moveByOffset(200, 0).release(slide).build().perform();
	  }
	  
	  @Test(priority = 5,enabled = false)
	  public void scrollBar() throws InterruptedException  
	  {
		   driver.get("http://www.seleniumhq.org/download/");
		   
		   for(int i=0;i<=10;i++)
		   {
			   ((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
			   Thread.sleep(2000);
		   }
	  }
	  
	  @Test(priority = 6,enabled = false)
	  public void autoSugestion() throws InterruptedException  
	  {
		  driver.get("https://www.google.co.in/");
		  
		  driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		  String value = driver.findElement(By.name("q")).getAttribute("value");
		  System.out.println("entered text: "+value);
		  
		  Thread.sleep(3000);
		  List<WebElement> list =  driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div[2]/div/span"));
		  
		  for(int i=0;i<list.size();i++)
		  {
			  if(list.get(i).getText().equals(value))
			  {
				  list.get(i).click();
				  return;
			  }
			  list= driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div[2]/div/span"));
			  
		  }
		  
		  
	  }
	  
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
		  //report.endTest(test);
		  //report.flush();
		  
		  driver.quit();
		  
	  }

}

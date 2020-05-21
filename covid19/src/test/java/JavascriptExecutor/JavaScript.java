package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import com.global.covid19.BaseTest;

public class JavaScript extends BaseTest

{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  driver.get("https://www.facebook.com/");
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('email').value='hjdsadsa'");
		  
		  Object val = js.executeScript(" return document.title");
		  System.out.println(val);
		  
		  //scroll bar
		  js.executeScript("window.scroll(0,200)");
		  
		  //scroll to the end of the page
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  //elements visible
		  js.executeScript("document.getElementById('u_0_13').scrollIntoView()");
		  
		  //pagebackword
		  js.executeScript("window.history.back()");
		  
		  //page forward
		  js.executeScript("window.history.forward()");
		  
		  //refresh
		  js.executeScript("window.history.go(0)");
		  
		  
		  
	}

}

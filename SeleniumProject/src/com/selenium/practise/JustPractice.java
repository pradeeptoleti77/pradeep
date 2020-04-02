package com.selenium.practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustPractice 
{
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	
	public static void init() throws Exception 
	{
		 fis=new FileInputStream(projectpath+"//browser.properties");
		 p=new Properties();
		 p.load(fis);
	}
	
	
	public static void openBrowser(String browser)
	{
			if(p.getProperty(browser).equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\\\Files\\\\chromedriver_win32\\\\chromedriver.exe");
				System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
				driver=new ChromeDriver();
				 
			}
			else if(p.getProperty(browser).equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
	}

		public static void navigateUrl(String url)
		{
			driver.get(p.getProperty(url));
		}
		
		public static void searchElement(String locatorkey) 
		{
				driver.findElement(By.className(locatorkey)).click();	
		}

		public static void enterTextFiled(String locatorkey, String value) 
		{
			driver.findElement(By.name(locatorkey)).sendKeys(value);	
		}

		public static void selectDropDown(String locatorkey, String value) 
		{
			driver.findElement(By.id(p.getProperty(locatorkey))).sendKeys(p.getProperty(value));		
		}

}

package com.selenium.practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainprop;
	public static Properties subprop;
	public static ExtentReports report;
	public static ExtentTest test;
	
		public static void init() throws Exception  
		{
			fis=new FileInputStream(projectpath+"//browser.properties");
			 p=new Properties();
			 p.load(fis);
			 
			 fis=new FileInputStream(projectpath+"//environment.properties");
			 mainprop=new Properties();
			 mainprop.load(fis);
			 String e = mainprop.getProperty("env");
			 System.out.println(e);
			 
			fis=new FileInputStream(projectpath+"//"+e+".properties");
			subprop= new Properties();
			subprop.load(fis);
			String url = subprop.getProperty("amazonurl");
			System.out.println(url);
			
			fis=new FileInputStream(projectpath+"//log4jconfig.properties");
			PropertyConfigurator.configure(fis);
			
			report=ExtentManager.getInstance();
			
		}
	
	public static void openBrowser(String browser) 
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\prade\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(option);
			
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
		 ProfilesIni p=new ProfilesIni();
		 FirefoxProfile profile = p.getProfile("pradeepfirefox");
		 
		 profile.setPreference("dom.webnotifications.enabled", false);
		 
		 FirefoxOptions option=new FirefoxOptions();
		 option.setProfile(profile);
		 
			driver=new FirefoxDriver(option);
		}
			driver.manage().window().maximize();
			
	}
	public static void navigateUrl(String url)
	{
			driver.get(subprop.getProperty(url));
	}  
	public static void clickSearch(String locatorkey) 
	{
		//driver.findElement(By.className(locator)).click();
		getElement(locatorkey).click();
	}

	public static void enterSearchText(String locatorkey, String value)
	{
		//driver.findElement(By.name(locator)).sendKeys(value);
		getElement(locatorkey).sendKeys(subprop.getProperty(value));
	}

	public static void selectOption(String locatorkey, String item) 
	{
		//driver.findElement(By.id(locator)).sendKeys(item);
		getElement(locatorkey).sendKeys(subprop.getProperty(item));
	}

	  private static WebElement getElement(String locatorkey) 
	   {
		
		WebElement element=null;
		
		if(locatorkey.endsWith("_id"))
		{
			element=driver.findElement(By.id(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_name"))
		{
			element=driver.findElement(By.name(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_class"))
		{
			element=driver.findElement(By.className(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_xpath"))
		{
			element=driver.findElement(By.xpath(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_css"))
		{
			element=driver.findElement(By.cssSelector(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_linktext"))
		{
			element=driver.findElement(By.linkText(subprop.getProperty(locatorkey)));
		}
		if(locatorkey.endsWith("_partiallinktext"))
		{
			element=driver.findElement(By.partialLinkText(subprop.getProperty(locatorkey)));
		}
		
		return element;
				
	}
	
	
	
}

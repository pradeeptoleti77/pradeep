package com.practise;

import java.io.FileInputStream;
import java.util.Date;
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
	public static FileInputStream fis;
	public  static String projectpath=System.getProperty("user.dir");
	public static Properties p;
	public static Properties mainprop;
	public static Properties subprop;
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
    public static String filepath;
	
	static
	{
		Date dt=new Date();
		 filepath = dt.toString().replace(' ', '_').replace(':', '_');
	}
	
	public static void init() throws Exception 
	{
		fis=new	FileInputStream(projectpath+"//data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectpath+"//environment.properties");
		mainprop=new Properties();
		mainprop.load(fis);
		String e = mainprop.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectpath+"//"+e+".properties");
		subprop=new Properties();
		subprop.load(fis);
		String url = subprop.getProperty("amazonurl");
		System.out.println(url);
		
		fis=new FileInputStream(projectpath+"//Log4jconfigurations.properties");
		PropertyConfigurator.configure(fis);
		
		report=ExtentManager.getInstance();
	}
	

	public static void openBrowser(String browser) 
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Files\\chromedriver_win32\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\prade\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		option.addArguments("--disable-notifications");
		
		driver=new ChromeDriver(option);	
		}
		
		else if(browser.equals("firefox"))
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
	
	public static void clickOnSearch(String locatorkey) 
	{
		//driver.findElement(By.className(subprop.getProperty(locatorkey))).click();
		getElement(locatorkey).click();
	}

	public static void enterSearchText(String locatorkey, String value) 
	{
		//driver.findElement(By.name(subprop.getProperty(locatorkey))).sendKeys(subprop.getProperty(value));
		getElement(locatorkey).sendKeys(subprop.getProperty(value));
	}

	public static void selectDropdown(String loactorkey, String value) 
	{
		//driver.findElement(By.id(subprop.getProperty(loactorkey))).sendKeys(subprop.getProperty(value));
		getElement(loactorkey).sendKeys(subprop.getProperty(value));;
	}


	public static WebElement getElement(String locatorkey) 
	{
		
		WebElement element= null;
		if(locatorkey.endsWith("_id"))
		{
			element=driver.findElement(By.id(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_name"))
		{
			element=driver.findElement(By.name(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_class"))
		{
			element=driver.findElement(By.className(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_css"))
		{
			element=driver.findElement(By.cssSelector(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			element=driver.findElement(By.xpath(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_linktext"))
		{
			element=driver.findElement(By.linkText(subprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_partiallinktext"))
		{
			element=driver.findElement(By.partialLinkText(subprop.getProperty(locatorkey)));
		}
			return element;
				
	}


}

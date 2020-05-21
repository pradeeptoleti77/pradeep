package com.selenium.practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BasicTest 
{
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainprop;
	public static Properties subprop;
	
		public static void init() throws Exception  
		{
			fis=new FileInputStream(projectpath+"//data.properties");
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
			String url = subprop.getProperty("iciciurl");
			System.out.println(url);
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
}

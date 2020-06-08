package com.project.KeyWords;

import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericKeywords 
{
	
	public Properties childProperties;
	public Properties orProp;
	public String objectKey;
	public String dataKey;
	public Hashtable<String, String> data;
	public static WebDriver driver;
	
	
	public void setChildProperties(Properties childProperties) {
		this.childProperties = childProperties;
	}

	public void setOrprop(Properties orProp) {
		this.orProp = orProp;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public void setData(Hashtable<String, String> data) {
		this.data = data;
	}

	public void openBrowser()
	{
		String browser = data.get(dataKey);
		
		System.out.println("Opening the Browser......." +data.get(dataKey));
		
		if(browser.equals("chrome"))
		{
			//create and invoke user defined chromeprofile
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		
		else if(browser.equals("firefox"))
		{
			//create and invoke user defined firefoxprofile
		System.setProperty("webdriver.gecko.driver", "C:\\Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		}
		
		//maximize and implict wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void navigateUrl()
	{
		
		System.out.println("navigating the url......." +objectKey);
		driver.get(objectKey);
	}
	
	public void click()
	{
		System.out.println("clicking the element........"+orProp.getProperty(objectKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).click();
		getElement(objectKey).click();
	}
	
	public void type()
	{
		System.out.println("typing the text......"+orProp.getProperty(objectKey)+"....."+data.get(dataKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).sendKeys(data.get(dataKey));
		getElement(objectKey).sendKeys(data.get(dataKey));
	}
	
		public  WebElement getElement(String objectKey) 
		{
			WebElement element=null;
			
			if(objectKey.endsWith("_id"))
			{
				element=driver.findElement(By.id(orProp.getProperty(objectKey)));
			}
			else if(objectKey.endsWith("_xpath"))
			{
				element=driver.findElement(By.xpath(orProp.getProperty(objectKey)));
			}
			else if(objectKey.endsWith("_css"))
			{
				element=driver.findElement(By.cssSelector(orProp.getProperty(objectKey)));
			}
			else if(objectKey.endsWith("_name"))
			{
				element=driver.findElement(By.name(orProp.getProperty(objectKey)));
			}
			
			return element;
			
			
		}
		
}

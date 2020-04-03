package com.screenshots;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.selenium.practise.BaseTest;

public class Screenshot2 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		openBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println("number of links present in a particular page:"+links.size());
		 
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				String linktext = links.get(i).getText();
				links.get(i).click();
				Date dt=new Date();
				String filepath = dt.toString().replace(':', '_').replace(' ', '_')+".jpeg";
				
				if(driver.getTitle().equals("Register: Mercury Tours"))
				{
			File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrn, new File("C:\\Users\\prade\\Desktop\\Selenium screenshots\\"+filepath+".jpeg"));
				}
				links=driver.findElements(By.tagName("a"));
				
			}
		}
		
	}

}

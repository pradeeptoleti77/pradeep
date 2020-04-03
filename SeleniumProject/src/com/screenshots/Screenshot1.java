package com.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.selenium.practise.BaseTest;

public class Screenshot1 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		navigateUrl("amazonurl");
		
		 List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
		 
		System.out.println("size of the links is:-"+links.size());
		if(links.size()==0)
		{
			File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrn, new File("C:\\Users\\prade\\Desktop\\Selenium screenshots\\img1.png"));
		}
	}

}

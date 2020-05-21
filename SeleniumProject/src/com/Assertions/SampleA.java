package com.Assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.selenium.practise.BaseTest;

public class SampleA extends BaseTest
{
	public static void main(String[] args) throws Exception 
	{
		 init();
			
		 test=report.startTest("SampleA");
		 test.log(LogStatus.INFO, "Initializing Test");
		 
		 openBrowser("chromebrowser");
		 test.log(LogStatus.INFO, "Openend the browser:"+p.getProperty("chromebrowser"));
		 
		 navigateUrl("amazonurl");
		 test.log(LogStatus.INFO, "opened the url:"+subprop.getProperty("amazonurl"));
		 
		WebElement element = driver.findElement(By.linkText("New Releases"));
		
		String actualLink = "New Releases";
		String expectedLink = "New Release";
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink));
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		
		 
	}
}

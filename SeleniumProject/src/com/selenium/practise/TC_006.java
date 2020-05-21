package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{
	//verifications parrt2
	//Retrieving the search input text

	public static void main(String[] args) throws Exception 
	{
		 init();
		
		 test=report.startTest("TC_006");
		 test.log(LogStatus.INFO, "Initializing Test");
		 
		 openBrowser("chromebrowser");
		 test.log(LogStatus.INFO, "Openend the browser:"+p.getProperty("chromebrowser"));
		 
		 navigateUrl("amazonurl");
		 test.log(LogStatus.INFO, "opened the url:"+subprop.getProperty("amazonurl"));
		 
		 WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
		 input.sendKeys("sony");
		 String val = input.getAttribute("value");
		 System.out.println("entered the text is:" +val);
	}

}

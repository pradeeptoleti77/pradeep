package com.Assertions;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;
import com.selenium.practise.BaseTest;

public class SampleB extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		//Soft Assertion
		
		init();
		
		 test=report.startTest("SampleA");
		 test.log(LogStatus.INFO, "Initializing Test");
		 
		 openBrowser("chromebrowser");
		 test.log(LogStatus.INFO, "Openend the browser:"+p.getProperty("chromebrowser"));
		 
		 navigateUrl("amazonurl");
		 test.log(LogStatus.INFO, "opened the url:"+subprop.getProperty("amazonurl"));
		 
		String element = driver.findElement(By.linkText("Mobiles")).getAttribute("innerHTML");
		 System.out.println(element);
		 
		 String actualLink = "Mobiles";
		 String expectedLink = "mobiles";
		 
		 SoftAssert s=new SoftAssert();
		 s.assertEquals(actualLink, expectedLink);
		 
		 driver.findElement(By.linkText("Sell")).click();
		 
		 
		 s.assertAll();
				 
		 
	}

}

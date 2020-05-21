package com.selenium.practise;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest
{
		//Assertion
	public static void main(String[] args) throws Exception 
	{
	
		init();
		test=report.startTest("TC_007");
		test.log(LogStatus.INFO, "Initializing Test");
		
		openBrowser("chromebrowser");
		test.log(LogStatus.INFO, "opened the browser:" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "opened the url:" +subprop.getProperty("amazonurl"));
		
		String actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedlink="Customer service"; 
		
		System.out.println("Actual link is:" +actuallink);
		System.out.println("Expected link is:" +expectedlink);
		
		//Assert.assertEquals(actuallink, expectedlink);
		//Assert.assertTrue(actuallink.equals(expectedlink), "Both link are Not equal");
		//Assert.assertTrue(actuallink.equalsIgnoreCase(expectedlink), "Both or not equal");
		
		SoftAssert s=new SoftAssert();
		//s.assertEquals(actuallink, expectedlink);
		s.assertTrue(actuallink.equals(expectedlink), "Both the links are not Equal");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		
		s.assertAll();
	}

}

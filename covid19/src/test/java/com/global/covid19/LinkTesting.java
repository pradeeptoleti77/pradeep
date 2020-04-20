package com.global.covid19;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.relevantcodes.extentreports.LogStatus;

public class LinkTesting extends BaseTest
{

	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	public void setup(String btype) throws Exception
	{
		init();
		test=report.startTest("LinkTesting");
		test.log(LogStatus.INFO, "Initializing the Properties Files....");
		
		openBrowser(btype);
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("googleurl");
		test.log(LogStatus.INFO, "Navigated to url :-" + subprop.getProperty("googleurl"));
	}
		
	@Test(groups = {"regression","smoke"})
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups = {"regression","smoke"})
	public void tearDown()
	{
		driver.quit();
		
		report.endTest(test);
		report.flush();
	}

}


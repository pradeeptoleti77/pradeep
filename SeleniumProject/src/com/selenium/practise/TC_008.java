package com.selenium.practise;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class TC_008 extends BaseTest
{
		//Generating Screenshots in HTML reports
	public static void main(String[] args) throws Exception 
	{
		 init();
			
		 test=report.startTest("TC_008");
		 test.log(LogStatus.INFO, "Initializing Test");
		 
		 openBrowser("chromebrowser");
		 test.log(LogStatus.INFO, "Openend the browser:"+p.getProperty("chromebrowser"));
		 
		 navigateUrl("amazonurl");
		 test.log(LogStatus.INFO, "opened the url:"+subprop.getProperty("amazonurl"));
		
		 
			String expectedlink = "Customer Servi";
			
			if(!isElementsEqual(expectedlink))
				reportFailure("Both are not Equal");
			else
				reportSucess("Both are Equal");
			
			report.endTest(test);
			report.flush();
	}

		
}

package com.Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.practise.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasicScreenshot extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		 init();
			
		 test=report.startTest("BasicScreenshot");
		 test.log(LogStatus.INFO, "Initializing Test");
		 
		 openBrowser("chromebrowser");
		 test.log(LogStatus.INFO, "Openend the browser:"+p.getProperty("chromebrowser"));
		 
		 navigateUrl("amazonurl");
		 test.log(LogStatus.INFO, "opened the url:"+subprop.getProperty("amazonurl"));
		 
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(projectpath+"//Screenshots//"+filepath+".png"));
			
			test.log(LogStatus.INFO, "Screenshot......>"+test.addScreenCapture(projectpath+"//Screenshots//"+filepath+".png"));
			
			report.endTest(test);
			report.flush();
			
		 			
	}

}

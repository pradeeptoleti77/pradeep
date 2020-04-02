package com.selenium.practise;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{

	public static ExtentReports extent;
	
	
	public static ExtentReports getInstance() 
	{
		if(extent==null)
		{
			Date dt=new Date();
			 String filepath = dt.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(projectpath+"//HtmlReports"+"//filepath");
			extent.loadConfig(new File(projectpath+"//extentconfigreports.xml"));
			extent.addSystemInfo("selenium", "3.11.0").addSystemInfo("environment",mainprop.getProperty("env"));
		
		}
		return extent;	
	}
	
		

}

package com.practise;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
			
			//Date dt=new Date();
			 //String filepath = dt.toString().replace(' ', '_').replace(':', '_');
			report=new ExtentReports(projectpath+"//HtmlReports"+"//" + filepath);
			report.loadConfig(new File(projectpath+"//extentreportconfiguration.xml"));
			report.addSystemInfo("Selenium","3.4.55" ).addSystemInfo("environment",mainprop.getProperty("env"));
			
		}
		return report;
		
	}

	
}

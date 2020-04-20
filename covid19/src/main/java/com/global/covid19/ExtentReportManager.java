package com.global.covid19;

import java.io.File;


import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager extends BaseTest
{
		public static ExtentReports report;
		
		public static ExtentReports getInstance()
		{
			if(report==null)
			{
				//Date dt=new Date();
				//String filepath = dt.toString().replace(':', '_').replace(' ', '_')+".html";
				report=new ExtentReports(projectpath+"//HtmlReports"+"//"+filepath);
				report.loadConfig(new File(projectpath+"//extentconfigreports.xml"));
		report.addSystemInfo("Selenium", "3.11.0").addSystemInfo("environment",mainprop.getProperty("env"));
			}
			return report;
			
		}
}

package com.project.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import com.project.DriverProgrames.DriverScript;
import com.project.Utilities.ExcelAPI;

public class BaseTest 
{
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties baseProperties;
	public Properties childProperties;
	public Properties orProp;
	public static ExcelAPI xls;
	public static String testName;
	public DriverScript ds;
	
	@BeforeTest
	public  void init() throws Exception
	{
		
		
		fis=new FileInputStream(projectpath+"//src//test//resources//environment.properties");
		baseProperties=new Properties();
		baseProperties.load(fis);
		String envType = baseProperties.getProperty("env");
		System.out.println(envType);
		
		fis=new FileInputStream(projectpath+"//src//test//resources//"+envType+".properties");
		childProperties=new Properties();
		childProperties.load(fis);
		String url = childProperties.getProperty("zohourl");
		System.out.println(url);
		
		fis=new FileInputStream(projectpath+"//src//test//resources//or.properties");
		orProp=new Properties();
		orProp.load(fis);
		
		//init the TestName
		 testName = this.getClass().getSimpleName();
		System.out.println(testName);
		
		//How do i come to know which suite Excel file to load
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		String suiteName = pack[pack.length-1];
		System.out.println(suiteName);
		
		//excel file init
		xls=new ExcelAPI(childProperties.getProperty(suiteName+"_xlsx"));
		
		//init driver script
		ds=new DriverScript();
		ds.setOrProp(orProp);
				
	}

}

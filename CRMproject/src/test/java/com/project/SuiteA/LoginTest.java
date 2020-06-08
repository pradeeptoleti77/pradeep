package com.project.SuiteA;

import org.testng.annotations.Test;

import com.project.BaseClass.BaseTest;
import com.project.DriverProgrames.DriverScript;
import com.project.Utilities.Constants;
import com.project.Utilities.DataUtils;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;


public class LoginTest extends BaseTest
{
	 
	  @Test(dataProvider="getData")
	  public void loginTest(Hashtable<String, String> data) throws SecurityException, Exception 
	  {
		  System.out.println("am f");
		  
		  if(data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO))
			  throw new SkipException("Runmode is set to NO...");
		  
		  //ds=new DriverScript();
		  ds.executeKeywords(xls, testName, data);
		  
	  }
	
	  @DataProvider
	  public Object[][] getData()
	  {
		  String sheetName="Data";
		  
		 // String testName="LoginTest";  
		  
		  return DataUtils.getTestData(xls, sheetName, testName);
		  
	  }
	 
  

}

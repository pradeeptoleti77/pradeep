package com.project.DriverProgrames;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Properties;

import com.project.KeyWords.AppKeywords;
import com.project.Utilities.Constants;
import com.project.Utilities.ExcelAPI;

public class DriverScript 
{
	public Properties childProperties;
	public Properties orProp;
	public AppKeywords app;
	
	public Properties getChildProperties() 
	{
		return childProperties;
	}

	public void setChildProperties(Properties childProperties) 
	{
		this.childProperties = childProperties;
	}

	public Properties getOrProp() 
	{
		return orProp;
	}

	public void setOrProp(Properties orProp)
	{
		this.orProp = orProp;
	}

	public void executeKeywords(ExcelAPI xls,String testName,Hashtable<String, String> testData) throws Exception, SecurityException
	{
		System.out.println("i am from driver script");
		
		int rows = xls.getRowCount(Constants.KEYWORDS_SHEET);
		System.out.println("Rows:" +rows);
		
		app=new AppKeywords();
		app.setOrprop(orProp);
		app.setData(testData);
		app.setChildProperties(childProperties);
		
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.TCID_COL, rNum);
			if(tcid.equals(testName))
			{
				String kword = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.KEYWORD_COL, rNum);
				String objectKey = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.OBJECT_COL, rNum);
				String dataKey = xls.getCellData(Constants.KEYWORDS_SHEET, Constants.DATA_COL, rNum);
				
				String data = testData.get(dataKey);
				
				//System.out.println(tcid+"----"+kword+"----"+orProp.getProperty(objectKey)+"----"+data);
				
				app.setDataKey(dataKey); 
				app.setObjectKey(objectKey);
				app.setData(testData);
				
				/*
				 * if(kword.equals("openBrowser")) app.openBrowser(); else
				 * if(kword.equals("navigateUrl")) app.navigateUrl(); else
				 * if(kword.equals("click")) app.click(); else if(kword.equals("type"))
				 * app.type(); else if(kword.equals("validateLogin")) app.validateLogin(); else
				 * if(kword.equals("verifyTitle")) app.verifyTitle();
				 */
				
				//reflection concept to identify the keyword generic methods
				Method method;
				try
				{
					method=app.getClass().getMethod(kword);
					method.invoke(app);
				 }
				
				catch (Exception e) {
					
					e.printStackTrace();
				} 
				
			}
		}
	}

}

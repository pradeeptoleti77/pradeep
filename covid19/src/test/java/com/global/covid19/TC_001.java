package com.global.covid19;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_001 extends BaseTest
{
	
	 @BeforeMethod(groups = {"regression","sanity"})
	 @Parameters("browser")
	  public void startProcess(String btype) throws Exception 
	 {
		 init();
			
			test=report.startTest("TC_001");
			
		 	//log.info("\\..........Initializing properties files............//");
			test.log(LogStatus.INFO, "\\..........Initializing properties files............//");
			
			openBrowser(btype);
			//log.info("Opened the browser:" +p.getProperty("chromebrowser"));
			test.log(LogStatus.INFO, "Opened the browser:" +p.getProperty("chromebrowser"));
			
			navigateUrl("amazonurl");
			//log.info("navigating to url:" +subprop.getProperty("amazonurl"));
			test.log(LogStatus.INFO, "navigating to url:" +subprop.getProperty("amazonurl"));
			 
	 }
	 
  @Test(groups = {"regression","sanity"})
  public void amazon()
  {
	  selectOption("amazondropdown_id","amazondropdowninput");
		//log.info("Selected the option:" +subprop.getProperty("amazondropdowninput") + "by using locator:"+subprop.getProperty("amazondropdown_id"));
		test.log(LogStatus.PASS, "Selected the option:" +subprop.getProperty("amazondropdowninput") + "by using locator:"+subprop.getProperty("amazondropdown_id") );
		
		enterSearchText("amazontextfield_name","amazonsearchtext");
		//log.info("Entered the text:" +subprop.getProperty("amazonsearchtext") + "by using locator:" +subprop.getProperty("amazontextfield_name"));
		test.log(LogStatus.PASS, "Entered the text:-"  +subprop.getProperty("amazonsearchtext") +  "by using locator:-" +subprop.getProperty("amazontextfield_name"));
		
		clickSearch("amazonsearchbutton_class");
		//log.info("clicked on search option by using locator:" +subprop.getProperty("amazonsearchbutton_class"));
		test.log(LogStatus.PASS, "clicked on search option by using locator:-" +subprop.getProperty("amazonsearchbutton_class"));
		
  }
 
  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  report.endTest(test);
		report.flush();
		driver.quit();
	  
  }

}

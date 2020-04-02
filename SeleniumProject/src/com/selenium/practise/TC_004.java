package com.selenium.practise;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
		test=report.startTest("TC_004");
		
	 	//log.info("\\..........Initializing properties files............//");
		test.log(LogStatus.INFO, "\\..........Initializing properties files............//");
		
		openBrowser("chromebrowser");
		//log.info("Opened the browser:" +p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened the browser:" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		//log.info("navigating to url:" +subprop.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "navigating to url:" +subprop.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","amazondropdowninput");
		//log.info("Selected the option:" +subprop.getProperty("amazondropdowninput") + "by using locator:"+subprop.getProperty("amazondropdown_id"));
		test.log(LogStatus.PASS, "navigating to url:" +subprop.getProperty("amazonurl"));
		
		enterSearchText("amazontextfield_name","amazonsearchtext");
		//log.info("Entered the text:" +subprop.getProperty("amazonsearchtext") + "by using locator:" +subprop.getProperty("amazontextfield_name"));
		test.log(LogStatus.PASS, "Entered the text:" +subprop.getProperty("amazonsearchtext") + "by using locator:" +subprop.getProperty("amazontextfield_name"));
		
		clickSearch("amazonsearchbutton_class");
		//log.info("clicked on search option by using locator:" +subprop.getProperty("amazonsearchbutton_class"));
		test.log(LogStatus.PASS, "clicked on search option by using locator:" +subprop.getProperty("amazonsearchbutton_class"));
		
		report.endTest(test);
		report.flush();
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//driver.findElement(By.name("field-keywords")).sendKeys("harry");
		//driver.findElement(By.className("nav-input")).click();
		
		
		
		
	}

	

	
}

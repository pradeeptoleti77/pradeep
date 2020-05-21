package com.selenium.practise;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TC_005 extends BaseTest
{
	private static final Logger log=Logger.getLogger(TC_005.class);

	public static void main(String[] args) throws Exception 
	{
		//Verifications part
		
		init();
		openBrowser("chromebrowser");
		log.info( "Opening the browser:"+p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Openining the amazonurl:" +subprop.getProperty("amazonurl"));
		
		//String actuallink = driver.findElement(By.linkText("Customer Service")).getText();
		//String actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("tabindex");
		String actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String exceptedlink = "Customer Ser";
		
		System.out.println("Actual link is:" +actuallink);
		System.out.println("Excepted link is:" +exceptedlink);
		
		//if(actuallink.equals(exceptedlink))
		//if(actuallink.equalsIgnoreCase(exceptedlink))
			if(actuallink.contains(exceptedlink))
			System.out.println("Both links are equal");
		else
			System.out.println("Both are not equal");
		
		

	}

}

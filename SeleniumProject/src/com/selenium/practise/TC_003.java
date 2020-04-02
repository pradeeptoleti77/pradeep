package com.selenium.practise;

import org.openqa.selenium.By;

public class TC_003 extends BasicTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		openBrowser("chromebrowser");
		navigateUrl("iciciurl");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Wealth")).click();
		
		String d = driver.getCurrentUrl();
		System.out.println(d);
	}

}

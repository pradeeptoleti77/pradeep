package com.selenium.practise;

public class TC_001 extends BasicTest
{

	public static void main(String[] args) throws Exception  
	{
		init();
		
		openBrowser("chromebrowser");
		navigateUrl("iciciurl");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.close();
		driver.quit();
		
		
	}

	

	

}

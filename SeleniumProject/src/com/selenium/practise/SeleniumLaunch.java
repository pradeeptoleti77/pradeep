package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLaunch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Files\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}

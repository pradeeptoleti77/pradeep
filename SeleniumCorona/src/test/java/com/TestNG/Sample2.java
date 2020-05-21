package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample2 
{
  @Test(groups = {"regression"})
  public void f() 
  {
	 System.out.println("f"); 
  }
  @Test(groups = {"sanity"})
  public void c() 
  {
	 System.out.println("c"); 
  }
  
  @BeforeMethod(groups  = {"regression","sanity",})
  public void beforeMethod() 
  {
	  System.out.println("beforemethod"); 
  }

  @AfterMethod(groups  = {"regression","sanity"})
  public void afterMethod() 
  {
	  System.out.println("afterrmethod");   
  }

 

  
}

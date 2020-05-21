package com.TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample1 
{
  @Test(priority = 1)
  public void c() 
  {
	  System.out.println("c");
  }
  
  @Test(priority = 3,dependsOnMethods = {"b"})
  public void a() 
  {
	  System.out.println("a");
  }
  
  @Test(priority = 2,dependsOnMethods = {"c"})
  public void b() 
  {
	  System.out.println("b");
	  Assert.fail("b failed");
  }
}

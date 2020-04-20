package com.global.covid19;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;



public class TestDependency
{
  @Test(priority = 1)
  public void a() 
  {
	  System.out.println("i am from a");
  }
  
  @Test(priority = 2,dependsOnMethods = {"a"})
  public void b() 
  {
	  System.out.println("i am from b");  
  }
  
  
@Test(priority = 3,dependsOnMethods = {"b"})
  public void c() 
  {
	  System.out.println("i am from c");
	  //Assert.fail("c test is failed");
	 throw new SkipException("c test is skiped");
	 
  }
  
  @Test(priority = 4 ,dependsOnMethods = {"c"})
  public void d() 
  {
	  System.out.println("i am from d"); 
  }
}

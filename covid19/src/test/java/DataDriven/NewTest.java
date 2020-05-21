package DataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest 
{
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  System.out.println("i am f");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("i am before");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("i am after");
  }


  @DataProvider
  public Object[][] dp()
  {
	  System.out.println("i am provider");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}

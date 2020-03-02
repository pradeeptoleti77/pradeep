package com.careerbridge.java.practise;

public class MethodOver 
{
	  public void m1(int i) 
	  { 
		  System.out.println(i); 
	  }
	 
	  public void m1(float i) 
	  {
		  System.out.println(i);
	  }
	 
	public void m1(String i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		MethodOver obj=new MethodOver();
		obj.m1(200);
		obj.m1(23.6f);
		obj.m1("pradeep");
	}

}

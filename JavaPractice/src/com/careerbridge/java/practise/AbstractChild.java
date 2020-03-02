package com.careerbridge.java.practise;

public class AbstractChild extends Abstract
{

	public static void main(String[] args) 
	{
	AbstractChild ab=new AbstractChild();
		ab.m1();
		ab.m2();
	}
	
	  public void m1() 
	  { 
		  System.out.println("iam overriden m1 in child class"); 
	  }
	 
	

	@Override
	public void m2() 
	{
		System.out.println("i am overriden m2 in child class");
	}

}

package com.careerbridge.java.practise;

public abstract class Abstract 
{
	int x=12;
	int y=13,z;
	
	public void m1()
	{
		z=x+y;
		System.out.println("add of:"+z);
	}
	
	public abstract void m2();
	
	public static void main(String[] args)
	{
		//Abstract a= new Abstract();
	}

}

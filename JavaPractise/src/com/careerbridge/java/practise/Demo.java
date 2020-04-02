package com.careerbridge.java.practise;

public class Demo 
{
	int a=12,b=13;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println("add of a and b is:"+c);
		
	}
	public void sub()
	{
		c=a-b;
		System.out.println("sub of a and b is:"+c);
	}

	public static void main(String[] args)
	{
		//System.out.println("Hail");
		Demo d1=new Demo();
		d1.add();
		d1.sub();

	}

}

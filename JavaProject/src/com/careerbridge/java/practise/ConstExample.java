package com.careerbridge.java.practise;

public class ConstExample 
{
	int a,b,c;
	
	public ConstExample(int a, int b) 
	{
      this.a=a;
      this.b=b;
	}
	public void add()
	{
		c=a+b;
		System.out.println("addition of :"+c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("sub of:"+c);
	}

	public static void main(String[] args) 
	{
		ConstExample c=new ConstExample(12,10);
		c.add();
		c.sub();

	}

}

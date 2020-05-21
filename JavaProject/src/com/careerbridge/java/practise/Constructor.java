package com.careerbridge.java.practise;

public class Constructor 
{
	int a=68;
	public Constructor()
	{
		System.out.println("pradeep");
		
	}
	public Constructor(int a)
	{
		this();
		System.out.println("pradeepa");
	}

	public static void main(String[] args) 
	{
		Constructor c=new Constructor(6);
		System.out.println(c.a);
	}

}

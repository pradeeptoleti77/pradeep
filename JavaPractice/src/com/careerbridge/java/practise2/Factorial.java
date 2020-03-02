package com.careerbridge.java.practise2;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int n=5;
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

}

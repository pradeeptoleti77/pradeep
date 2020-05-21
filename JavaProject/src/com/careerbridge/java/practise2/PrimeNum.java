package com.careerbridge.java.practise2;

public class PrimeNum 
{
	public static void main(String[] args) 
	{
		int n=25;
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(i>n/2)
		{
			System.out.println("is a prime");
			
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}

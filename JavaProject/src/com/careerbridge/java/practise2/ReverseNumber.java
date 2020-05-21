package com.careerbridge.java.practise2;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int num=4567;
		int sum=0;
		while(num>0)
		{
			int t=num%10;
			sum=sum*10+t;
			num=num/10;
			
		}
		System.out.println("reverse number is:"+sum);
	}
}

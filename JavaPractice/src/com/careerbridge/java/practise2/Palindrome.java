package com.careerbridge.java.practise2;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int num=5665;
		int sum=0;
		int cp=sum;
		while(num>0)
		{
			int t=num%10;
			sum=sum*10+t;
			num=num/10;
		}
			if(cp==num)
			{
				System.out.println("is palindrome");
			}
			else
			{
				System.out.println("not");
			}
	}

}

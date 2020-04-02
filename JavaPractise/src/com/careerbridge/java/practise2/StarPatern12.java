package com.careerbridge.java.practise2;

public class StarPatern12 
{

	public static void main(String[] args) 
	{
		int n=5;
		int spc=n-1;
		int str=1;
		char ch='a';
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<spc;j++)
			{
				System.out.print(" "+" ");
				
			}
			for(int k=0;k<str;k++)
			{
				if(k%2==0)
				
					System.out.print(ch++ +" ");
				
				else
					System.out.print("*"+" ");
			}
			System.out.println();
			ch='a';
			spc--;
			str=str+2;
		}
				
	}

}

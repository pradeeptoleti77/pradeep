package com.careerbridge.java.practise2;

public class StarPatern5 
{

	public static void main(String[] args) 
	{
		int n=5;
		//int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==n/2||j==n-1&&i<=n/2)
				
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
			//a=1;
		}

	}

}

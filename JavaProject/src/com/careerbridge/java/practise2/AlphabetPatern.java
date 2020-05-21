package com.careerbridge.java.practise2;

public class AlphabetPatern 
{

	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
			ch++;
		}

	}

}

package com.careerbridge.java.practise;

import java.util.Scanner;

public class SampleCalculation1 
{
	public static void main(String[] args) 
	{
		
		float sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the elements:");
		int size=sc.nextInt();
		System.out.println("enter the marks of subjects:");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of 5 subjects marks is:"+sum);
		
		avg=sum/5;
		System.out.println("avg of 5 sub is:"+avg);
		
		System.out.println("your grade is");
		if(avg>85)
		{
			System.out.println("A Grade");
		}
		else if(avg>70 && avg<85)
		{
			System.out.println("B Grade");
		}
		else if(avg>55 && avg<70)
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("D Grade");
		}
	}

}

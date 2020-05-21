package com.careerbridge.java.practise;

import java.util.Scanner;

public class ScannerEx 
{
	public int scanner() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int asize=sc.nextInt();
		int sum=0;

		int[] a=new int[asize];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
	    {
		a[i]=sc.nextInt(); 
		System.out.println("a["+i+"]="+a[i]);
		sum=sum+a[i];
	    } 
		System.out.println("sum of marks: "+sum);
		return sum;
	}
		public static void main(String[] args) 
	{
		ScannerEx s=new ScannerEx();
		int count=s.scanner();
		System.out.println("out side is:"+count);
		
	}

}

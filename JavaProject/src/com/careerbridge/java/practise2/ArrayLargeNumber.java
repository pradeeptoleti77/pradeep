package com.careerbridge.java.practise2;

public class ArrayLargeNumber 
{

	public static void main(String[] args) 
	{
		int[] arr= {4,7,5,9,23,12};
		int large=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("large number in array is:"+large);
	}

}

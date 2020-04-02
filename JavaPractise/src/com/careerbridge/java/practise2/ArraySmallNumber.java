package com.careerbridge.java.practise2;

public class ArraySmallNumber 
{

	public static void main(String[] args) 
	{
		int[] arr= {12,32,25,4,23123,1121};
		int small=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			small=arr[i];
			
		}
		System.out.println("small number in array is:"+small);
	}

}

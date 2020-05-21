package com.careerbridge.java.practise;

public class ArrayDemo1 {

	public static void main(String[] args) 
	{
		
		int[] arr=new int[6];
		arr[0]=3;
		arr[1]=6;
		arr[2]=4;
		arr[3]=5;
		arr[4]=8;
		arr[5]=7;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}

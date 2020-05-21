package com.careerbridge.java.practise;

public class StringLength 
{

	public static void main(String[] args) 
	{
		String str="pradeep arifa puppy";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
				String s="";
				s=s+arr[i];
				
				System.out.println(s +"--->" +s.length());
			
		}
		

	}

	

}

package com.careerbridge.java.practise2;

public class StringSwap 
{
	//Swaping of two strings by using 2 variables
	public static void main(String[] args) 
	{
		String str1="pradeep";
		String str2="pavan";
		System.out.println("Before Swaping:");
		System.out.println(str1);
		System.out.println(str2);
		
		str1=str1+str2;
		System.out.println("print only str1:"+str1);
		str2=str1.substring(0,str1.length() - str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After swaaping:");
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}

}

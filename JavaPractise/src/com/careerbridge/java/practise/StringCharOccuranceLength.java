package com.careerbridge.java.practise;

public class StringCharOccuranceLength 
{

	public static void main(String[] args) 
	{
		String str="java selenium manual python";
		int s=str.length()-str.replace("a","").length();
		System.out.println(str +"="+s);
	}

}

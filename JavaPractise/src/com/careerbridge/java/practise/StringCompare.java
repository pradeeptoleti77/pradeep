package com.careerbridge.java.practise;

public class StringCompare 
{

	public static void main(String[] args) 
	{
		String str1="javaj2eehibernate";
		String str2="j2eehibernatajavaa";
		String str3="";
		
		  if(str1.length()!=str2.length()) 
		  {
		  System.out.println("length of strings is not equal");
		  }
		  else
		  {
			 System.out.println("length is equal");
		  }
		str3=str1+str1;
		if(str3.contains(str2))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("not matching");
		}
	}
	

}

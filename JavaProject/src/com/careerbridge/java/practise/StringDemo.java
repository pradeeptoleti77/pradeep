package com.careerbridge.java.practise;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String str="arifa";
		
		System.out.println(str);
		System.out.println(str.hashCode());
		
		String str1="puppy";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str=str+str1;
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println("==========================");

		StringBuffer s1=new StringBuffer("pradeep");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer s2=new StringBuffer("toleti");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		s1=s1.append(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s2=s2.append(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
	}

}

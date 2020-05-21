package com.careerbridge.java.practise2;

public class ArrayReverse 
{

	public static void main(String[] args) 
	{
		char[] ch= {'a','h','k','g','l','u'};
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		for(int i=0;i<ch.length;i++) 
		{
			System.out.println(ch[i]);
					
		}
	}

}

package com.java.collections;

public class StringWordLengthCount {

	public static void main(String[] args) 
	{
		String str="pokfdwjfj lkjlkdnjf lkjfklnfkjdhf";
		
		String[] s=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String st="";
			st=st+s[i];
			System.out.println(st);
		}
		
		
	}

}

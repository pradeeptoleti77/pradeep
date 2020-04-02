package com.careerbridge.java.practise;

public class StringRemoveSpace
{

	public static void main(String[] args) 
	{
		String str="pradeep arifa";
		char[] ch=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				str=str+ch[i];
			}
			
		}
			System.out.println(str);
			System.out.println("Length of string after removing space:"+str.length());
		
		
	}

}

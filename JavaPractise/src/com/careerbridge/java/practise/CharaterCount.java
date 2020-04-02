package com.careerbridge.java.practise;

public class CharaterCount
{
	public static void characterCount(String str)
	{
		
		//Create an character array of given string
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			String s="";
			
			//When the character is not space //Hello carrier
			while(i<ch.length && ch[i] != ' ') 
			{
				s=s+ch[i];
				i++;
			}
			
			if(s.length() > 0)
				System.out.println(s + "--->" + s.length());
		}
	}
	
	public static void main(String[] args) 
	{
		String str="Hello carrier";
		characterCount(str);
	}
	
}

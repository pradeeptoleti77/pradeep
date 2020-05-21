package com.careerbridge.java.practise;

public class StringPractice2 
{

	public static void main(String[] args) 
	{
		int index=0;
		
		String str="pradeep";
		char[] ch=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++)
		{
			int j;
			for( j=i+1;i<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}	
			}
			if(j==i)
			{
				ch[index++]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
				
	}

}

package com.careerbridge.java.practise2;

	public class AmstrongNum 
	{
		public static void main(String[] args) 
		{
			int num=123;
			int sum=0;
			int cp=num;
			while(num>0)
			{
				int t=num%10;
				sum=sum+(t*t*t);
				num=num/10;
			}
			if(cp==sum)
			{
				System.out.println("is amstrong");
				
			}
			else
				System.out.println("not a amstrong");
		}

}

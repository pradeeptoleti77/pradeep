package com.careerbridge.java.practise;

import java.util.Scanner;

/* Java Program Example - Make Calculator */

public class SampleCalculation 
{
	public static void main(String[] args) 
	{
		float a,b,c;
		char choice;
		
		
		do {
			System.out.println("1.addition");
			System.out.println("2.substraction");
			System.out.println("3.multi");
			System.out.println("4.div");
			System.out.println("5.exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice:");
			choice=sc.next().charAt(0);
					switch(choice)
					{
					case '1': System.out.println("enter two numbers");
						a=sc.nextFloat();
						b=sc.nextFloat();
						c=a+b;
						System.out.println("Result:"+c);
						break;
					case '2':System.out.println("enter two numbers");
						a=sc.nextFloat();
						b=sc.nextFloat();
						c=a-b;
						System.out.println("result is:"+c);
						break;
					case '3': System.out.println("enter two numbers");
						a=sc.nextFloat();
						b=sc.nextFloat();
						c=a*b;
						System.out.println("Result:"+c);
						break;
					case '4':System.out.println("enter two numbers");
						a=sc.nextFloat();
						b=sc.nextFloat();
						c=a/b;
						System.out.println("result is:"+c);
						break;
					case '5': System.exit(0);
						break;
					default :System.out.println("wwwrong choice");
						break;
					}
					System.out.println("------------------------");
		}
		while(choice !=5);
		
	}

}
package com.careerbridge.java.practise2;

public class Swaping {

	public static void main(String[] args) 
	{

      int a=10;
      int b=20;
      System.out.println("before swap:"+a+" "+b);
      
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("After swap:"+a+" "+b);

	}

}

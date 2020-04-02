package com.careerbridge.java.practise;

public class Hdfc implements Rbi
{
	
	public static void main(String[] args)
	{
		Hdfc h=new Hdfc();
		h.withdrawl();
		h.balenquiry();
		h.deposit();
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("i am overriden withdrawl in hdfc");
		
	}

	@Override
	public void deposit()
	{
		System.out.println("i am overriden deposit in hdfc");
		
		
	}

	@Override
	public void balenquiry() 
	{
		
		System.out.println("i am overriden balenquiry in hdfc");
		
	}

}

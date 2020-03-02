package com.careerbridge.java.practise;

public class Icici implements Rbi
{
	public static void main(String[] args) 
	{
		Icici i=new Icici();
		i.balenquiry();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {

		System.out.println("i am overriden  withdrawl in icici");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in icici");
		
		
	}

	@Override
	public void balenquiry() {
		System.out.println("i am overriden balenq in icic");
		
		
	}

}

package com.careerbridge.java.practise;

public interface Rbi 
{
	public abstract void  withdrawl();
	public void deposit();
	public void balenquiry();
	
	
	public static void main(String[] args) 
	{
		Rbi r =new Hdfc();
		r.balenquiry();
		r.deposit();
		r.withdrawl();
		
	}
}

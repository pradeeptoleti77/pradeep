package com.careerbridge.java.practise;

class Const
{
	int t=5;
	public Const()
	{

		System.out.println("arifa");
	}
	public Const(int a)
	{
		this();
		System.out.println("ammu");
	}
}
public class SuperConstructor extends Const
{
	
	public SuperConstructor(int a)
	{
		super(7);
		System.out.println("pradeep");
		
	}
	
	public static void main(String[] args) 
	{
		SuperConstructor s=new SuperConstructor(4);
		System.out.println(s.t);
	}

}

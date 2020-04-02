package com.careerbridge.java.practise;

public class PolyMorphism 
{
	int a=6;
	public void m1() 
	{
		System.out.println("pradeep");
		
	}
	public void m1(int a)
	{
		System.out.println("pradeepaa");
	}
	public void m1(int a,int b)
	{
		System.out.println("prathapam");
	}
	public void m1(String s)
	{
		System.out.println("arifa");
	}
	public static void main(String[] args) 
	{
		
		PolyMorphism p=new PolyMorphism();
		p.m1();
		p.m1(5);
		p.m1("ar");
		p.m1(1, 2);
		System.out.println(p.a);
		
	}

}

package com.java.collections;

import java.util.ArrayList;

public class ListExample
{
	//Duplicates are allowed
	//insertion order is preserved

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(20);
		a.add("pradeep");
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.get(1));
		a.add(50);
		System.out.println(a);
		
		a.add(2, "arifa");
		System.out.println(a);
		
		a.set(3, "puppy");
		a.remove(0);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains("pradeep"));
		System.out.println(a.indexOf("arifa"));
		System.out.println(a.size());
		
		a.clear();
		System.out.println(a);
		
		
		
		
	}

}

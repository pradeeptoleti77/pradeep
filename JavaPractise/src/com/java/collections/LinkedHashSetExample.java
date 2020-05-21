package com.java.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	

	public static void main(String[] args) 
	{
		// Insertion order is preserved
		//Duplicates or not allowed
	
		LinkedHashSet<Object> l=new LinkedHashSet();
		l.add(49);
		l.add(89);
		l.add(45);
		l.add(89);
		System.out.println(l);
		
		

	}

}

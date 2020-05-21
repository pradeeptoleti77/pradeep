package com.java.collections;

import java.util.HashSet;

public class SetExample 
{      
	//Insertion order is not reserved
	//Duplicates or not allowed

	public static void main(String[] args) 
	{
		HashSet<Object> h= new HashSet<>();
		h.add(10);
		h.add(30);
		h.add(50);
		h.add(40);
		h.add(30);
		System.out.println(h);
		
	}

}

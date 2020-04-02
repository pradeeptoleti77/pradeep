package com.careerbridge.java.practise;

class MethodOveriding 
{

	public void m1() 
	{
		System.out.println("pradeep");
		
	}
	public void m2()
	{
		System.out.println("aaaaaaaaaarifa");
		
	}
}
	public class Method extends MethodOveriding
	 {
		public void m3()
		 {
			 System.out.println("prathapam");
		 }

	
	  public void m1() { System.out.println("pradeeeepa");
	  
	  }
	 
	public static void main(String[] args) 
	{
		Method obj=new Method();
		obj.m1();
		obj.m2();
		obj.m3();

	}

	}

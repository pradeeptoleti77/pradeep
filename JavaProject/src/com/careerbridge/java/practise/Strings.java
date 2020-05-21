package com.careerbridge.java.practise;

public class Strings 
{

	public static void main(String[] args) 
	{
		 String str="pradeep";
		 
		 System.out.println(str);
		 System.out.println(str.hashCode());
		 System.out.println(str.length());
		 System.out.println(str.isEmpty());
		 System.out.println(str.charAt(3));
		 System.out.println(str.indexOf('p'));
		 System.out.println("=========================");
		 
		 String str2=new String("Pradeep");
		 
		 System.out.println(str2.charAt(3));
		 System.out.println(str2.equals(str));
		 System.out.println(str2.equalsIgnoreCase(str));
		 System.out.println(str2.contains("ade"));
		 System.out.println("==========================");
		 
		 System.out.println(str2);
		 System.out.println(str2.toLowerCase());
		 System.out.println(str2.toLowerCase().equals(str));
		 System.out.println(str2.equals(str));
		 System.out.println("==========================");
		 
		 System.out.println(str2.startsWith("Prad"));
		 System.out.println(str2.endsWith("ep"));
		 System.out.println("==========================");
		 
		 System.out.println(str2.substring(3,6 ));
		 System.out.println(str2.replace(str2, "Arifa"));
		 System.out.println("==========================");
		 
		 System.out.println(str2.concat(str));
		 System.out.println(str2+str);
		 System.out.println("==========================");
		 
		 String str1=" pradeep";
		 System.out.println(str1);
		 System.out.println(str1.trim());
		 System.out.println(str1.trim().equals(str2.toLowerCase()));
		 System.out.println(str2.replace('d', 'f'));
		 
	}

}

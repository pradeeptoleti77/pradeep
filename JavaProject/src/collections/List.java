package collections;

import java.util.ArrayList;

public class List 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> l=new ArrayList<>();
		l.add("pradeep");
		l.add(10);
		l.add("arifa");
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.hashCode());
		System.out.println(l.contains("pradeep"));
		System.out.println(l.indexOf("arifa"));
		
		l.add(50);
		System.out.println(l);
		
		l.add(2, "prathap");
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		l.remove("arifa");
		System.out.println(l);
		
		l.clear();
		System.out.println(l);




	}

}

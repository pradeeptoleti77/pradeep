package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorsEx 
{

	public static void main(String[] args) 
	{
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 
			 a.add(12);
			 a.add(2);
			 a.add(34);
			 a.add(45);
		 System.out.println(a);
		 
		 ListIterator<Integer> l=a.listIterator();
		 while(l.hasNext())
		 {
			 Integer val= l.next();
			 if(val.equals(34))
				 l.remove();
			 else
				 l.add(23);
				 
				 
		 }
	}

}

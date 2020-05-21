package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<=10;i++)
			a.add(i);
		System.out.println(a);
		
		Iterator<Integer> t=a.iterator();
		while(t.hasNext())
		{
			Integer val=t.next();
			if(val%2==0)
				System.out.println(val);
			else
				t.remove();
		}
	}

}

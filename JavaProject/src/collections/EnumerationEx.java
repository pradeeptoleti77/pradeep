package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		for(int i=0;i<=10;i++)
		
			v.add(i);
			System.out.println(v);
			
			Enumeration<Integer> v1=v.elements();
			while(v1.hasMoreElements())
			{
				Integer val=v1.nextElement();
				if(val%2==0)
					System.out.println(val);
				
				
					
			}
			System.out.println(v);
		
		
	}

}

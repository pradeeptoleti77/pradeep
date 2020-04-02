package collections;

import java.util.HashMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> h=new HashMap<>();
		h.put(0, 23);
		h.put(1, 32);
		h.put(2, 4);
		System.out.println(h);
	}

}

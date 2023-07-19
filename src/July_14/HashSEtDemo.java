package July_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSEtDemo {

	public static void main(String[] args) 
	{

		HashSet<Integer> a= new HashSet();
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(44);
		a.add(33);
		a.add(11);
		a.add(44);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		
		
		
		a.remove(null);
		System.out.println(a);
		
//		Iterator i = a.iterator();
//
//		while(i.hasNext())
//		{
//			System.out.println(i.next().toString());
//		}

		
		
//		for(Object e : a)
//		{
//			System.out.println(e);
//		}
	}

}

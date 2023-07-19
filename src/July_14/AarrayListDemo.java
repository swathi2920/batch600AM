package July_14;

import java.util.ArrayList;
import java.util.Iterator;

public class AarrayListDemo 
{
	public static void main(String[] args) {

		ArrayList a = new ArrayList(3);
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(22);
		a.add(4);
		a.add("aaa");
		a.add(7.7);
		a.add(null);
		a.add(4);
		System.out.println(a);
		
		a.add(1, 88);
		System.out.println(a);
		
		a.remove(7.7);
		System.out.println(a);
		System.out.println("count = " +a.size());
		
		Iterator i = a.iterator();
	     
//		while(i.hasNext())
//		{
//			//System.out.println(i.next().toString());
//			System.out.println(i.next());
//		}

		for(Object e: a)
		{
			System.out.println(e);
		}
	}

}

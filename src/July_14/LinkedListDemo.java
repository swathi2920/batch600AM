package July_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args)
	{

		LinkedList<Integer> a= new LinkedList();

		boolean status = a.isEmpty();
		System.out.println(status);
		System.out.println(a);
		
		a.add(22);
		a.add(66);
		a.add(33);
		//a.add(null);
		a.add(22);
		System.out.println(a);
		
		a.add(1,44);
		System.out.println(a);
		
		System.out.println(a.size());
		
		ListIterator i = a.listIterator();
		 while(i.hasNext())
		 {
			System.out.println(i.next().toString());
		 }
		 System.out.println("=============");
		 while(i.hasPrevious())
		 {
			System.out.println(i.previous());
		 }
	}

}

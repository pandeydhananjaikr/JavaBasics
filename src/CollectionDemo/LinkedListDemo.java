package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Bhanu");
		ll.add("Dhananjai");
		ll.add("Shaktiman");
		
		System.out.println(ll);
		System.out.println(ll.contains("Shaktiman"));
		ll.addFirst("a");
		ll.addLast("z");
		System.out.println(ll);
		System.out.println("*****************");

		Iterator itr = ll.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*****************");

		
		ListIterator ltr = ll.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
			
		}
		System.out.println("*****************");
		
		ll.removeFirstOccurrence("a");
		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
	
	}
}

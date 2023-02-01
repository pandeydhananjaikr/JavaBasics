package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		ArrayList <Integer> alist = new ArrayList<>();
		alist.add(12);
		alist.add(10);
		alist.add(19);
		alist.add(30);
	
		System.out.println(alist);
		System.out.println(alist.indexOf(10));
		System.out.println(alist.get(2));
		alist.set(2, 50);
		System.out.println(alist.get(2));
		alist.remove(alist.indexOf(50));
		System.out.println(alist.get(alist.size()-1));
		
		System.out.println("*******************");
		
		ArrayList <Integer> blist = new ArrayList<>();
		Iterator bitr = blist.iterator();
		System.out.println(bitr.hasNext());
	
		System.out.println("*******************");

		Iterator itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());	
		}

		System.out.println("*******************");

		ArrayList<Integer> newList = new ArrayList<>();
		newList.addAll(alist);
		System.out.println(newList);

	
	
	
	
	
	}
}

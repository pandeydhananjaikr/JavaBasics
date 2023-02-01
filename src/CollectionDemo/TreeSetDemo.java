package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	
	TreeSet<Integer> ts = new TreeSet<>();
	ts.add(20);
	ts.add(10);
	ts.add(10);
	ts.add(5);
	ts.add(50);
	System.out.println(ts);
		
	System.out.println("******************");
	
	int arr[] = {5,4,3,6,66,77,66,23,5,3,90};
	
	TreeSet<Integer> ts1 = new TreeSet<>();
	
	for (int i = 0; i < arr.length; i++) {
		ts1.add(arr[i]);
	}
	System.out.println(ts1);
	
	
	
	
	}
}

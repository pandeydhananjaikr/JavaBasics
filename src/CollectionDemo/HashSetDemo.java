package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashSetDemo {
	public static void main(String[] args) {
	
		HashSet<Integer> hset = new HashSet<>();
		
		hset.add(12);
		hset.add(10);
		hset.add(30);
		hset.add(30);
		hset.add(30);
		hset.add(50);
		
		System.out.println(hset);
		
		
		LinkedHashSet<Integer> llh = new LinkedHashSet<>();
		llh.add(10);
		llh.add(20);
		llh.add(30);
		llh.add(40);
		llh.add(40);
		
		System.out.println(llh);
		
		
		
		
		
		
	
	}
}

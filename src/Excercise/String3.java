package Excercise;

import java.util.*;

public class String3 {
    public static void main(String[] args) {
        int[] intarray = {8, 3, 5, 4, 2, 9,10};
        Set<Integer> intset = new TreeSet<>();
        for (int i = 0; i < intarray.length; i++) {
            intset.add(intarray[i]);
        }
        List<Integer> intlist = new ArrayList<>(intset);
        System.out.println(intlist.get(intlist.size() - 2));

        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(13);
        set1.add(14);
        set1.add(15);

        List<Integer> list1 =  new LinkedList<>(set1);
        System.out.println(list1);




    }
}

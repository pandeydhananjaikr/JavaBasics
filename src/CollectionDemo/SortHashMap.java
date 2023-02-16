package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 2);
        numbers.put("Two", 3);
        numbers.put("Three", 1);

        ArrayList<Integer> list1 = new ArrayList<>();


        int[] array1 = new int[numbers.size()];
//        for (Map.Entry<String, Integer> hmap : numbers.entrySet()) {
//            list1.add(hmap.getValue());
//        }

        for (int value : numbers.keySet()) {

        }

        Collections.sort(list1);
        System.out.println(list1.get(list1.size()-1));

    }
}

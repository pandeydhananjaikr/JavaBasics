package Excercise;

import java.util.ArrayList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 3, 6, 7, 3, 5, 8};
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                arrList.add(i);
            }
        }
        System.out.println("The first occurrence index is : " + arrList.get(0) +
                " And the last occurrence index is: " + arrList.get(arrList.size() - 1));
    }
}

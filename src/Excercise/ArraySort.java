package Excercise;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int a;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}

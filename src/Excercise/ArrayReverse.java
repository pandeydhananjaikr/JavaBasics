// Hor far a 2 from 1
package Excercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = new int[arr1.length];
        int j = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[j] = arr1[i];
            j++;
        }

        System.out.println(Arrays.equals(arr2, arr1));
    }
}

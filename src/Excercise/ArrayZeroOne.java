package Excercise;

import javax.swing.*;
import java.util.Arrays;

public class ArrayZeroOne {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int[] arr2 = new int[arr1.length];
        int c1=0;
        int c2= arr2.length-1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr2[c1] = 0;
                c1++;

            } else if (arr1[i] == 1) {
                arr2[c2] = 1;
                c2--;
            }
        }
            System.out.print(Arrays.toString(arr2));
    }
}

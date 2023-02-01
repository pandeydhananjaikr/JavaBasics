package Excercise;

import java.util.*;

public class PrefixArray
        {
            public static void main(String[] args) {
                String[] arr1 = {"flower","flow","floqwer","floasdfgh","flozxcmj" };

                Arrays.sort(arr1, Comparator.comparing(String::length));

                for (String c : arr1) {
                    System.out.println(c);
                }





    }
}

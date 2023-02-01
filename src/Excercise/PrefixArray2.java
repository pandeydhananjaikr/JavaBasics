package Excercise;

import java.util.Arrays;
import java.util.Comparator;
public class PrefixArray2 {
    public static void main(String[] args) {
        String[] arr1 = {"flower", "flow", "floqwer", "floasdfgh", "flozxcmj"};

        Arrays.sort(arr1, Comparator.comparing(String::length));
//      arr1 = { "flow","flower", "floqwer", "flozxcmj","floasdfgh"}
        String str = arr1[0];
        String prefix = "";

        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (arr1[i].charAt(j) == str.charAt(j)) {
                    prefix = prefix + str.charAt(j);
                } else {
                    break;
                }
            }
        }
        System.out.println(prefix);








    }
}

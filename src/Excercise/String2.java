package Excercise;

import java.util.LinkedHashSet;

public class String2 {
    public static void main(String[] args) {
        String s = "dhonij";

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i')
                    || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
                System.out.println("The String has Vowel");
                break;
            }
        }
    }
}
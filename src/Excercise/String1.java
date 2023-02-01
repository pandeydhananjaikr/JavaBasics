package Excercise;

import java.util.LinkedHashSet;

public class String1 {
    public static void main(String[] args) {
        String s = "b1h2j31&!&*@#*nfjnj32n4jknx32fjdjdksnf";
        System.out.println("The original String : "+s);
        String s1 = s.replaceAll("[^a-zA-Z]", "");
        System.out.println("After removing all the special symbols and numbers : "+s1);
        LinkedHashSet<Character> lset = new LinkedHashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            lset.add(s1.charAt(i));
        }

        System.out.print("After deleting repeated characters :");
        for (Character c : lset) {
            System.out.print(c);
        }
    }
}

package Excercise;

public class RevStr {
    public static void main(String[] args) {
        String s = "Dhananjai";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
           ns = ns+ s.charAt(s.length()-1-i);
           // System.out.print(s.charAt(s.length()-1-i));
        }
        System.out.println(ns);
    }
}


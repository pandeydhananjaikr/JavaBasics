package Excercise;

public class Palindrome {

    public static void pldrm(String s) {
        String s1 = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean bool = true;
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }
        System.out.println(bool);
    }

    public static void main(String[] args) {
         String s = "A man, a plan, 5435 a canal: Panama";
     //   String s = "naman";
        pldrm(s);
    }
}


